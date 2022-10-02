package com.java.controlStatements;

public class whileEg {
	public static void main(String[] args) {
		int i = 11;
		while (i >= 1) {
			System.out.println("before decrementing:"+i);
			i--;
			System.out.println("after decrementing:"+i);
		}
	}
}