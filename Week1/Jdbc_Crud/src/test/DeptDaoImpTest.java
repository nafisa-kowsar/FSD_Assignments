package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import dao.DeptDaoImp;
import dao.IDeptDao;
import entity.Dept;

class DeptDaoImpTest {
	
	static IDeptDao dao;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		dao = new DeptDaoImp();
	}


	@Test
	@Disabled
	void testInsertDept() {
		Dept dept = new Dept();
		
		dept.setDno(110);
		dept.setDname("Charatee");
		dept.setLocation("");
		
		int actual = dao.insertDept(dept);
		assertEquals(1,actual);
		
	}

	@Test
	void testUpdateDept() {
		Dept dept = new Dept();
		
		dept.setDno(110);
		dept.setDname("Finance");
		dept.setLocation("Bhopal");
		
		int actual = dao.updateDept(dept);
		assertEquals(1,actual);
		
	}

	@Test
	void testDeleteOne() {
		int dno = 110;
		int actual = dao.deleteOne(dno);
		assertEquals(1,actual);
	}

	@Test
	void testSelectOne() {
		Dept dept = new Dept();
		int dno = 10;
		dept = dao.selectOne(dno);
		assertTrue(dept.getDno() > 0);
		
	}

	@Test
	void testSelectAll() {
		List<Dept> list = dao.selectAll();
		Dept dept = list.get(0);
		assertTrue(dept.getDno() > 0);
	}

}
