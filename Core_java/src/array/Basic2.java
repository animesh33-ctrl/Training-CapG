package array;

import java.util.Scanner;

public class Basic2 {
	static Scanner sc = new Scanner(System.in);

	public static int sumArray() {
		System.out.print("Enter the array size : ");
		int a[] = new int[sc.nextInt()];
		System.out.print("Enter the array elements : ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int sum = 0;
		System.out.print("Printing the Integer array elements : ");
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			System.out.print(a[i] + " ");
		}
		System.out.println("\n-----------------------------");
		return sum;
	}

	public static void sumEvenOddArray() {
		System.out.print("Enter the array size : ");
		int a[] = new int[sc.nextInt()];
		System.out.print("Enter the array elements : ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int even = 0,odd=0;
		System.out.print("Printing the Integer array elements : ");
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0)
			even += a[i];
			else odd+=a[i];
			System.out.print(a[i] + " ");
		}
		System.out.println("\n-----------------------------");
		System.out.println("EvenSum : "+even+" OddSum : "+odd);
		return ;
	}

	public static void main(String[] args) {
		System.out.println(sumArray());
		sumEvenOddArray();
	}
}
