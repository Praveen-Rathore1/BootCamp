package com.app.bank.BankAppJava.model;

public class Transaction {
	
	private int transactionId;
	private String tranDetails;
	private double accountBalance;
	private Long accountNo;
	
	public Transaction()
	{
		
	}	
	
	public Transaction(int transactionId, String tranDetails, double accountBalance, Long accountNo) {
		this.transactionId = transactionId;
		this.tranDetails = tranDetails;
		this.accountBalance = accountBalance;
		this.accountNo = accountNo;
	}
	
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public String getTranDetails() {
		return tranDetails;
	}
	public void setTranDetails(String tranDetails) {
		this.tranDetails = tranDetails;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public Long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(Long accountNo) {
		this.accountNo = accountNo;
	}
	


}
