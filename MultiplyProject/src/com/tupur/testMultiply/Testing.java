package com.tupur.testMultiply;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.tupur.multiply.CalculatorClass;
import com.tupur.multiply.NegativeNumException;

public class Testing {
	CalculatorClass ob;
	@Before
	public void setUp() throws Exception {
		ob=new CalculatorClass();
	}

	@After
	public void tearDown() throws Exception {
		ob=null;
	}

	@Test(expected=NegativeNumException.class)
	public void testNegativeMul() throws NegativeNumException {
		ob.multiply(2, -3);

	}
	@Test
	public void testPositiveMul() throws NegativeNumException {
		ob.multiply(2, 3);
		assertEquals(6, ob.getMul());
		
	}
	@Test(expected=NegativeNumException.class)
	public void testNegativeDiv() throws NegativeNumException {
		ob.divide(15, -5);
		
	}
	@Test
	public void testPositiveDiv() throws NegativeNumException {
		ob.divide(20, 5);
		assertEquals(4, ob.getDiv());

}
	@Test(expected=ArithmeticException.class)
	public void testZeroDiv() throws ArithmeticException, NegativeNumException {
		ob.divide(15, 0);
		

}
}