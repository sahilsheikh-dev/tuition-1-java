package com.firstproject.loops;

public class WhileLoop {
	
	public static void main(String[] args) {
		
		/*
		 * condition
		 * */
		
		/*
		 * print values from 1, 2, 3, ..., to 10 using while loop
		 * */
		
		int i = 1;	// starting value
		
		while (i <= 10) {
			System.out.print(i + ", ");
			i++;
		}
		
		System.out.println("\n==============================");
		
		/*
		 * print values from 10, 9, 8, ..., to 1 using for loop
		 * */
		
		int j = 10;
		
		while (j >= 1) {
			System.out.print(j + ", ");
			j--;
		}
		
		
		
	}

}