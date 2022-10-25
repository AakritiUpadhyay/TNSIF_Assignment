package com.tnsif.assignment;
import java.util.*;

public class TernaryOperators {

	Scanner in=new Scanner(System.in);
	
	public boolean check() {
		System.out.println("Enter two numbers");
		int a=in.nextInt();
		int b=in.nextInt();
		boolean res=a==b?true:false;
		return res;
	}
	public static void main(String[] args) {
		
		TernaryOperators ob=new TernaryOperators();
		boolean res=ob.check();
		if(res==true) System.out.println("Equal");
		else System.out.println("Not equal");
	}

}
