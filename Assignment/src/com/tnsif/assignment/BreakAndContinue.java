package com.tnsif.assignment;

public class BreakAndContinue {

	public static void main(String[] args) {
		// Break is used to terminate the iteration and exit the loop
		for(int i=1;i<=10;i++) {
			if(i==5) break;
			System.out.println(i);
		}
		
		System.out.println();
		
		//Continue is used to terminate the current iteration and jump to the next iteration.
		for(int i=1;i<=10;i++) {
			if(i==5) continue;
			System.out.println(i);
		}
	}

}
