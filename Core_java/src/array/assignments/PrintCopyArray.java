package array.assignments;

public class PrintCopyArray {
	public static void printArray(int a[]) {
		System.out.print("Original Array : ");
        for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
        System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3};
		int arrcopy[] = arr;
		printArray(arrcopy);
	}
}
