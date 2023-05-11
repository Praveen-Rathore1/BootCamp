package com.app.bank.BankAppJava.service;

import java.sql.Connection;
import java.sql.SQLException;

import com.app.bank.BankAppJava.DBConnection;
import com.app.bank.BankAppJava.model.Transaction;
import com.app.bank.BankAppJava.repo.TransactionRepo;

public class TransactionService {
	
	static Connection con = DBConnection.getConnection();
	static String sql = "";

	public static double getBalance(Long accountNo) {
		double balance = 0;
		try {

			balance = TransactionRepo.getAccountBalance(accountNo);
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		return balance;
	}

	public static Integer transferMoney(Transaction txn) throws SQLException 
	{
		Integer result = 0;

		try {
			result = TransactionRepo.transferAmmountToOtherAccount(txn);

		} catch (Exception e) {
			e.printStackTrace();
			con.rollback();
		}
		return result;
	}



}
