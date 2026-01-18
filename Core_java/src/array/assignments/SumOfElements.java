package array.assignments;

public class SumOfElements {
	public static int returnSum(int a[]) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	public static void printArray(int a[]) {
		System.out.print("Original Array : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		printArray(arr);
		System.out.println("Sum of the elements of the array : " + returnSum(arr));

	}
}
