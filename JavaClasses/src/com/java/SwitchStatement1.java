package com.java;

public class SwitchStatement1 {

	public static void main(String[] args) {
java.util.Scanner scn=new java.util.Scanner(System.in);
		
		System.out.println("Enter the seasons..");
		int a=scn.nextInt();
	switch(a) 	{	
		case 1:
	    case 12:
		case 13:
			System.out.println("winter season");
	break;
		
		case 4:
		case 5:
	    case 9:
			System.out.println("rainy season");
	break;
		
	    case 2:
	    case 7:
		case 10:
			System.out.println("summer season");
	break;
		
		default:
		System.out.println("Invalid season");
	   }	
	}
}
