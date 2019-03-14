package com.bankapplication.service;

import com.bankapplication.beans.Details;
import com.bankapplication.dao.BankDAO2;
import com.bankapplication.dao.IBankDAO2;
import com.bankapplication.exception.InsufficientBalanceException;

public class BankService2 implements IBankService2{
	IBankDAO2 bankDao2 = new BankDAO2();
	Details details = new Details();
	public int deposit(int depositAmount,int accountNo) {
		return bankDao2.deposit(depositAmount,accountNo);
	}

	public int withdraw(int withdrawAmount,int accountNo) {
		//checking if withdraw amount is greater than available balance and throwing an exception
		if(withdrawAmount>details.getBalance()) {
			try {
			throw new InsufficientBalanceException();
			}catch(Exception e) {
				
			}
			withdrawAmount = 0;
		}
		return bankDao2.withdraw(withdrawAmount,accountNo);
		
	}
	public void transfer() {
		
		
	}

	public int showBalance(int accountNo) {
		return bankDao2.showBalance(accountNo);
		
		
	}

	

}
