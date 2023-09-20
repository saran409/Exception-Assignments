package com.exception;
 

public class AmountValidation{
	int sum;
	
	public void getOrder() throws InsufficientOrderException {
		if(this.sum<100) {
			throw new InsufficientOrderException(this.sum);
		}
	 System.out.println("you are good to go");
	 
	}
	public static void main(String[] args) {
		
		 
		AmountValidation v1=new AmountValidation();
		 
		v1.sum= 40;
		 
		try {
			v1.getOrder();
		}
		catch(InsufficientOrderException e) {
			  System.out.println("insufficient order as your amount is "+e.getAmount());
		}
	}

}
