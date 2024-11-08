package com.firstproject.basicjava.basic;

public class DataTypesVariables {

	int number;
	static String name;

	public static void main(String[] args) {

		/*
		 * Variable: Variable is used to store the data in the memory and use it
		 * whenever we needed Types: 1. Instance Variable - inside the class but outside
		 * any methods 2. Local Variable - inside any methods 3. Static Variable -
		 * create it with a static keyword, and used inside only static methods
		 */

//		Users	-	Class
//		users	-	object/variable/package
//		users()	-	method/function

		/*
		 * Data Types byte - we can store number from -128 to 127 and has 1 byte of size
		 * short - we can store number from -32,768 to 32,767 and has 2 bytes of size
		 * int - we can store number from -2,147,483,648 to 2,147,483,647 and has 4
		 * bytes of size long - we can store number from -9,223,372,036,854,775,808 to
		 * 9,223,372,036,854,775,807 and has 8 bytes of size float - we can store
		 * decimal number from -1.40239846e-45f to 3.40282347e+38f and has 4 bytes of
		 * size double - we can store decimal number from -4.94065645841246544e-324 to
		 * 1.79769313486231570e+308 and has 8 bytes of size boolean - we can store true
		 * or false and has 1 bit of size String - we can store string value or a group
		 * of characters char - we can store a single character only and has 2 bytes of
		 * size
		 */

//		data_type 	variable 	= 	data;

		byte age = 127;
		System.out.println(age);

		short carNumber = 6542;
		System.out.println(carNumber);

		int number1 = 60;
		int number2 = 456;
		int sum = number1 + number2;
		System.out.println(sum);

		long mobileNumber = 8766509387L;
		System.out.println(mobileNumber);

		float percentage = 97.5F;
		System.out.println(percentage);

		double percent = 87.56;
		System.out.println(percent);

		boolean check = true;
		System.out.println(check);

		boolean validate = false;
		System.out.println(validate);

		String name = "Sahil";
		System.out.println(name);

		char alphabet = 'A';
		System.out.println(alphabet);

	}

}
