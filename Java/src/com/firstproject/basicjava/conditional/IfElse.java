package com.firstproject.basicjava.conditional;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter any number");
		int number = scan.nextInt();

		if (number == 100) {
			System.out.println("Number is equal to 100");
		} else {
			System.out.println("Number is not equal to 100");
		}

		scan.close();

	}

}