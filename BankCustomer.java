package banking;

import java.util.Scanner;

import cus.Customer;

public class BankCustomer extends Customer {
	
	private String accountNumber;
	private double balance;
	
	public BankCustomer() {
		super();
	}
	
	public BankCustomer(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public void input() {
		super.input();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap stk:");
		accountNumber = scanner.nextLine();
		System.out.println("Nhap so du:");
		balance = scanner.nextDouble();
	}

	@Override
	public void display() {
		System.out.println("Khach hang:");
		super.display();
		System.out.println("\tSTK:" +accountNumber);
		System.out.println("\tSo du:" +balance);
		
	}
	
	
}