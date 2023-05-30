package com.java;

public class IfElseCondition {

	public static void main(String[] args) {
		java.util.Scanner scn=new java.util.Scanner(System.in);
		
		System.out.println("Enter 1st Number..");
		int a=scn.nextInt();
		System.out.println("Enter 2nd Number..");
		int b=scn.nextInt();
		
		if(a>b) {
			System.out.println("A is greater than B");
			
		}else if(a<b) {
			System.out.println("A is less than B");
			
		}else {
			System.out.println("A is equal to B");
		}

	}

}
