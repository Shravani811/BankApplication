package com.bankapplication.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bankapplication.beans.Details;
import com.bankapplication.utility.DataConnection;

public class BankDAO1 implements IBankDAO1{
	Details details = new Details();
	DataConnection d = new DataConnection();
	Connection con = d.connect();
	public Details registration(Details details) {
		try {
		String stmt="insert into customer_details(firstName,lastName,emailID,password,pancardNo,,aadharNo,address, mobileNo,balance) values(?,?,?,?,?,?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(stmt);
		
		 pst.setString(1, details.getFirstName());
		
		 pst.setString(2,details.getLastName());

		 pst.setString(3,details.getEmailID());

		 pst.setString(4,details.getPassword());
	
		 pst.setString(5,details.getPancardNo());
		
		 pst.setString(6,details.getAadharNo());
		 
		 pst.setString(7, details.getAddress());
		 
		 pst.setString(8, details.getMobileNo());
		 
		 pst.setInt(9, details.getBalance());
		 
		ResultSet rs = pst.executeQuery();
		
		 
		 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		 return details;
	}
		


	public Details login(String accountNo) {
		String stmt = "";
		return details;
	}

}
