package com.tnsif.assignment;

public class Loops {

	public static void main(String[] args) {
		//Loops are used to repeat a set of statements depending on the given condition
		//Three types: for loop, while loop, do-while loop
		
		//for loop
		for(int i=1;i<=5;i++) System.out.print(i+"\t");
		System.out.println();
		
		System.out.println();
		//while loop
		int i=1;
		while(i<=5) {
			System.out.print(i+"\t");
			i++;
		}System.out.println();
		
		System.out.println();
		//do-while loop
		i=1;
		do{
			System.out.print(i+"\t");
			i++;
		}while(i<=5);
		System.out.println();

	}

}
