package com.bootcamp.bank.model;

public class BankAccount {
	
	private String name;
	private String userName;
	private String password;
	private String email;
	private String mobile;
	private String dob;
	private String pan;
	private String aadhar;
	private String address;
	private String accountNo;
	
	public BankAccount()
	{
		System.out.println("Bank Account object returned");
	}
	
	
	public BankAccount(String name, String userName, String password, String email, String mobile, String dob, String pan, String aadhar, String address, String accountNo) {
		this.name = name;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.mobile = mobile;
		this.dob = dob;
		this.pan = pan;
		this.aadhar = aadhar;
		this.address = address;
		this.accountNo = accountNo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
}
