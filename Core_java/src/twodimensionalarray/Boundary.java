package twodimensionalarray;

public class Boundary {

	public static void printBoundary(int[][] arr) {
		int r = arr.length;
		int c = arr[0].length;

		// Top row
		for (int j = 0; j < c; j++)
			System.out.print(arr[0][j] + " ");

		// Right column (excluding first and last)
		for (int i = 1; i < r - 1; i++)
			System.out.print(arr[i][c - 1] + " ");

		// Bottom row (if more than one row)
		if (r > 1) {
			for (int j = c - 1; j >= 0; j--)
				System.out.print(arr[r - 1][j] + " ");
		}

		// Left column (excluding first and last)
		if (c > 1) {
			for (int i = r - 2; i >= 1; i--)
				System.out.print(arr[i][0] + " ");
		}
	}

	public static void printArray(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		System.out.println("Original Array : ");
		printArray(arr);
		System.out.println();
		printBoundary(arr);
	}
}
