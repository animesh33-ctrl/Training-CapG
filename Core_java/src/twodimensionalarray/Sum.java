package twodimensionalarray;

import java.util.Scanner;

public class Sum {

	public static int[] rowWiseSum(int arr[][]) {
		int c[] = new int[arr.length];
		int k = 0;
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = 0;
			for (int j = 0; j < arr[0].length; j++) {
				sum += arr[i][j];
			}
			c[k++] = sum;
		}
		return c;
	}

	public static int[] columnWiseSum(int arr[][]) {
		return null;
	}

	public static void printArray(int a[]) {
//		System.out.print("Original Array : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[2][3];
		System.out.printf("Enter %d elements : \n", arr.length * arr[0].length);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Array : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		int c[] = rowWiseSum(arr);
		printArray(c);

		sc.close();
	}
}
