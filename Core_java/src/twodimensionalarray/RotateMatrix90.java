package twodimensionalarray;

public class RotateMatrix90 {

	// Transpose
	static void transpose(int[][] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}
	}

	// Reverse each row
	static void reverseRows(int[][] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			int left = 0, right = n - 1;
			while (left < right) {
				int temp = a[i][left];
				a[i][left] = a[i][right];
				a[i][right] = temp;
				left++;
				right--;
			}
		}
	}

	static void rotate90Clockwise(int[][] a) {
		transpose(a);
		reverseRows(a);
	}

	static void print(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println("Original Matrix:");
		print(a);

		rotate90Clockwise(a);

		System.out.println("After 90° Clockwise Rotation:");
		print(a);
	}
}
