package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBUtil {
	
	public static Connection getDBConnection() {
		Connection conn = null;
		//STEP1
		try {
			//step1
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step2
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hex_db", "root", "Nafisa_08");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

}
