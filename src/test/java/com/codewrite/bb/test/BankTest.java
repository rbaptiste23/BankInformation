package com.codewrite.bb.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.codewrite.bb.Bank;

public class BankTest {

	Bank bank;
	

	@Before
	public void InitalBankTest() {
	  bank = new Bank(5555,23000.56d,"Riley's Account");	
	}
	
	@Test
	public void testGetAccountNumber() {		
		assertEquals(5555, bank.getAccountNumber());		
	}

	@Test
	public void testSetAccountNumber() {
		bank.setAccountNumber(88);
		assertEquals(88,bank.getAccountNumber());
	}

	@Test
	public void testGetBalance() {
	 assertEquals(23000.56d,bank.getBalance(),0);
	
	}

	@Test
	public void testSetBalance() {
		bank.setBalance(15.73d);
		
		assertEquals(15.73d,bank.getBalance(),0);
	}

	@Test
	public void testGetAccountName() {
		assertEquals("Riley's Account",bank.getAccountName());
	}

	@Test
	public void testSetAccountName() {
	  bank.setAccountName("Judy's Account");
	  assertEquals("Judy's Account", bank.getAccountName());
	}

	@Test
	public void testToString() {
		assertNotNull(bank.toString());

	}

}
