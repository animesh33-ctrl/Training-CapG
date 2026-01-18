package array.assignments;

public class ElementInIndex {
	public static int[] addElementInIndex(int arr[], int ele, int index) {
		int[] c = new int[arr.length + 1];

		for (int i = 0; i < c.length; i++) {
			if (i < index) {
				c[i] = arr[i];
			} else if (i == index) {
				c[i] = ele;
			} else {
				c[i] = arr[i - 1];
			}
		}
		return c;
	}

	public static void printArray(int a[]) {
//		System.out.print("Original Array : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40 };
		printArray(arr);
		int c[] = addElementInIndex(arr, 22, 1);
		printArray(c);
	}
}
