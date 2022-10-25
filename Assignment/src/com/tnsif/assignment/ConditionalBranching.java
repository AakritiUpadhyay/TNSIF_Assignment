package com.tnsif.assignment;
import java.util.*;
public class ConditionalBranching {
	
	Scanner in=new Scanner(System.in);
	
	public void ifStatement() {
		System.out.println("if statement");
		System.out.println("Enter two numbers");
		int a=in.nextInt();
		int b=in.nextInt();
		if(a==b) System.out.println("Equal");
	}
	public void ifElseStatement() {
		System.out.println("if else statement");
		System.out.println("Enter 3 digit number");
		int num=in.nextInt();
		if(num>99 && num<1000) System.out.println("Correct");
		else System.out.println("Wrong");
	}
	public void ifElseIfStatement() {
		System.out.println("if else if statement");
		System.out.println("Enter three numbers");
		int x=in.nextInt();
		int y=in.nextInt();
		int z=in.nextInt();
		if(x>y && x>z) System.out.println(x+" is greatest");
		else if(y>x && y>z) System.out.println(y+" is greatest");
		else System.out.println(z+" is greatest");
	}
	public void NestedIfStatement() {
		System.out.println("nested if statement");
		System.out.println("Enter three numbers");
		int d=in.nextInt();
		int e=in.nextInt();
		int f=in.nextInt();
		if(d>e) {
			if(d>f) System.out.println(d+" is greatest");
			else System.out.println(f+" is greatest");
		}else {
			if(e>f) System.out.println(e+" is greatest");
			else System.out.println(f+" is greatest");
		}
}

	public static void main(String[] args) {
		
		ConditionalBranching ob=new ConditionalBranching();
		ob.ifStatement();
		System.out.println();
		ob.ifElseStatement();
		System.out.println();
		ob.ifElseIfStatement();
		System.out.println();
		ob.NestedIfStatement();
	}
}
