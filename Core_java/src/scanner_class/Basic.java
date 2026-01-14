package scanner_class;

import java.util.Scanner;

public class Basic {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		byte age = sc.nextByte();
		sc.nextLine();
		String name = sc.nextLine();
		short yearOfBirth = sc.nextShort();

		float heightInMeters = sc.nextFloat();

		double weightInKg = sc.nextDouble();


		boolean isStudent = sc.nextBoolean();
		char gender = sc.next().charAt(0);

		System.out.println("Personal Information:");
		System.out.println("Name : " + name);
		System.out.println("Age: " + age);
		System.out.println("Year of Birth: " + yearOfBirth);
		System.out.println("Height: " + heightInMeters + " meters");
		System.out.println("Weight: " + weightInKg + " kg");
		System.out.println("Gender: " + gender);
		System.out.println("Student: " + isStudent);
		
		sc.close();
	}
}
