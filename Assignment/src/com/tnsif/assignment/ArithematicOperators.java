package com.tnsif.assignment;

public class ArithematicOperators {
	int firstNum=20, secondNum=10;
	
	public void add() {
		System.out.println("Sum is "+(firstNum+secondNum));
	}
	public void subtract() {
		System.out.println("Difference is "+(firstNum-secondNum));
	}
	public void multiply() {
		System.out.println("Product is "+(firstNum*secondNum));
	}
	public void divide() {
		System.out.println("Quotient is "+(firstNum/secondNum));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithematicOperators ob =new ArithematicOperators();
		ob.add();
		ob.subtract();
		ob.multiply();
		ob.divide();
	}
}
