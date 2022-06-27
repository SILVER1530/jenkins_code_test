package calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Junitcase {

	protected int val1,val2;
	
	
	@Test
	void testAdd() {
		Calcfunction calc = new Calcfunction();
		val1 = 5;
		val2 = 3;
//		fail("Not yet implemented");
		int result = calc.add(val1,val2);
		assertTrue(result==8);
	}

	@Test
	void testSubtract() {
//		fail("Not yet implemented");
		Calcfunction calc = new Calcfunction();
		val1 = 5;
		val2 = 3;
		int result = calc.subtract(val1,val2);
		assertTrue(result==2);
	}

}
