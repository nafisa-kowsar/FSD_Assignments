package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Dept;

public class DeptDaoImp implements IDeptDao{
	
	Connection conn = null;
	
	public DeptDaoImp() {
		conn = DBUtil.getDBConnection();
	}

	@Override
	public int insertDept(Dept dept) {
		// TODO Auto-generated method stub
		String insert = "insert into Dept values(?,?,?)";
		
		int count = 0;
		
		try {
			PreparedStatement pst = conn.prepareStatement(insert);
			
			pst.setInt(1, dept.getDno());
			pst.setString(2, dept.getDname() );
			pst.setString(3, dept.getLocation());
			
			count = pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
//		CallableStatement cstmt = null;
//		try {
//			cstmt = conn.prepareCall("{call myinsert()}");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			cstmt.execute();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}

	@Override
	public int updateDept(Dept dept) {
		String update = "UPDATE Dept SET DName = ?, location = ? WHERE DNo = ?";
		
		int count = 0;
		
		try {
			PreparedStatement pst = conn.prepareStatement(update);
			
			pst.setString(1, dept.getDname());
			pst.setString(2, dept.getLocation());
			pst.setInt(3, dept.getDno());
			
			count = pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return count;
	}

	@Override
	public int deleteOne(int dno) {
		String delete = "DELETE FROM Dept WHERE DNo = ?";
		
		int count =0;
		
		try {
			PreparedStatement pst = conn.prepareStatement(delete);
			
			pst.setInt(1, dno);
			
			count = pst.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public Dept selectOne(int dno) {
		String selectById = "SELECT DNo, DName, location FROM Dept WHERE DNo = ?";
		
		Dept dept = new Dept();
		
		try {
			PreparedStatement pst = conn.prepareStatement(selectById);
			
			pst.setInt(1, dno);
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				
				dept.setDno(rs.getInt("dno"));
				dept.setDname(rs.getString("dname"));
				dept.setLocation(rs.getString("location"));
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dept;
	}

	@Override
	public List<Dept> selectAll() {
		String selectAll = "SELECT DNO, DName, Location FROM Dept";
		
		List<Dept> list = new ArrayList<Dept>();
		
		try {
			PreparedStatement pst = conn.prepareStatement(selectAll);
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				
				Dept dept = new Dept(rs.getInt("dno"),rs.getString("dname"), rs.getString("location"));
				list.add(dept);
			
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
