package com.eg;

public class XyzEMail {

	XyzEMail(){
		System.out.println("XyzEMail()");
	}
	
	XyzEMail(String str){
		System.out.println("XyzEMail(String)"+str);
	}
	
	XyzEMail(int i, String str){
		System.out.println("XyzEMail(int, String)"+i+str);
	}
	
	XyzEMail(String str, int i){
		System.out.println("XyzEMail(String, int)"+i+str);
	}
	
	public void sendMail()
	{
		System.out.println("sending the mail.......");
	}
	
	public void recvMail()
	{
		System.out.println("receving the email....");
	}
}
