package com.bankapplication.dao;

import com.bankapplication.beans.Details;

public interface IBankDAO2 {
	int deposit(int depositAmount,int accountNo);
	int withdraw(int withdrawAmount,int accountNo);
	void transfer();
	int showBalance(int accountNo);
	
}
