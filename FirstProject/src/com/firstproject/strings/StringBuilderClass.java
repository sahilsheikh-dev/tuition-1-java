package com.firstproject.strings;

public class StringBuilderClass {

	public static void main(String[] args) {

		StringBuilder name = new StringBuilder("Sahil");
		name.insert(5, " Sheikh");
		name.insert(0, "Sheikh ");

		name.append(" Sheikh");

		System.out.println(name);

	}

}