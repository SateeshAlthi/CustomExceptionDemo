package com.te.bankapplication;

public class BankAccountTest {
	
	public static void main(String[] args) {
		
		BankAccount bankAccount = new BankAccount(10000);
		try {
		bankAccount.withDraw(11000);
		}catch (InsufficientBalanceException e){
			System.out.println(e.getMessage());	
		}	
	}

}
