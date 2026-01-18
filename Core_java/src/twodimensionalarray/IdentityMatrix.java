package twodimensionalarray;

public class IdentityMatrix {

    public static boolean isIdentity(int[][] arr) {
        int n = arr.length;

        // Must be square matrix
        for (int i = 0; i < n; i++) {
            if (arr[i].length != n)
                return false;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j && arr[i][j] != 1)
                    return false;
                if (i != j && arr[i][j] != 0)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] a = {
            {1, 0, 0},
            {0, 1, 1},
            {0, 0, 1}
        };

        if (isIdentity(a))
            System.out.println("Identity Matrix");
        else
            System.out.println("Not an Identity Matrix");
    }
}
