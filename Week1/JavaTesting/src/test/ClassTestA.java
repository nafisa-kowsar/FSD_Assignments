package test;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ClassTestA {
	
	@Test
	@Tag("development")
	@Tag("production")
	public void testA() {
		System.out.println("testA() is called");
	}

}
