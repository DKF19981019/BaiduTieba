/*
 * User_Message.java
 *
 * Created on __DATE__, __TIME__
 */

package jiemian;

import java.io.File;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

import database.ModelFactory;
import database.Users;

/**
 *
 * @author  __USER__
 */
public class User_Message extends javax.swing.JFrame {

	private Users player;

	/** Creates new form User_Message */
	public User_Message(Users player2) {
		player = player2;
		initComponents();
		this.jTextField1.setText(String.valueOf(player.getUsId()));
		this.jTextField2.setText(player.getUsName());
		this.jTextField3.setText(String.valueOf(player.getUsScore()));
		this.jTextField4.setText(player.getUsState());
		this.setLocationRelativeTo(null);
	}

	public User_Message() {
		initComponents();
		this.setLocationRelativeTo(null);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		imageJpanel1 = new jiemian.ImageJpanel();
		jLabel1 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jButton2 = new javax.swing.JButton();
		jTextField1 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jTextField3 = new javax.swing.JTextField();
		jTextField4 = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		imageJpanel1.setBackground(new java.awt.Color(255, 255, 255));

		jLabel1.setFont(new java.awt.Font("�ֶ�С������ W02", 1, 48));
		jLabel1.setText("\u6211\u7684\u8d44\u6599");

		jButton1.setText("\u5934\u50cf");
		jButton1.setContentAreaFilled(false);
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel2.setFont(new java.awt.Font("΢���ź�", 0, 18));
		jLabel2.setForeground(new java.awt.Color(0, 204, 204));
		jLabel2.setText("\u7528\u6237ID");

		jLabel3.setFont(new java.awt.Font("΢���ź�", 0, 18));
		jLabel3.setForeground(new java.awt.Color(0, 204, 204));
		jLabel3.setText("\u6635\u79f0");

		jLabel4.setFont(new java.awt.Font("΢���ź�", 0, 18));
		jLabel4.setForeground(new java.awt.Color(0, 204, 204));
		jLabel4.setText("\u7528\u6237\u79ef\u5206");

		jLabel5.setFont(new java.awt.Font("΢���ź�", 0, 18));
		jLabel5.setForeground(new java.awt.Color(0, 204, 204));
		jLabel5.setText("\u4e2a\u6027\u7b7e\u540d");

		jButton2.setBackground(new java.awt.Color(55, 133, 249));
		jButton2.setFont(new java.awt.Font("΢���ź�", 0, 18));
		jButton2.setForeground(new java.awt.Color(255, 255, 255));
		jButton2.setText("\u4fdd\u5b58\u4fe1\u606f");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jTextField1.setBorder(null);

		jTextField3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField3ActionPerformed(evt);
			}
		});

		jTextField4.setBorder(null);

		javax.swing.GroupLayout imageJpanel1Layout = new javax.swing.GroupLayout(
				imageJpanel1);
		imageJpanel1.setLayout(imageJpanel1Layout);
		imageJpanel1Layout
				.setHorizontalGroup(imageJpanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								imageJpanel1Layout
										.createSequentialGroup()
										.addGroup(
												imageJpanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																imageJpanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				229,
																				229,
																				229)
																		.addComponent(
																				jLabel1))
														.addGroup(
																imageJpanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				272,
																				272,
																				272)
																		.addComponent(
																				jButton1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				110,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGap(256, 256, 256))
						.addGroup(
								imageJpanel1Layout
										.createSequentialGroup()
										.addGap(104, 104, 104)
										.addGroup(
												imageJpanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																imageJpanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel5)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jTextField4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				319,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																imageJpanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				imageJpanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel4)
																						.addComponent(
																								jLabel3)
																						.addComponent(
																								jLabel2))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				imageJpanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jTextField2,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								320,
																								Short.MAX_VALUE)
																						.addComponent(
																								jTextField3,
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								320,
																								Short.MAX_VALUE)
																						.addComponent(
																								jTextField1,
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								320,
																								Short.MAX_VALUE))))
										.addGap(188, 188, 188))
						.addGroup(
								imageJpanel1Layout
										.createSequentialGroup()
										.addGap(275, 275, 275)
										.addComponent(
												jButton2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												126,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(288, Short.MAX_VALUE)));
		imageJpanel1Layout
				.setVerticalGroup(imageJpanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								imageJpanel1Layout
										.createSequentialGroup()
										.addComponent(
												jLabel1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												76,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jButton1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												101,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(42, 42, 42)
										.addGroup(
												imageJpanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel2)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																36,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(43, 43, 43)
										.addGroup(
												imageJpanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel3)
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																36,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(41, 41, 41)
										.addGroup(
												imageJpanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel4)
														.addComponent(
																jTextField3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																36,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(42, 42, 42)
										.addGroup(
												imageJpanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jTextField4,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																36,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel5))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												77, Short.MAX_VALUE)
										.addComponent(
												jButton2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												41,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(46, 46, 46)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				imageJpanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				imageJpanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String usName = jTextField2.getText();
		String usState = jTextField4.getText();
		try {
			ModelFactory.updatePlayer(usName, usState);
			player = ModelFactory.login(player.getUsNo(), player.getUsPwd());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.jTextField1.setText(String.valueOf(player.getUsId()));
		this.jTextField2.setText(player.getUsName());
		this.jTextField3.setText(String.valueOf(player.getUsScore()));
		this.jTextField4.setText(player.getUsState());
	}

	private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		//����Ϊ�����滻ͷ�񷽷��������ʵ�ִ����ݿ��ɾ����(�� �㧥 ��;)��
		JFileChooser jfc = new JFileChooser();
		jfc.showOpenDialog(this);
		File f = jfc.getSelectedFile();
		this.jButton1.setIcon(new ImageIcon(f.getAbsolutePath()));
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new User_Message().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private jiemian.ImageJpanel imageJpanel1;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	// End of variables declaration//GEN-END:variables

}