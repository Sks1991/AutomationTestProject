package com.java;


public class ArmstrongNumber {

	public static void main(String[] args) {
		int sum=0;
		
		java.util.Scanner scn=new java.util.Scanner(System.in);
          System.out.println("Enter the number");
        int a=scn.nextInt();
        
       int temp=a;
        while(a>0) {
        	
        	int r=a%10;
        	sum=sum+r*r*r;
        	a/=10;
        }
          
        if(temp==sum)  {
        	
        	System.out.println("Number is an Armstrong number");
        }else {
        	System.out.println("Not Armstrong");
        }
          
	}
	
	//the sum of cube of digit equals to given number

}
