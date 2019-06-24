package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataConnect {
	private static Statement stat;

	protected static void init() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/MySql?user=root&password=19981019";
		Connection con = DriverManager.getConnection(url);
		stat = con.createStatement();
		url = "use tieba";
		stat.executeUpdate(url);
		System.out.println("OK");
		//连接数据库
	}
	
	public static Statement getStat() throws ClassNotFoundException, SQLException{
		if(stat==null){
			init();
		}
		return stat;
		
		//使用数据库语句
	}

}
