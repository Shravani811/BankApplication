package com.bankapplication.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.bankapplication.beans.Details;

class BankDAO2Test {
	static BankDAO2 b;
	static Details d;
	@BeforeAll
	static void obj() {
		b= new BankDAO2();
		d = new Details();
	}
	@Test
	void testDeposit() {
		assertEquals(107,b.deposit(100, 100000018));
	}

	@Test
	void testWithdraw() {
	assertEquals(7,b.withdraw(100, 100000018));
	}

	@Test
	void testTransfer() {
		
		
		d.setAccountNo(100000022);
		
		assertEquals(d.getAccountNo(),(b.transfer(10, 100000022,100000018)).getAccountNo());
	}

	@Test
	void testShowBalance() {
		assertEquals(7,b.showBalance(100000018));
	}

	@Test
	void testValidateAccountNo() {
		assertEquals(true,b.validateAccountNo(100000018));
	}

}
