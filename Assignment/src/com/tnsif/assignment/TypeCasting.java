package com.tnsif.assignment;

public class TypeCasting {

	public static void main(String[] args) {
		// When one data type is converted to another (primitive)
		//Two types: Implicit & Explicit
		
		//Implicit or widening conversion: done automatically
		//	byte -> short -> char -> int -> long -> float -> double
		System.out.println("Implicit Conversion (int -> double)");
		int intI=10;
		double doubleI=intI;
		System.out.println("Integer: "+intI);
		System.out.println("Double: "+doubleI);
		
		//Explicit or shortening conversion: done manually
		//double -> float -> long -> int -> char -> short -> byte
		System.out.println("Explicit Conversion (double -> int)");
		double doubleE=10.556;
		int intE=(int)doubleE;
		System.out.println("Double: "+doubleE);
		System.out.println("Integer: "+intE);
	}

}
