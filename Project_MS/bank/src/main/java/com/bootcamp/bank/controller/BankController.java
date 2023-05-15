package com.bootcamp.bank.controller;

import java.sql.SQLException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.bank.model.BankAccount;
import com.bootcamp.bank.model.Transaction;
import com.bootcamp.bank.service.BankAccountService;
import com.bootcamp.bank.service.TransactionService;

@RestController
@RequestMapping("/bank")
public class BankController {
		
	@PostMapping("/createAccount")
	public static String createAccount(BankAccount accDetails) {
		return BankAccountService.createAccount(accDetails);
	}
	
	@PostMapping("/loginAccount")
	public static Boolean loginAccount(BankAccount accDetails) {
		return BankAccountService.loginAccount(accDetails);
	}
	
	@RequestMapping("/getBalance")
	public static double getBalance(Long accountNo) {

		return TransactionService.getBalance(accountNo);
	}
	
	@PostMapping("/transferMoney")
	public static Integer transferMoney(Transaction txn) throws SQLException {
		return TransactionService.transferMoney(txn);
	}
	

}
