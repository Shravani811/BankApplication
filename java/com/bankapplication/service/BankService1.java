package com.bankapplication.service;

import com.bankapplication.beans.Details;
import com.bankapplication.dao.BankDAO1;
import com.bankapplication.dao.IBankDAO1;

public class BankService1 implements IBankService1{
	IBankDAO1 bankDao = new BankDAO1();
public Details registration(Details details) {
		
		
		bankDao.registration(details);
		
		return null;
}
	public Details login(String accountNo) {
		
		return null;
	}

	

}
