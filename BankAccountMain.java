package com.blc.elc;

public class BankAccountMain {
	public static void main (String [] args){
		 BankAccount b = new BankAccount();
		 b.setAccountDetails("Rahul", 123456, 5000.0);
		 System.out.println(b.getAccountDetails());
		 }

}
