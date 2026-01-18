package twodimensionalarray;

public class SpiralMatrix {

	public static void printSpiral(int arr[][]) {
		int top = 0, bottom = arr.length - 1;
		int left = 0, right = arr[0].length - 1;

		while (top <= bottom && left <= right) {
			for (int j = left; j <= right; j++) {
				System.out.print(arr[top][j] + " ");
			}
			top++;
			for (int j = top; j <= bottom; j++) {
				System.out.print(arr[j][right] + " ");
			}
			right--;

			for (int j = right; j >= left; j--) {
				System.out.print(arr[bottom][j] + " ");
			}
			bottom--;
			for (int j = bottom; j >= top; j--) {
				System.out.print(arr[j][left] + " ");
			}
			left++;
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
		System.out.println("-------------------------------------------------------------------");
		printSpiral(arr);
	}
}
