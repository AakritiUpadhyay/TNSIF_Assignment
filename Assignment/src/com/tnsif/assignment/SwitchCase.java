package com.tnsif.assignment;
import java.util.*;
public class SwitchCase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//Using integer
		System.out.println("Enter a number from 1 to 7");
		int n =in.nextInt();
		switch(n) {
			case 1: System.out.println("Monday"); break;
			case 2: System.out.println("Tueday"); break;
			case 3: System.out.println("Wednesday"); break;
			case 4: System.out.println("Thursday"); break;
			case 5: System.out.println("Friday"); break;
			case 6: System.out.println("Satday"); break;
			case 7: System.out.println("Sunday"); break;
			default: System.out.println("Wrong Choice");		
		}
		//Using Character
		System.out.println("Enter a letter");
		char ch =in.next().charAt(0);
		switch(ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u': System.out.println("Vowel"); break;
			default: System.out.println("Consonant");
		}
		if(in!=null) in.close();
	}
}