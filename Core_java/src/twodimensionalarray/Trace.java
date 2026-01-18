package twodimensionalarray;

public class Trace {
	public static int trace(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i][i];
		}
		return sum;
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
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("Original Array : ");
		printArray(matrix);
		System.out.println("-------------------------------------------");
		System.out.println("Trace = " + trace(matrix));
	}
}
