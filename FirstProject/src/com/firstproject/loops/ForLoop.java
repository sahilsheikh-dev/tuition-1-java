package com.firstproject.loops;

public class ForLoop {

	public static void main(String[] args) {

		/*
		 * starting value
		 * ending value
		 * incremental or decremental
		 * 
		 * */
		
		/*
		 * print values from 1, 2, 3, ..., to 10 using for loop
		 * for (start_value; end_value; incremental/decremental) {
		 * 		// code
		 * }
		 * */
		
		for (int i = 1; i <= 10; i = i + 3) {
			System.out.print(i + ", ");
		}
		

		System.out.println("\n==============================");
		
		/*
		 * print values from 10, 9, 8, ..., to 1 using for loop
		 * for (start_value; end_value; incremental/decremental) {
		 * 		// code
		 * }
		 * */
		
		for (int i = 10; i >= 1; i--) {
			System.out.print(i + ", ");
		}
		
		
	}

}
