package cus;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.text.ParseException;


public class Customer implements ICustomer{

	private String cusId;
	private String cusName;
	private boolean gender;
	private Date birthday;
	private String address;
	private String email;
	private String telephone;
	
	public Customer() {
		super();
	}

	public Customer(String cusId, String cusName, boolean gender, Date birthday, String address, String email,
			String telephone) {
		super();
		this.cusId = cusId;
		this.cusName = cusName;
		this.gender = gender;
		this.birthday = birthday;
		this.address = address;
		this.email = email;
		this.telephone = telephone;
	}
	

	public String getCusId() {
		return cusId;
	}

	public void setCusId(String cusId) {
		this.cusId = cusId;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	
	
	@Override
	public void input() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Nhap ma:");
	cusId = scanner.nextLine();
	System.out.println("Nhap ten:");
	cusName = scanner.nextLine();
	System.out.println("Gioi tinh:");
	gender = Boolean.parseBoolean(scanner.nextLine());
	System.out.println("Ngay sinh:");
	SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
	try {
		birthday = s.parse(scanner.nextLine());
	} catch (ParseException e) {
		// auto generate catch block
		e.printStackTrace();
	}

	System.out.println("Dia chi:");
	address = scanner.nextLine();
	System.out.println("Email:");
	email = scanner.nextLine();
	System.out.println("SĐT:");
	telephone = scanner.nextLine();

}

	@Override
	public void display() {
		System.out.println("\tMa:" +cusId);
		System.out.println("\tTen" +cusName);
		System.out.println("\tGioi tinh:" +(gender?"Nam":"Nu"));
		System.out.println("\tNgay sinh:" +birthday);
		System.out.println("\tDia chi:" +address);
		System.out.println("\tEmail:" +email);
		System.out.println("\tSĐT:" +telephone);
	}
	
}