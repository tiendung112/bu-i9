package internatinonal;

import java.util.Scanner;

public class SchoolManagement {

	public static void main(String[] args) {
		InternationSchool [] ds;
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so truong hoc:");
		n = Integer.parseInt(scanner.nextLine());
		
		ds = new InternationSchool[n];
		
		for(int i =0 ; i<n;i++) {
			System.out.println("nhap vao thong tin truong hoc thu"+(i+1));
			InternationSchool is = new InternationSchool();
			is.input();
			ds[i]=is;
		}
		System.out.println("hien thi cac truong quoc te");
		for(InternationSchool is:ds) {
			
			is.display();
		}
	
	
	
	
	}

}
