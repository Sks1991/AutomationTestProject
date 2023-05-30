package com.java;

public class Method2 {
	
   static void method1(String Name,int age,double salary)
   
   {
	   System.out.println("Name:-"+Name+", Age:-"+age+", Salary:-"+salary);
   }
   
	public static void main(String[] args) {
		
   System.out.println("Main starts..");
   method1("Sudhir",30,40000.3456);
   method1("Soni",25,42566.98765);
   System.out.println("Main ends...");
   
   
	}

}
