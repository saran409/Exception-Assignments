package com.exception;

import java.util.Scanner;

public class MainRunner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 
		System.out.println("Enter your Account no=");
		int accountNumber=Integer.parseInt(sc.nextLine());
		System.out.println("Enter your Account name=");
		String accountName=sc.nextLine();
		 
		Account asd=new Account(accountNumber,accountName,4000);
		System.out.println("Enter the amount to deposit =" );
		int amountdp=Integer.parseInt(sc.nextLine());
		int newBalance=asd.doDeposit(amountdp);
		System.out.println("New updated balance is ="+newBalance);
		try {
			System.out.println("Enter the amount to be withdrawn");
			int withdrawAmount=Integer.parseInt(sc.nextLine());
			int newBalance1=asd.doWithdrawal(withdrawAmount);
			System.out.println("Transaction Complete and your current balance is = " +newBalance1);
		}
		catch(InsufficientFundException e){
			System.out.println(e.getMessage());
			
		}
		

		 
		
		 
	}

}
