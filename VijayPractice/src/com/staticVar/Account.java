package com.staticVar;

public class Account {
	private int accountId;
	private int customerId;
	private double balance;

	public Account(int customerId, double balance) {
		this.accountId = IDGenerator.id;
		this.customerId = customerId;
		this.balance = balance;
		
		IDGenerator.id++;
	}

	public int getAccountId() {
		return accountId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", customerId=" + customerId + ", balance=" + balance + "]";
	}
	
}
