package com.exception;

public class Account {
	private int accountNumber;
	private String accountHolderName;
	private int balance;
	public int amountDp;
	public Account(int accountNumber, String accountHolderName, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		 
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int doDeposit(int amount) {
		System.out.println("before deposit your balance is " +balance);
		balance+=amount;
		return balance;
	}
	public int doWithdrawal(int withdraw)throws InsufficientFundException {
		 
		if(withdraw<=0) {
			System.out.println("Withdraw amount must be greater than zero");
		}
	   if(balance-withdraw<5000) {
				throw new InsufficientFundException("Cannot Withdraw "+withdraw+" as balance is only "+balance);
			}
	    
		
		int current=getBalance()-withdraw;
		 return current;
		
	}
	

}
