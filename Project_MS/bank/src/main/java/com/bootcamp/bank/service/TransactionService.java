package com.bootcamp.bank.service;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.bootcamp.bank.DBConnection;
import com.bootcamp.bank.dao.TransactionRepo;
import com.bootcamp.bank.model.Transaction;

@Service
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
