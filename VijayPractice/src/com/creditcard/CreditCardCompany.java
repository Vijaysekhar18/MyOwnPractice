package com.creditcard;

public class CreditCardCompany {
	public double getPaybackamount(Customer cust) {
		
		double ans = 0;
		double amount = cust.getCreditCardCharges();
		
		if(cust.getCreditCardCharges()<500) {
			ans = ans +0.25 * (1.0/100) * Math.min(500, amount);
			amount = amount - Math.min(500, amount);
		}
		
		if(amount > 0 ) {
			
			ans = ans + 0.5*(1.0/ 100) * Math.min(amount, 1000);
			amount = amount - Math.min(amount, 1000);
			
		}
		if(amount > 0) {
			ans = ans + 0.75*(1.0/ 100) * Math.min(amount, 1000);
			amount = amount - Math.min(amount, 1000);
		}
		if(amount>0) {
			ans = ans + 0.5*(1.0/ 100) * Math.min(amount, 1000);
			amount = amount - Math.min(amount, 1000);
		}
		return ans;
		
	}
}

