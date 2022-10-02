package com.JavaBsics;

public class Java_Variables {
	int a =15;// instance variable:Declared inside a class but out side a method.
	//will initialize when ever new reference / instance is created
	static int b = 12;// static variable or class variable . keyword static is used. These variables
						// will initialize at the time of class loading into memory

	public void sum(int a, int b) {
		int c = a + b;// local variable declared inside a method
		System.out.println("the value of c is:" + c);
	}
	
	public int div(int a, int b) {
		int c = a / b;// local variable declared inside a method
		return c;
	}

	public static void display() {
		System.out.println("inside static method");
	}

	public static void main(String[] args) {
		Java_Variables obj = new Java_Variables();
		obj.sum(4, 15);
		display();
		//System.out.println("the value of a is:" + obj.a);
		System.out.println("the value of b is:" + b);
		int z = obj.div(25, 5);
		System.out.println("Z value is"+z);
	}
}