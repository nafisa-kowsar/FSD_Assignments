package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.Calculator;

public class CalculatorTest {
	
	static Calculator cal = null;
	
	@Before
	public static void beforeAll() {
		cal = new Calculator();
	}

	@Test
	public void testAdd() {
		
			int actual = cal.add(-3, 5);
			assertEquals(2,actual);
		}
	

	@Test
	public void testSub() {
		
		int actual = cal.sub(9, 5);
		assertEquals(4,actual);
	}

	@Test
	public void testMul() {
		
		int actual = cal.mul(4, 5);
		assertEquals(20,actual);
	}

	@Test
	public void testDiv() {
		
		int actual = cal.div(75, 5);
		assertEquals(15,actual);
	}

}
