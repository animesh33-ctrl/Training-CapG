package array.assignments;

public class ZigZagMerge {
	public static void main(String[] args) {
		int[] a = { 1, 3, 5 };
		int[] b = { 2, 4, 6 };
		int i = 0, j = 0;

		while (i < a.length || j < b.length) {
			if (i < a.length)
				System.out.print(a[i++] + " ");
			if (j < b.length)
				System.out.print(b[j++] + " ");
		}
	}
}
