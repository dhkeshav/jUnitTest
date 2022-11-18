package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		//fail("Not yet implemented");
		jUnitFunctions junit = new jUnitFunctions();
		int result = junit.addNumbers(50, 30);
		assertEquals(80, result);
	}

}
