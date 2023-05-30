package com.java;

public class SwapWithoutThird {

	public static void main(String[] args) {
java.util.Scanner scn=new java.util.Scanner(System.in);
		System.out.println("Enter 1st number");
		int a=scn.nextInt();
		System.out.println("Enter 2nd number");
		int b=scn.nextInt();
		
		System.out.println("Value of a= "+a+ " & b= "+b+ " before swapping ");
		
		a=a+b;
		b=a-b;
		a=a-b;
		 
		System.out.println("Value of a= "+a+ " & b= "+b+ " after swapping ");

	}

}
