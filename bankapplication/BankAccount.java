package com.te.bankapplication;

public class BankAccount {

	private double balance;

	public BankAccount(double balance) {
		this.balance = balance;
	}

	public void withDraw(double amount) {
		
	   if(this.balance>amount) {
		   System.out.println("Your balance is: "+ this.balance);
		   System.out.println("Withdrawn amount: "+amount);
		   this.balance-=amount;
		   System.out.println("Your current balance is: "+ this.balance);
	   } else {
	   throw new InsufficientBalanceException("Insufficient Balance");		
	}
	}
}


