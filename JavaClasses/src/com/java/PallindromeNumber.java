package com.java;

public class PallindromeNumber {

	public static void main(String[] args) {
		 int r,sum=0,temp;    
		  java.util.Scanner scn=new java.util.Scanner(System.in);
		  System.out.println("Enter the number");
		  int n=scn.nextInt();
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome"); 
	}

}
//121,1234321,454,757 etc pallindrome number