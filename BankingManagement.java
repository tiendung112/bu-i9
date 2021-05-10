package banking;

import java.util.Scanner;

public class BankingManagement {
	public static void main(String args[]) {
		BankCustomer[] mang;
		int n;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so Kh:");
		n = Integer.parseInt(scanner.nextLine());
		
		mang = new BankCustomer[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin Kh thu:" +(i+1));
			BankCustomer bc = new BankCustomer();
			bc.input();
			mang[i] = bc;
		}
		
		System.out.println("\nThong tin Kh vua nhap:");
		for (BankCustomer bc : mang) {
			bc.display();
		}
	}
}