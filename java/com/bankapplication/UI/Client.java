package com.bankapplication.UI;

import java.util.Scanner;

import com.bankapplication.beans.Details;
import com.bankapplication.service.BankService1;

public class Client {
	public void bankOperation() {
		Details details = new Details();
		BankService1 bs = new BankService1();
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your choice 1.Registration 2.Login");
		int choice = input.nextInt();
		switch(choice) {
		case 1:
			System.out.println("enter your first name");
			details.setFirstName(input.next());
			System.out.println("enter your last name");
			details.setLastName(input.next());
			System.out.println("enter your email id");
			details.setEmailID(input.next());
			System.out.println("enter your password");
			details.setPassword(input.next());
			System.out.println("enter your pan card number");
			details.setPancardNo(input.next());
			System.out.println("enter your aadhar number");
			details.setAadharNo(input.next());
			System.out.println("enter your address");
			details.setAddress(input.next());
			System.out.println("enter your mobile number");
			details.setMobileNo(input.next());
			System.out.println("enter your balance");
			details.setBalance(input.nextInt());
			details = bs.registration();
			System.out.println("you are successfully registered your account number is:"+details.getAccountNo());
			
		case 2:
			System.out.println("enter your account number");
			details.setAccountNo(input.next());
			System.out.println("enter password");
			details.setPassword(input.next());
			String accountNo = details.getAccountNo();
			details = bs.login(accountNo);
			System.out.println("login successfully");
			
		}
		
	}

	public static void main(String[] args) {
		Client clientObj = new Client();
		clientObj.bankOperation();
	}

}
