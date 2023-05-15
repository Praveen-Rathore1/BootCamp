package com.bootcamp.bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Repository;

import com.bootcamp.bank.DBConnection;
import com.bootcamp.bank.model.BankAccount;

@Repository
public class BankAccountRepo {

	static Connection con = null;
	static Statement st = null;
	static ResultSet rs = null;
	static PreparedStatement pst = null;

	public static String createNewAccount(BankAccount bankAccount) throws SQLException, ClassNotFoundException {
		if (con == null || con.isClosed()) {
			con = DBConnection.getConnection();
		}
		String sql = "insert into bank_account (name,password,emailId,mobileNumber,DOB,panCard,adharCard,address) "
				+ "values(?,?,?,?,?,?,?,?)";
		pst = con.prepareStatement(sql);
		pst.setString(1, bankAccount.getName());
		pst.setString(2, bankAccount.getPassword());
		pst.setString(3, bankAccount.getEmail());
		pst.setString(4, bankAccount.getMobile());
		pst.setString(5, bankAccount.getDob());
		pst.setString(6, bankAccount.getPan());
		pst.setString(7, bankAccount.getAadhar());
		pst.setString(8, bankAccount.getAddress());

		Integer i = pst.executeUpdate();
		con.commit();
		if (i == 0) {
			throw new SQLException("Account not created");
		}
		return bankAccount.getAccountNo();
	}

	}
