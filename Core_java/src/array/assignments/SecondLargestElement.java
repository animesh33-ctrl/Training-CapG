package array.assignments;

public class SecondLargestElement {
	public static void secondLargestElement(int a[]) {
		int lr = 0, slr = 0;
		for (int i = 0; i < a.length; i++) {
			if (lr < a[i]) {
				slr = lr;
				lr = a[i];
			} else if (a[i] > slr && a[i] != lr)
				slr = lr;
		}
		if (slr == Integer.MIN_VALUE)
			System.out.println("No second largest element");
		else
			System.out.println("Second Largest Element: " + slr);
	}

	public static void printArray(int a[]) {
		System.out.print("Original Array : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3 };
		printArray(arr);
		secondLargestElement(arr);
	}
}
