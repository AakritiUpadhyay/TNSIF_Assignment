package com.tnsif.assignment;

public class AssignmentOperator {

	public static void main(String[] args) {
		// Assignment operator is used to assign a value to the variable.
		int a = 10;
		System.out.println(a);
		
		//Two types: Simple & Compound
		
		//Simple assignment operator
		int b= 20;
		System.out.println("Simple assignment: "+b);
		
		//Compound assignment operator
		b+=30;
		System.out.println("Compound assignment: "+b);
		b-=10;
		System.out.println(b);
		b*=5;
		System.out.println(b);
		b/=10;
		System.out.println(b);
	}

}
