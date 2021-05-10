package school;

import java.util.Scanner;

public class School implements Ischool{
	private String schoold;
	private String schoolName;
	private String address;
	private String area;
	private String foundationDate;
	private String totalStudent;
	public School() {
		super();
	}
	public School(String schooId, String schoolName, String address, String area, String foundationDate, String  totalStudent) {
		super();
		this.schoold = schooId;
		this.schoolName = schoolName;
		this.address = address;
		this.area = area;
		this.foundationDate =foundationDate;
		this.totalStudent = totalStudent;
	}
	public String getSchoold() {
		return schoold;
	}
	public void setSchoold(String schoold) {
		this.schoold = schoold;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getFoundationDate() {
		return foundationDate;
	}
	public void setFoundationDate(String foundationDate) {
		this.foundationDate = foundationDate;
	}
	public String getTotalStudent() {
		return totalStudent;
	}
	public void setTotalStudent(String totalStudent) {
		this.totalStudent = totalStudent;
	}
	@Override
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("schoolId ");
		schoold = scanner.nextLine();
		System.out.println("school name ");
		schoolName = scanner.nextLine();
		System.out.println("address ");
		address = scanner.nextLine();
		System.out.println("area ");
		area =scanner.nextLine();
		System.out.println("foundationDate ");
		foundationDate =scanner.nextLine();
		System.out.println("totalStudent ");
		totalStudent = scanner.nextLine();
	}
	@Override
	public void display() {
		
		System.out.println("\tschoolId "+schoold);
		System.out.println("\tschoolName "+schoolName);
		System.out.println("\taddress "+address);
		System.out.println("\tarea "+area);
		System.out.println("\tfoundationDate "+foundationDate);
		System.out.println("\ttotalStudent" + totalStudent );
	}
	
	
	
	
	
}