package com.bankapplication.service;

import com.bankapplication.beans.Details;

public interface IBankService1 {
	 Details registration(Details details);
	 Details login(String accountNo);
}
