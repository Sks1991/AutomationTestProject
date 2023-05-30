package com.java;

public class Return1 {
	
	static int add(int a,int b)
	{
		return a+b;
	}
	static int sub(int a,int b)
	{
		return a-b;
	}
	static int mul(int a,int b)
	{
		return a*b;
	}
	static int div(int a,int b)
	{
		return a/b;
	}

	public static void main(String[] args) {
		
       System.out.println(add(4,6));
       System.out.println(sub(9,6));
       System.out.println(mul(5,6));
       System.out.println(div(30,6));
		
	}

}
