package com.staticVar;

import java.util.Arrays;

public class StaticVarDemo {

	public static void main(String[] args) {

		Account[] acc = {new Account(100, 100.0), new Account(101, 100.0), new Account(102, 100.0), new Account(104, 100.0)};
		
		
		System.out.println(Arrays.toString(acc));
	}
}
