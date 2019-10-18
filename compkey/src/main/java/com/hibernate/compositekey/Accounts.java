package com.hibernate.compositekey;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Accounts 
{
	@Id
	private CompoundKey compoundkey;
	private int accountBalance;
	
	
	public CompoundKey getCompoundkey() {
		return compoundkey;
	}
	public void setCompoundkey(CompoundKey compoundkey) {
		this.compoundkey = compoundkey;
	}
	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	
	
	
	
	
}
