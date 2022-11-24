package com.nc.model;

public class CurrentAccount implements Account{
	
	@Override 
	public String createAccount() {
		return "Account has been created successfully...from currrent account";
	}

}
