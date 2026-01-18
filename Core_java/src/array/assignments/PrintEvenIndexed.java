package array.assignments;

public class PrintEvenIndexed {	
	
	public static void printEvenIndexedArray(int a[]) {
		System.out.print("Even Indexed Array Elements : ");
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0)
				System.out.print(a[i] + " ");
		}
		System.out.println();
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
		printEvenIndexedArray(arr);

	}
}
