package com.tnsif.assignment;

import java.util.Stack;

public class VariablesAndDataTypes {

	public static void main(String[] args) {
		//Variables are memory locations whose values can be changed throughout the execution of the program.
		int variable=30;
		System.out.println("Variable:"+variable);
		
		System.out.println();
		
		/*
		 	*	Data types are the type of data stored in the variables
			*	Two types: Primitive & Non-primitive
			*	Primitive: int, long, float, char, double, String ,boolean etc
			*	Non-primitive: arrays, stacks, queues, trees, graphs
		*/
		
		//Primitive types
			//integer (32 bits, -2^31 to 2^31-1)
			int i=30;
			System.out.println("Integer: "+i);
			
			//long (64 bits, -2^63 to 2^63-1)
			long l=761954598;
			System.out.println("Long: "+l);
			
			//float (32 bits, 6 to 7 decimal digits)
			float f=30;
			System.out.println("Float: "+f);
			
			//Double (64 bits, 15 decimal digits)
			double d=30.000;
			System.out.println("Double: "+d);
			
			//char (16 bits)
			char ch='A';
			System.out.println("Character: "+ch);
			
			//String (16 bits per character including space)
			String str="Aakriti";
			System.out.println("String: "+str);
			
			//Boolean (1 bit)
			boolean b = true;
			System.out.println("Boolean: "+b);
			
		System.out.println();
			
		//Non-primitive types
			//arrays
			int[] a= {0,1,2,3,4,5,6,7,8,9};
			System.out.println("Array elements");
			for(int z=0;z<10;z++) {
				System.out.print(+a[z]+"\t");
			}System.out.println();
			
			//stacks
			Stack<Integer> st=new Stack<Integer>();
			System.out.println("Stack elements");
			for(int z=0;z<5;z++) {
				st.push(i);
				System.out.print(st.peek()+"\t");	//wrong			
			}
	}

}
