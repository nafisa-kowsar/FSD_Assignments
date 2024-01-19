package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Calculator;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator cal = new Calculator();
			int actual = cal.add(-3, 5);
			assertEquals(2,actual);
		}
	

	@Test
	public void testSub() {
		Calculator cal = new Calculator();
		int actual = cal.sub(9, 5);
		assertEquals(4,actual);
	}

	@Test
	public void testMul() {
		Calculator cal = new Calculator();
		int actual = cal.mul(4, 5);
		assertEquals(20,actual);
	}

	@Test
	public void testDiv() {
		Calculator cal = new Calculator();
		int actual = cal.div(75, 5);
		assertEquals(15,actual);
	}

}
