package com.java;

public class WhileLoop {

	public static void main(String[] args) {
java.util.Scanner scn=new java.util.Scanner(System.in);
		
		System.out.println("Enter age..");
		int age=scn.nextInt();
		
		while(age>18) {
			System.out.println("Eligible to vote");
		break;
		}
		
	}

}
