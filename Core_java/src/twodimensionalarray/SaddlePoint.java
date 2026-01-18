package twodimensionalarray;

public class SaddlePoint {

    public static void findSaddlePoint(int[][] a) {
        int r = a.length;
        int c = a[0].length;
        boolean found = false;

        for (int i = 0; i < r; i++) {

            // Find minimum in row i
            int minCol = 0;
            for (int j = 1; j < c; j++) {
                if (a[i][j] < a[i][minCol]) {
                    minCol = j;
                }
            }

            // Check if this is maximum in its column
            boolean isSaddle = true;
            for (int k = 0; k < r; k++) {
                if (a[k][minCol] > a[i][minCol]) {
                    isSaddle = false;
                    break;
                }
            }

            if (isSaddle) {
                System.out.println("Saddle Point = " + a[i][minCol] +
                        " at position (" + i + "," + minCol + ")");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Saddle Point");
        }
    }

    public static void main(String[] args) {
        int[][] a = {
            {3, 1, 3},
            {3, 2, 4},
            {0, 1, 5}
        };

        findSaddlePoint(a);
    }
}

