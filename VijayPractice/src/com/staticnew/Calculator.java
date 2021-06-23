package com.staticnew;

public class Calculator {
	
	public final String name;
	
	

	public Calculator(String name) {
		super();
		this.name = name;
	}

	public static int add(int x, int y) {
		return x + y;
	}

	public static int substract(int x, int y) {
		return x - y;
	}

	public static int multiply(int x, int y) {
		return x * y;
	}

	public static int divide(int x, int y) {
		try {
			return x / y;
		} catch (ArithmeticException aex) {
			return 0;
		}
	}
}