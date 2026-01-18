package array;

import java.util.Scanner;

public class Basic {
	static Scanner sc = new Scanner(System.in);

	public static void takeIntArray() {
		System.out.print("Enter the array size : ");
		int a[] = new int[sc.nextInt()];
		System.out.print("Enter the array elements : ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		System.out.print("Printing the Integer array elements : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\n-----------------------------");
	}

	public static void takeCharArray() {
		System.out.print("Enter the array size : ");
		char a[] = new char[sc.nextInt()];
		System.out.print("Enter the array elements : ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.next().charAt(0);
		}

		System.out.print("Printing the Character array elements : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\n-----------------------------");
	}

	public static void takeBooleanArray() {
		System.out.print("Enter the array size : ");
		boolean a[] = new boolean[sc.nextInt()];
		System.out.print("Enter the array elements : ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextBoolean();
		}

		System.out.print("Printing the Boolean array elements : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\n-----------------------------");
	}

	public static void takeFloatArray() {
		System.out.print("Enter the array size : ");
		float a[] = new float[sc.nextInt()];
		System.out.print("Enter the array elements : ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextFloat();
		}

		System.out.print("Printing the Float array elements : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\n-----------------------------");
	}

	public static void takeStringArray() {
		System.out.print("Enter the array size : ");
		String a[] = new String[sc.nextInt()];
		System.out.print("Enter the array elements : ");
		sc.nextLine();
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextLine();
		}

		System.out.print("Printing the String array elements : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\n-----------------------------");
	}

	public static void main(String[] args) {
		takeIntArray();
		takeCharArray();
		takeBooleanArray();
		takeFloatArray();
		takeStringArray();
	}
}
