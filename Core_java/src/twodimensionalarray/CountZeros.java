package twodimensionalarray;

public class CountZeros {

    public static int countZero(int[][] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 3},
            {0, 5, 0},
            {7, 8, 9}
        };

        int zeros = countZero(matrix);
        System.out.println("Number of zero elements = " + zeros);
    }
}

