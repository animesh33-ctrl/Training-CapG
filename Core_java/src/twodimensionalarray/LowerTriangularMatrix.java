package twodimensionalarray;

public class LowerTriangularMatrix {
	public static void printUpperTriangular(int[][] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (j < i)
                		System.out.print(arr[i][j] + " ");
                else
					System.out.print("0 ");
            }
            System.out.println();
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
		System.out.println("-------------------------------------------");
		
		printUpperTriangular(arr);
	}
}
