package com.bankapplication.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bankapplication.beans.Details;
import com.bankapplication.utility.DataConnection;

public class BankDAO2 implements IBankDAO2{
	Details details = new Details();
	DataConnection d = new DataConnection();
	Connection con = d.connect();
	//depositing money into particular account 
	public int deposit(int depositAmount,int accountNo) {
		int depositBalance=0;
		try {
			PreparedStatement st=con.prepareStatement("update customer set balance=balance+? where account_no=?");
				st.setInt(1, depositAmount);
				st.setInt(2, accountNo);
				
			int i = st.executeUpdate();
			
			if(i==1) {
				PreparedStatement statement=con.prepareStatement("select * from customer where account_no=?");
			
			statement.setLong(1, accountNo);
			ResultSet resultSet=statement.executeQuery();
			while(resultSet.next())
			{
				depositBalance=resultSet.getInt(10);
			}
			}
			}catch(Exception e) {
				
				}
		
		
		return depositBalance;
	}
	//withdrawing money into particular account 
	public int withdraw(int withdrawAmount,int accountNo) {
		int withdrawBalance=0;
		try {
			PreparedStatement st=con.prepareStatement("update customer set balance=balance-? where account_no=? ");
				st.setInt(1, withdrawAmount);
				st.setInt(2, accountNo);
				
			int i = st.executeUpdate();
			
			if(i==1) {
				PreparedStatement statement=con.prepareStatement("select * from customer where account_no=?");
			
			statement.setLong(1, accountNo);
			ResultSet resultSet=statement.executeQuery();
			while(resultSet.next())
			{
				withdrawBalance=resultSet.getInt(10);
			}
			}
			}catch(Exception e) {
				
				}
		return withdrawBalance;
		
	}

	public void transfer() {
		
		
	}
	//displaying money into particular account 
	public int showBalance(int accountNo) {
		int bal = 0;
		try {
		PreparedStatement st=con.prepareStatement("select * from customer where account_no=?");
		
		st.setInt(1, accountNo);
		ResultSet rs = st.executeQuery();
		
		while(rs.next())
		{
			bal=rs.getInt(10);
		}
		}catch(Exception e) {
			
		}
		return bal;
	}

}
