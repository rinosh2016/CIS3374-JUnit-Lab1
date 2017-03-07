package com.lab1.calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calculator;
	
	@Before
	public void setUP() {
		calculator = new Calculator();
		
}
	@Test
	public void addTest() {
		assertEquals(4, calculator.add(2, 2));
		assertTrue(calculator.add(2, 2) == 4);
		assertFalse(calculator.add(2, 2) != 4);
	}
	@Test
	public void subtractTest() {
		assertEquals(5, calculator.subtract(6, 1));
		assertTrue(calculator.subtract(6, 1) == 5);
		assertFalse(calculator.subtract(6, 1) != 5);
	}
	@Test
	public void multiplyTest() {
		assertEquals(12, calculator.multiply(3, 4));
		assertTrue(calculator.multiply(3, 4) == 12);
		assertFalse(calculator.multiply(3, 4) != 12);
	}
	@Test
	public void divideTest() {
		assertEquals(2, calculator.divide(6, 3));
		assertTrue(calculator.divide(6, 3) == 2);
		assertFalse(calculator.divide(6, 3) != 2);
	}

}
