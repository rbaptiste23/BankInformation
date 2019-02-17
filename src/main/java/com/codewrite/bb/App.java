package com.codewrite.bb;

public class App {

	public static void main(String[] args) {
		Bank bank = new Bank(1111,232322.32,"Tommy Jones");
		
		bank.setAccountName("yo yo");
		bank.setAccountNumber(33823);
		bank.setBalance(20.52d);
		
		System.out.println(bank.getAccountName());
		System.out.println(bank.getAccountNumber());
		System.out.println(bank.getBalance());
		
		
		System.out.println(bank.toString());
		System.out.println(bank.toString());
		System.out.println(bank.toString());

		System.out.println(bank.toString());
		System.out.println(bank.toString());

	}

}
