package array.assignments;

public class NthLargest {
	public static void main(String[] args) {
		int[] a = { 5, 1, 9, 3, 7 };
		int n = 2; // 2nd largest

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		System.out.println(n + "th largest = " + a[n - 1]);
	}
}
