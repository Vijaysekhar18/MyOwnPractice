package com.staticnew;

public class StaticDemo {

	public static void main(String[] args) {
		System.out.println("Addition results is: "+'\n' + Calculator.add(10 , 20));
		System.out.println("Substraction results is: "+'\n'+Calculator.substract(50, 30));
		System.out.println("Multiplication results is: "+'\n'+Calculator.multiply(10, 5));
		System.out.println("divider results is: "+'\n'+Calculator.divide(1,0));	
		
		Calculator cal = new Calculator("sai");
		Calculator cal2 = new Calculator("vijay");
		

		System.out.println(cal.name);
		System.out.println(cal2.name);
	}
}
