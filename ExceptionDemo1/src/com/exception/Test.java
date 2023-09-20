package com.exception;

public class Test {
	int marks;
	public void doValidate() throws TakeMyCallException,TakeRetestException{
		if(this.marks<20) {
			throw new TakeMyCallException();
		}
		else if(this.marks<60) {
			throw new TakeRetestException();
		}
		else {
			System.out.println("keep up the good work");
		}
	}
	public static void main(String[] args) {
		Test n1=new Test();
		n1.marks=34;
		try {
			n1.doValidate();
		}
		catch(TakeMyCallException e) {
			System.out.println("you will get a call from hr");
		}
		catch(TakeRetestException e) {
			System.out.println("you need to take the retest");
		}
	}

}
