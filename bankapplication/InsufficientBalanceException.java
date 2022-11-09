package com.te.bankapplication;

public class InsufficientBalanceException extends RuntimeException {
	
	public InsufficientBalanceException(String message) {
		super(message);
	}

}
