package com.java;

public class MethodWithParameter {

	 static void methodparameter(String Name,int Age) {
		System.out.println("My Name is "+Name+ " & Age is "+Age);

	}
     public static void main(String[] args)
     {
	System.out.println("Main start..");
	methodparameter("Sudhir",30);
	methodparameter("Soni",25);
	System.out.println("Main ends..");
}
}
