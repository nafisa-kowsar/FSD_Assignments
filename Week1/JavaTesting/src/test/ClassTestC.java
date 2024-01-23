package test;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ClassTestC {
	

	@Test
	@Tag("development")
	public void testC() {
		System.out.println("testC() is called");
	}

}
