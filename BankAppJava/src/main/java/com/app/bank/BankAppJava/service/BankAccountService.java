package com.app.bank.BankAppJava.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

import com.app.bank.BankAppJava.DBConnection;
import com.app.bank.BankAppJava.model.BankAccount;
import com.app.bank.BankAppJava.model.Transaction;
import com.app.bank.BankAppJava.repo.BankAccountRepo;

public class BankAccountService {
	
	static Connection con = DBConnection.getConnection();
	static String sql = "";

	public static String createAccount(BankAccount accDetails) {
		
		String accountNo = null;
		try {
			
			 accountNo = BankAccountRepo.createNewAccount(accDetails);

		} catch (SQLIntegrityConstraintViolationException e) {
			System.out.println("Username Not Available!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return accountNo;
	}

	public static boolean loginAccount(BankAccount accDetails) 
	{
		String name = accDetails.getUserName();
		String passCode = accDetails.getPassword();
		Transaction txn = new Transaction();
		try {
			if (name == "" || passCode == "") {
				System.out.println("All Field Required!");
				return false;
			}
			sql = "select * from customer where cname='" + name + "' and pass_code=" + passCode;
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

			if (rs.next()) {

				int ch = 5;
				int amt = 0;
				Long senderAc = rs.getLong("ac_no");
				;
				int receiveAc;
				while (true) {
					try {
						System.out.println("Hallo, " + rs.getString("cname"));
						System.out.println("1)Transfer Money");
						System.out.println("2)View Balance");
						System.out.println("5)LogOut");

						System.out.print("Enter Choice:");
						ch = Integer.parseInt(sc.readLine());
						if (ch == 1) {
							System.out.print("Enter Receiver A/c No:");
							receiveAc = Integer.parseInt(sc.readLine());
							System.out.print("Enter Amount:");
							amt = Integer.parseInt(sc.readLine());

							if (TransactionService.transferMoney(txn) != 0) {
								System.out.println("MSG : Money Sent Successfully!\n");
							} else {
								System.out.println("ERR : Failed!\n");
							}
						} else if (ch == 2) {

							TransactionService.getBalance(senderAc);
						} else if (ch == 5) {
							break;
						} else {
							System.out.println("Err : Enter Valid input!\n");
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			} else {
				return false;
			}
			return true;
		} catch (SQLIntegrityConstraintViolationException e) {
			System.out.println("Username Not Available!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}


}
