package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import crud.DBUtil;

public class Jdbc_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		//STEP1
		try {
			conn = DBUtil.getDBConnection();
			String insert = "insert into Employees(eid,ename,salary,job) values(112,'Don',70000,'MD')";
			Statement st = conn.createStatement();
			int count = st.executeUpdate(insert);
			System.out.println(count + " records effected");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
