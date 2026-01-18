package twodimensionalarray;

public class EqualMatrices {
	public static boolean areEqual(int[][] a, int[][] b) {
		if (a.length != b.length)
			return false;

		for (int i = 0; i < a.length; i++) {
			if (a[i].length != b[i].length)
				return false;

			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] != b[i][j])
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[][] m1 = { { 1, 2, 3 }, { 4, 55, 6 } };

		int[][] m2 = { { 1, 2, 3 }, { 4, 5, 6 } };

		if (areEqual(m1, m2))
			System.out.println("Matrices are Equal");
		else
			System.out.println("Matrices are Not Equal");
	}
}
