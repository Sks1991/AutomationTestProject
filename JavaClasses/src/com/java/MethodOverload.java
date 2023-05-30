package com.java;

public class MethodOverload {
static void m1(int a) {
	System.out.println("int a="+a);
}
static void m1(int a,double d) {
	System.out.println("int a="+a+ " & d="+d);
}
public static void main(String[] args) {
	m1(27);
	m1(37,38.99);
}
}
