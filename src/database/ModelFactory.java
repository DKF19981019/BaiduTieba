package database;

import java.applet.Applet;

import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.swing.JOptionPane;

public class ModelFactory {

	    public static Users login(String name,String password) throws SQLException, ClassNotFoundException{	
	    	//��¼
	    	Users player = null;
			String sql = "select * from users where usNo ='"+name+"' and usPwd='"+password+"'";
			ResultSet rs = DataConnect.getStat().executeQuery(sql);
			if(rs.next()){
				player = new Users(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7));
			}
			return player;
		}
	    
		public static Users register(String usNo,String usPwd,String usName) throws SQLException, ClassNotFoundException{
			//ע��
			Users player2 = null;
			String sql = "insert into users(usNo,usPwd,usName) value('"+usNo+"','"+usPwd+"','"+usName+"')";
			int rs = DataConnect.getStat().executeUpdate(sql);
			sql = "select * from users where usNo ='"+usNo+"'";
			ResultSet rs2 = DataConnect.getStat().executeQuery(sql);
			if(rs2.next()){
				player2 = new Users(rs2.getInt(1),rs2.getString(2),rs2.getString(3),rs2.getString(4),rs2.getString(5),rs2.getString(6),rs2.getInt(7));
			}
			return player2;
			
		}
		
		public static void FaTie(String tipTitle,String tipContext,int userid) throws SQLException, ClassNotFoundException{
			//����
			String tipTime = null;
			 Date date = new Date();
			 DateFormat df = DateFormat.getDateTimeInstance();
		     tipTime = df.format(date);
			String sql = "insert into tip(tipTitle,tipContext,tipTime,userid) value('"+tipTitle+"','"+tipContext+"','"+tipTime+"',"+userid+")";
			int rs = DataConnect.getStat().executeUpdate(sql);
			JOptionPane.showMessageDialog(null, "�����ɹ���");
		}
		
		public static void updatePlayer(String usName,String usState) throws SQLException, ClassNotFoundException{
			//���¸�����Ϣ
			String sql = "update users set usName = '"+usName+"',usState = '"+usState+"'";
			int rs = DataConnect.getStat().executeUpdate(sql);
			JOptionPane.showMessageDialog(null, "�޸ĳɹ�!");
		}
		 public static Tip chatie(int tipId) throws SQLException, ClassNotFoundException{	
		    	//��ѯ����
		    	Tip tip = null;
				String sql = "select * from tip where tipId ="+tipId;
				ResultSet rs = DataConnect.getStat().executeQuery(sql);
				if(rs.next()){
					tip = new Tip(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6));
				}
				return tip;
			}
		 public static String chaWritor(int userid) throws SQLException, ClassNotFoundException{	
		    	//��ѯʹ��������
		    	String name = null;
				String sql = "select * from users where usId ="+userid;
				ResultSet rs = DataConnect.getStat().executeQuery(sql);
				if(rs.next()){
					name = rs.getString(4);
				}
				return name;
			}
		 public static int chaJifen(int userid) throws SQLException, ClassNotFoundException{	
		    	//��ѯ���ӻ���
		    	int name = 0;
				String sql = "select * from users where usId ="+userid;
				ResultSet rs = DataConnect.getStat().executeQuery(sql);
				if(rs.next()){
					name = rs.getInt(7);
				}
				return name;
			}
		 public static void setJifen(int usId) throws SQLException, ClassNotFoundException{
				//ǩ�����ӻ���
			 int usScore = chaJifen(usId)+50;
				String sql = "update users set usScore = "+usScore+" where usId = "+usId;
				int rs = DataConnect.getStat().executeUpdate(sql);
				
			}
		 
		 public static int chaTipIDMax() throws SQLException, ClassNotFoundException{	
		    	//��ѯ�������ӱ��
		    	int name = 0;
				String sql = "select * from tip where tipId=(select max(tipId) from tip)";
				ResultSet rs = DataConnect.getStat().executeQuery(sql);
				if(rs.next()){
					name = rs.getInt(1);
				}
				return name;
			}
		 
		 public static void HuiFu(String repContent,int tipID,int repleyWritorID) throws SQLException, ClassNotFoundException{
				//����
				String tipTime = null;
				 Date date = new Date();
				 DateFormat df = DateFormat.getDateTimeInstance();
			     tipTime = df.format(date);
			     
				String sql = "insert into replay(repContent,repTime,tipId,usId) value('"+repContent+"','"+tipTime+"',"+tipID+","+repleyWritorID+")";
				int rs = DataConnect.getStat().executeUpdate(sql);
				JOptionPane.showMessageDialog(null, "�ظ��ɹ���");
			}
		 public static int chaReplayIDMax(int tipID) throws SQLException, ClassNotFoundException{	
		    	//��ѯ���Ļظ����
		    	int name = 0;
		    	String sql = "select * from replay where repid =(select max(repid) from replay where tipId ="+tipID+")";
				ResultSet rs = DataConnect.getStat().executeQuery(sql);
				if(rs.next()){
					name = rs.getInt(1);
				}
				return name;
			}
		 public static int chaReplayIDMin(int tipID) throws SQLException, ClassNotFoundException{	
		    	//��ѯ��С�Ļظ����
		    	int name = 0;
				String sql = "select * from replay where repid =(select min(repid) from replay where tipId ="+tipID+")";
				ResultSet rs = DataConnect.getStat().executeQuery(sql);
				if(rs.next()){
					name = rs.getInt(1);
				}
				return name;
			}
	
		 public static Replay chaHuifu(int replayId) throws SQLException, ClassNotFoundException{	
		    	//��ѯ�ظ�
		    	Replay tip = null;
				String sql = "select * from replay where repid ="+replayId;
				ResultSet rs = DataConnect.getStat().executeQuery(sql);
				if(rs.next()){
					tip = new Replay(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5));
				}
				return tip;
			}
		 public static int chaReplayTipID(int replayID) throws SQLException, ClassNotFoundException{	
		    	//���ظ�id������id
		    	int name = 0;
				String sql = "select * from replay where repid ="+replayID;
				ResultSet rs = DataConnect.getStat().executeQuery(sql);
				if(rs.next()){
					name = rs.getInt(4);
				}
				return name;
			}
		
}
