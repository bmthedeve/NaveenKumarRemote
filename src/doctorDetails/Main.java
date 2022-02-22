package doctorDetails;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println(createDoctorDetails());
	}
	
	public static Doctor createDoctorDetails() {
		System.out.println("Enter Hospital Name");
		String hospitalName = sc.next();
		System.out.println("Enter Contact Number");
		long contactNumber = sc.nextLong();
		System.out.println("Enter City");
		String city = sc.next();
		System.out.println("Enter Doctor Id");
		String doctorId = sc.next();
		System.out.println("Enter Doctor Name");
		String doctorName = sc.next();
		System.out.println("Enter Specialization");
		String specialization = sc.next();
		Doctor doctor = new Doctor(doctorId, doctorName, specialization, new Hospital(hospitalName, contactNumber, city));
		return doctor;
	}
}
