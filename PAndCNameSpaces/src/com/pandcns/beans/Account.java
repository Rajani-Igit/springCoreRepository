package com.pandcns.beans;

import java.util.Date;

public class Account {
	private int accNo;
	public String toString() {
		return "Account [accNo=" + accNo + ", dt=" + dt + ", accNmae=" + accNmae + ", balance=" + balance + "]";
	}
	private Date dt; 
	private String accNmae;
	private float balance;
	public Account(int accNo, Date dt, String accNmae, float balance) {
		super();
		this.accNo = accNo;
		this.dt = dt;
		this.accNmae = accNmae;
		this.balance = balance;
	}
	
	/*public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public void setDt(Date dt) {
		this.dt = dt;
	}
	public void setAccNmae(String accNmae) {
		this.accNmae = accNmae;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}*/
	

}
