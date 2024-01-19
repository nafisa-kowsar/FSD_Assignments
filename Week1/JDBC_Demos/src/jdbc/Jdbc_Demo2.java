package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import crud.DBUtil;

public class Jdbc_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		
		try {
			
			con = DBUtil.getDBConnection();
			String query = "INSERT INTO Dept VALUES(60, 'Marketing', 'Chennai')";
			Statement st =  con.createStatement();
			int count = st.executeUpdate(query);
			System.out.println(count + " rows updated");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
