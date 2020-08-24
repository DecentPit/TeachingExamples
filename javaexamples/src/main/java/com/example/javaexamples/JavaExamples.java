package com.example.javaexamples;

public class JavaExamples {
	public static void main(String[] args) {
		odd(10);
	}

	//определить является чисто четным или нечетным
	public static void odd(int x) {
		if (x % 2 == 0)
			System.out.println("число чётное");
		else
			System.out.println("число нечетное");
	}

	public static void roundingError() {
		float x = 1f / 6 + 1f / 6 + 1f / 6 + 1f / 6 + 1f / 6 + 1f / 6;
		System.out.println(x);
	}

	public static void typeCharOperation() {
		char ch;
		ch = 'L';
		System.out.println("ch = " + ch);
		ch++;
		System.out.println("ch = " + ch);
		ch = 'D';
		ch--;
		System.out.println("ch = " + ch);
	}

	public static void increment(int x) {
		int y;
		y = x++;
		System.out.println(y);
		y = ++x;
		System.out.println(y);
	}

	// поменять значения переменных x и y, не используя дополнительных переменных
	public static void swapNumbersWithoutVariables(int x, int y) {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println(x);
		System.out.println(y);
	}

	// вычислить сумму и разницу x и y
	public static void sumAndSubNumbers(int x, int y) {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		int z = x + y;
		int w = x - y;
		System.out.println(z);
		System.out.println(w);
	}

	// поменять значения местами
	public static void swapNumbers(int x, int y) {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		int z = x;
		x = y;
		y = z;
		System.out.println(x);
		System.out.println(y);
	}
}