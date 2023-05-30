package com.java;

public class CharacterScanner {

	public static void main(String[] args) {
		 java.util.Scanner scn=new java.util.Scanner(System.in);
			
			System.out.println("Enter your Name..");
			char c=scn.next().charAt(0);
			System.out.println(c);

	}

}
