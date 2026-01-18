package array.assignments;

public class ProductOfElements {
	public static int returnProduct(int a[]) {
		int product = 1;
		for (int i = 0; i < a.length; i++) {
			product *= a[i];
		}
		return product;
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
		System.out.println("Product of the elements of the array : " + returnProduct(arr));

	}
}
