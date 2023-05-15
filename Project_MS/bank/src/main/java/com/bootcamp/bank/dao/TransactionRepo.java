package com.bootcamp.bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Repository;

import com.bootcamp.bank.DBConnection;
import com.bootcamp.bank.model.Transaction;

@Repository
public class TransactionRepo {

	static Connection con = null;
	static Statement st = null;
	static ResultSet rs = null;
	static PreparedStatement pst = null;

	public static Double getAccountBalance(Long accountNumber) throws ClassNotFoundException, SQLException {
		Double accountBalance = 0.0;
		if (con == null || con.isClosed()) {
			con = DBConnection.getConnection();
		}

		String sql = "select balance from transactions where accountNumber=" + accountNumber
				+ " order by transactionId desc limit 1;";
		st = con.createStatement();
		rs = st.executeQuery(sql);
		while (rs.next()) {
			accountBalance = rs.getDouble("balance");
		}
		return accountBalance;
	}

	public static Integer transferAmmountToOtherAccount(Transaction txn) throws ClassNotFoundException, SQLException {
		
		if (con == null || con.isClosed()) {
			con = DBConnection.getConnection();
		}
		String sql = "insert into transactions (balance,accountNumber,trans_details) values(?,?,?)";
		pst = con.prepareStatement(sql);
		pst.setDouble(1, txn.getAccountBalance());
		pst.setLong(2, txn.getAccountNo());
		pst.setString(3, txn.getTranDetails());
		Integer i = pst.executeUpdate();
		return i;
	}

}
