package com.codewrite.bb;

public class Bank {
	
	private int accountNumber;
	private double balance;
	private String accountName;
	
	
	
	
	public Bank(int accountNumber, double balance, String accountName) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountName = accountName;
	}
	

	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public String getAccountName() {
		return accountName;
	}
	
	
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}


	@Override
	public String toString() {
		return "Bank [accountNumber=" + accountNumber + ", balance=" + balance + ", accountName=" + accountName + "]";
	}
	
	
	

}
