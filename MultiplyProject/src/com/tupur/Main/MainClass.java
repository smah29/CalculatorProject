package com.tupur.Main;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.tupur.multiply.CalculatorClass;
import com.tupur.multiply.NegativeNumException;
import com.tupur.testMultiply.Testing;


public class MainClass {

	public static void main(String[] args) throws NegativeNumException,ArithmeticException {
		Result result = JUnitCore.runClasses(Testing.class);
		for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
		 System.out.println(result.wasSuccessful());
		 CalculatorClass ob=new CalculatorClass();
		 ob.divide(3, 0);
		 System.out.println(ob.getDiv());
			ob.divide(-6, 2);
			 System.out.println(ob.getDiv());
			 
		 ob.multiply(3, 2);
		 System.out.println(ob.getMul());
		 ob.multiply(0, 5);
		 System.out.println(ob.getMul());
		 ob.divide(15, 5);
		 System.out.println(ob.getDiv());
		 
		
	}

}
