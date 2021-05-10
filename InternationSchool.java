package internatinonal;

import java.util.Scanner;

import school.School;

public class InternationSchool  extends School{
	private String language;
	private String fee;
	
	public InternationSchool() {
		
	}
	public InternationSchool(String language , String fee,String schooId, String schoolName, String address, String area, String foundationDate, String  totalStudent) {
		super(schooId , schoolName , address , area,foundationDate ,totalStudent);
		this.language = language;
		this.fee = fee;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getFee() {
		return fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}
	@Override
	public void input() {
		super.input();
		Scanner scanner = new Scanner(System.in);
		System.out.println("language ");
		language =scanner.nextLine();
		System.out.println("fee ");
		fee = scanner.nextLine();
	}
	@Override
	public void display() {
		super.display();
		System.out.println("\tlanguage "+language);
		System.out.println("\tfee "+fee );
		System.out.println();
	}
}
