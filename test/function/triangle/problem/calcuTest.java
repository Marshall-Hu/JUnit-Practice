package function.triangle.problem;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class calcuTest {

	private static calcu calculator = new calcu();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testEquilateral() {
		calculator.equilateral(3, 3, 3);
		assertEquals(1, calculator.result);
	}
	
	@Test
	public void testEquilateral1() {
		calculator.equilateral(2, 3, 3);
		assertEquals(1, calculator.result);
	}

	@Test
	public void testIsosceles() {
		calculator.isosceles(2, 3, 3);
		assertEquals(1, calculator.result);
	}
	
	@Test
	public void testIsosceles1() {
		calculator.isosceles(3, 3, 3);
		assertEquals(1, calculator.result);
	}

	@Test
	public void testScalene() {
		calculator.scalene(5, 4, 3);
		assertEquals(1, calculator.result);
	}
	
	@Test
	public void testScalene1() {
		calculator.scalene(3, 3, 3);
		assertEquals(1, calculator.result);
	}

}
