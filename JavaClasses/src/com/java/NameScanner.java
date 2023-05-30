package com.java;

public class NameScanner {

	public static void main(String[] args) {
       java.util.Scanner scn=new java.util.Scanner(System.in);
		
		System.out.println("Enter your Name..");
		String s=scn.next();
		
		System.out.println("Enter your Age..");
		int age=scn.nextInt();
		
		System.out.println("Enter your Salary");
		 double sal=scn.nextDouble();
		 
		 System.out.println("Name:-"+s+ ", Age:-"+age+ " ,Salary:-" +sal );
	}

}
