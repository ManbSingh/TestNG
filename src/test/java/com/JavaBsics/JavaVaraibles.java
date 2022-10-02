package com.JavaBsics;

public class JavaVaraibles {
	int a=8;//instance variable or Global Variable: Declared inside a class but outside a method
	static String str = "Learning";
	char ch = 'g';

	void sum(int x,int y){  //x and y are called local variables : declared inside a method and the scope is limited to method
		int z = x+y;
		System.out.println(z);
	}
	
	static void sub(int y , int z) {
		int k = y-z;
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi I am learning java");
		int b=7;//b is local variable
		JavaVaraibles obj = new JavaVaraibles();
		obj.sum(8, 9);
		System.out.println(obj.a);
		System.out.println(obj.ch);
		sub(18,4);
		System.out.println(str);
	}

}
