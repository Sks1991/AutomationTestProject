package com.java;

public class MethodOverload1 {

	public static void main(String[] args) {
		System.out.println("Main method");
		main();
		main("Sudhir");
	}
	public static void main(String name) {
		 System.out.println("Main with string parameter");
	}
	public static void main() {
		 System.out.println("Main with no parameter");
	}
}
