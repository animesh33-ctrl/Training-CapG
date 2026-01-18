package array.assignments;

public class LeftRotate {
	static void leftRotate(int[] a, int k) {
		int n = a.length;
		k = k % n;
		int[] temp = new int[n];
		int idx = 0;

		for (int i = k; i < n; i++)
			temp[idx++] = a[i];
		for (int i = 0; i < k; i++)
			temp[idx++] = a[i];

		for (int x : temp)
			System.out.print(x + " ");
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		leftRotate(a, 2);
	}

}
