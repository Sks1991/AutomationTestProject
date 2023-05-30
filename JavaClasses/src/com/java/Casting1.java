package com.java;

public class Casting1 {

	public static void main(String[] args) {
		double d=1000;
		int i=(int)3456.87654;
		int c='f';
		
        System.out.println(d);//Automatically converting integer value into double(1000.0) in widening casting.
	    System.out.println(i);//not convert double value into integer so i take (int).
	    System.out.println(c);
	
	
	}

}
