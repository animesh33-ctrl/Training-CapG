package array;

import java.util.Scanner;

public class FindSum {
	static Scanner sc = new Scanner(System.in);

	public static int[] takeIntArray() {
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
		return a;
	}
	
	public static void findSum(int a[]) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("Sum : "+sum);
	}
	
	public static void main(String[] args) {
		int a[] = takeIntArray();
		findSum(a);
	}
}
