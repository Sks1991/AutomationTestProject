package com.java;

public class ForLoop17 {

	public static void main(String[] args) {
		int star=1;
		for(int i=1;i<=5;i++)
		{
		for(int j=5;j>i;j--)	
		{
		System.out.print(" ");
		}
		for(int k=1;k<=star;k++)
		{
			System.out.print("*");
		}
		star+=2;
		System.out.println();
	  }
	}

}
