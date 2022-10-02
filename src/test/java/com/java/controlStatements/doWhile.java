package com.java.controlStatements;

public class doWhile {
	public static void main(String[] args) {
		int i = 1;
		do {
			System.out.println("before incrementing"+i);
			i++;
			System.out.println("after incrementing"+i);
		} while (i <= 10);
	}
}
