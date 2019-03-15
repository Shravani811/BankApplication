package com.bankapplication.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.bankapplication.beans.Details;

class BankDAO1Test {
	 
	
	
	static Details d;
	static BankDAO1 b ;
	@BeforeAll
	public static void Obj() {
		d = new Details();
		b = new BankDAO1();
		
	}
	
	@Test
	void testRegistration() {
	d.setAadharNo("123456789012");
	d.setAddress("hyd");
	d.setFirstName("karthik");
	d.setMobileNo("1234567890");
	d.setLastName("jaiswal");
	d.setEmailID("karthik@97");
	d.setPancardNo("12345678");
	d.setPassword("karthik");
	d.setBalance(0);
	assertEquals(100000024,b.registration(d));
	}

	@Test
	void testLogin() {
		
		assertEquals(100000020,(b.login(100000020, "karthik")).getAccountNo());
	}

}
