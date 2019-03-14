package com.bankapplication.dao;

import com.bankapplication.beans.Details;

public interface IBankDAO1 {
	 Details registration(Details details);
	 Details login(String accountNo);
}
