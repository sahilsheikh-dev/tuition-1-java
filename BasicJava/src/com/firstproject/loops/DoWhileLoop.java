package com.firstproject.loops;

public class DoWhileLoop {

	public static void main(String[] args) {

//		int i = 0;
		int i = 1;

		do {
			float divide = 100 / i;
			System.out.println(divide);
			i++;
		} while (i != 0 && i <= 10);

	}

}