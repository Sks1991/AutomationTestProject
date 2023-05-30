package com.java;

public class Increment2 {

	public static void main(String[] args) {
		int a=1;
		int b=1;
		a=++a + b++;
		b=a++ + ++b;
		System.out.println(a);
		System.out.println(b);

	}

}
