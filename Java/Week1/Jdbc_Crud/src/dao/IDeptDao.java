package dao;

import java.util.List;

import entity.Dept;

public interface IDeptDao {
	
	public int insertDept(Dept dept);
	public int updateDept(Dept dept);
	
	public int deleteOne(int dno);
	public Dept selectOne(int dno);
	
	public List<Dept> selectAll();
	

}
