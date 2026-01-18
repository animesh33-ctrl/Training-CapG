package twodimensionalarray;

public class SearchSortedMatrix {
	public static boolean search(int[][] arr, int key) {
        int r = arr.length;
        int c = arr[0].length;

        int i = 0;
        int j = c - 1;   // top-right

        while (i < r && j >= 0) {
            if (arr[i][j] == key)
                return true;
            else if (arr[i][j] > key)
                j--;      // move left
            else
                i++;      // move down
        }
        return false;
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
		
		int key = 9;

        if (search(matrix, key))
            System.out.println(key + " found");
        else
            System.out.println(key + " not found");
	}
}
