package com.java;

public class SumOfDigits {

	public static void main(String[] args) {
int sum=0;
		
		java.util.Scanner scn=new java.util.Scanner(System.in);
          System.out.println("Enter the number");
        int a=scn.nextInt();
        int n=a;
        while(a>0) {
        	
        	int r=a%10;
        	sum=sum+r;
        	a/=10;
        	
        }
         System.out.println("the sum of digit of "+n+ " is :- " +sum);
	}

}
