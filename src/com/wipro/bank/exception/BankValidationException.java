package com.wipro.bank.exception;

public class BankValidationException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public BankValidationException(String str) {
		super(str);
		System.out.println(str);
	}
	@Override
	public String toString() {
		return "Invalid Data";
	}
}
