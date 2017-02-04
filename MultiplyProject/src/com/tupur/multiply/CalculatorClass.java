package com.tupur.multiply;

public class CalculatorClass {
private int mul,div;
public void multiply(int a,int b) throws NegativeNumException{
	if(a<0 || b<0){
		String message="Negative numers not allowed";
		throw new NegativeNumException(message); 
	}else
	mul=a*b;
}

public void divide(int a,int b)throws NegativeNumException{
	if(b==0)
		throw new ArithmeticException();
else if(a<0 || b<0){
		String message="Negative numers not allowed";
		throw new NegativeNumException(message); 
		
	}else
	div=a/b;

}
public int getMul() {
	return mul;
}
public int getDiv() {
	return div;
}}
