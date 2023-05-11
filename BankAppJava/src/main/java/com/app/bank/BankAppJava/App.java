package com.app.bank.BankAppJava;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.app.bank.BankAppJava.controller.BankController;
import com.app.bank.BankAppJava.model.BankAccount;
import com.app.bank.BankAppJava.service.BankAccountService;

public class App {
	public static void main(String[] args) {
		BankAccount pojo = new BankAccount();
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		String name = "";
		String pass_code;
		int ch;

		while (true) {
			System.out.println("\n Welcome to Bank \n");
			System.out.println("1) Create Account");
			System.out.println("2) Login Account");

			try {
				System.out.print("\n Enter Input:");
				ch = Integer.parseInt(sc.readLine());

				switch (ch) {
				case 1:
					try {
						System.out.print("Enter Unique UserName:");

						name = sc.readLine();
						pojo.setUserName(name);
						System.out.print("Enter New Password:");
						pass_code = sc.readLine();
						pojo.setPassword(pass_code);

						if (BankController.createAccount(pojo) != null) {
							System.out.println("MSG : Account Created Successfully!\n");
						} else {
							System.out.println("ERR : Account Creation Failed!\n");
						}
					} catch (Exception e) {
						System.out.println(" ERR : Enter Valid Data::Insertion Failed!\n");
					}
					break;

				case 2:
					try {
						System.out.print("Enter UserName:");
						name = sc.readLine();
						pojo.setUserName(name);
						System.out.print("Enter Password:");
						pass_code = sc.readLine();
						pojo.setPassword(pass_code);

						if (BankAccountService.loginAccount(pojo)) {
							System.out.println("MSG : Logout Successfully!\n");
						} else {
							System.out.println("ERR : login Failed!\n");
						}
					} catch (Exception e) {
						System.out.println(" ERR : Enter Valid Data::Login Failed!\n");
					}

					break;

				default:
					System.out.println("Invalid Entry!\n");
				}

				if (ch == 5) {
					System.out.println("Exited Successfully!\n\n Thank You :)");
					break;
				}
			} catch (Exception e) {
				System.out.println("Enter Valid Entry!");
			}
		}
	}

}
