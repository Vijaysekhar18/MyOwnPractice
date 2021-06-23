package com.creditcard;

public class CreditCardDemo {

	public static void main(String[] args) {
		Customer cust1 = new Customer(1, 1, 490.00);
		Customer cust2 = new Customer(2, 2, 570.00);
		Customer cust3 = new Customer(3, 3, 2378.00);
		Customer cust4 = new Customer(4, 4, 3450.00);
		
//		System.out.println("My CUstomer is " + cust1);
//		System.out.println("My CUstomer is " + cust2);
//		System.out.println("My CUstomer is " + cust3);
//		System.out.println("My CUstomer is " + cust4);
		
		CreditCardCompany cred = new CreditCardCompany();
		System.out.println("Payback amount for " +cust1.getAccountId()+ " is: " + cred.getPaybackamount(cust1));
		System.out.println("Payback amount for " +cust2.getAccountId()+ " is: " + cred.getPaybackamount(cust2));
		System.out.println("Payback amount for " +cust3.getAccountId()+ " is: " + cred.getPaybackamount(cust3));
		System.out.println("Payback amount for " +cust4.getAccountId()+ " is: " + cred.getPaybackamount(cust4));
	}

}
