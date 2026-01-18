package array.assignments;

public class RemoveElement {
	public static int[] removeElementFromIndex(int arr[], int index) {
	    int[] c = new int[arr.length - 1];

	    for (int i = 0; i < c.length; i++) {
	        if (i < index) {
	            c[i] = arr[i];
	        } else {
	            c[i] = arr[i + 1];
	        }
	    }
	    return c;
	}


	public static void printArray(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40 };
		printArray(arr);
		int []c = removeElementFromIndex(arr, 1);
		printArray(c);
	}
}
