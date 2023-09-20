package com.exception;

public class InsufficientOrderException extends Exception{
	int amount;

	public InsufficientOrderException(int amount) {
		super();
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}
 
	

}
