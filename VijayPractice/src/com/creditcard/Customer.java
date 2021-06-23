package com.creditcard;

public class Customer {
	private int custId;
	private int accountId;
	private double creditCardCharges;
	Customer(){
		
	}
	Customer(int custId,int accountId,double ccc){
		this.custId=custId;
		this.accountId=accountId;
		this.creditCardCharges=ccc;
	}
	
	public int getCustId(){
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public double getCreditCardCharges() {
		return creditCardCharges;
	}
	public void setCreditCardCharges(double creditCardCharges) {
		this.creditCardCharges = creditCardCharges;
	}
	
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", accountId=" + accountId + "]";
	}
	
	@
	Override
	public int hashCode() {
		return accountId;
	}
	
}