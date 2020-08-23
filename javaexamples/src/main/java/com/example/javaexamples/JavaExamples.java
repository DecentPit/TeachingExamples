package com.example.javaexamples;

public class JavaExamples {
	public static void main(String[] args) {
		swapNumber(4, 6);
	}

	public static void swapNumber(int x, int y) {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		int z = x;
		x = y;
		y = z;
		System.out.println(x);
		System.out.println(y);
	}
}