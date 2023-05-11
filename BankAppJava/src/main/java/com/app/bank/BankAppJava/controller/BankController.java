package com.app.bank.BankAppJava.controller;

import java.sql.SQLException;

import com.app.bank.BankAppJava.model.BankAccount;
import com.app.bank.BankAppJava.model.Transaction;
import com.app.bank.BankAppJava.service.BankAccountService;
import com.app.bank.BankAppJava.service.TransactionService;

public class BankController {	
	
	public static String createAccount(BankAccount accDetails) {
		return BankAccountService.createAccount(accDetails);
	}

	public static Boolean loginAccount(BankAccount accDetails) {
		return BankAccountService.loginAccount(accDetails);
	}

	public static double getBalance(Long accountNo) {

		return TransactionService.getBalance(accountNo);
	}

	public static Integer transferMoney(Transaction txn) throws SQLException {
		return TransactionService.transferMoney(txn);
	}
}
