package com.github.stokito.unitTestExample.calculator;

import junit.framework.Assert;
import org.junit.Test;

public class CalculatorTest {
	
	public static int sum(int a, int b) {
		return a + b;
	}

	public static int minus(int a, int b) {
		return a - b;  
	}

	public static int divide(int a, int b) {
		return a / b;
	}

	public static  int multiply(int a, int b) {
		return a * b;
	}

	@Test
	public void testSum() {
	//	Calculator calculator = new Calculator();
		
		Assert.assertEquals(4, sum(2, 2));
	}

	@Test
	public void testMinus() {
		//Calculator calculator = new Calculator();
		Assert.assertEquals(1, minus(2, 1));
	}

	@Test
	public void testDivide() {
		//Calculator calculator = new Calculator();
		Assert.assertEquals(2, divide(6, 3));
	}

	/*@Test(expected = ArithmeticException.class)
	public void testDivideWillThrowExceptionWhenDivideOnZero() {
		Calculator calculator = new Calculator();
		calculator.divide(6, 0);
	}*/
}
