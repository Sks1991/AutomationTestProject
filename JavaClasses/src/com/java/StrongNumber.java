package com.java;

public class StrongNumber {

	public static void main(String[] args) {
		
		java.util.Scanner scn=new java.util.Scanner(System.in);
          System.out.println("Enter the number");
        int a=scn.nextInt();
        int temp=a;
        int fact=0;
        
        while(a!=0) {
        	int p=1;
        	int i=1;
        	int r=a%10;
        while(i<=r) {
        	p=p*i;
        	i++;
        }
        fact=fact+p;
        a/=10;
        }
        
     if(temp==fact) {
    	 System.out.println("Number is strong number");
     }else {
    	 System.out.println("Not Strong number");
     }
	}
	}//factorial sum of all digit of number is equal to that number


