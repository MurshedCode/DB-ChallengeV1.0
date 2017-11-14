package com.db.awmd.challenge.domain;

import lombok.Data;


public class Account {

	private double balance;
	
	public Account() {
		balance = 0;
	}
	
	public boolean transfer(double amount) {
		double newBalance = balance - amount;
		if (newBalance>0) {
			balance = newBalance;
		} 
		return newBalance>0;
	}
	
	public void addMoney(double money) {
		balance+=money;
	}
	
}
	
  
