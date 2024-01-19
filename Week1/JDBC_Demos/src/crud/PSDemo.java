package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PSDemo {

	public static void main(String[] args) {
		
		Connection conn = DBUtil.getDBConnection();
		
		//Insert
		
//		String insert = "insert into Dept values(?,?,?)";
//		
//		try {
//			PreparedStatement pst = conn.prepareStatement(insert);
//			
//			pst.setInt(1, 70);
//			pst.setString(2, "Logistics" );
//			pst.setString(3, "Noida");
//			
//			int count = pst.executeUpdate();
//			System.out.println(count + " rows inserted");
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		//Update
		
//		String update = "UPDATE Dept SET DName = ?, location = ? WHERE DNo = ?";
//		
//		try {
//			PreparedStatement pst = conn.prepareStatement(update);
//			
//			pst.setString(1, "Tours & Travels");
//			pst.setString(2, "Greater Noide");
//			pst.setInt(3, 70);
//			
//			int count = pst.executeUpdate();
//			System.out.println(count + " rows updated");
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		//Select By ID
		
//		String selectById = "SELECT DNo, DName, location FROM Dept WHERE DNo = ?";
//		
//		try {
//			PreparedStatement pst = conn.prepareStatement(selectById);
//			
//			pst.setInt(1, 10);
//			
//			ResultSet rs = pst.executeQuery();
//			
//			while(rs.next()) {
//				
//				System.out.println(rs.getInt("DNo") + " " + rs.getString("DName") + " " + rs.getString("Location"));
//			}
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		//Select All
		
//		String selectAll = "SELECT DNO, DName, Location FROM Dept";
//		
//		try {
//			PreparedStatement pst = conn.prepareStatement(selectAll);
//			
//			ResultSet rs = pst.executeQuery();
//			
//			while(rs.next()) {
//			
//				System.out.println(rs.getInt("DNo") + " " + rs.getString("DName") + " " + rs.getString("Location"));
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		//Delete
		String delete = "DELETE FROM Dept WHERE DNo = ?";
		
		try {
			PreparedStatement pst = conn.prepareStatement(delete);
			
			pst.setInt(1, 70);
			
			int count = pst.executeUpdate();
			
			System.out.println(count + " rows deleted");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
