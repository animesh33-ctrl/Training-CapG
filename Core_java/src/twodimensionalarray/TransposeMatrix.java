package twodimensionalarray;

public class TransposeMatrix {

    public static int[][] transposeMatrices(int arr1[][]) {
        int temp[][] = new int[arr1[0].length][arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                temp[j][i] = arr1[i][j];
            }
        }
        return temp;
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
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 } };

        System.out.println("Original Array : ");
        printArray(arr);

        System.out.println("Transpose Array : ");
        int t[][] = transposeMatrices(arr);
        printArray(t);
    }
}
