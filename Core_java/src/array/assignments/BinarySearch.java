package array.assignments;

public class BinarySearch {
	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 7, 9 };
		int key = 7;
		int l = 0, r = a.length - 1;

		while (l <= r) {
			int mid = (l + r) / 2;
			if (a[mid] == key) {
				System.out.println("Found at " + mid);
				return;
			} else if (a[mid] < key)
				l = mid + 1;
			else
				r = mid - 1;
		}
		System.out.println("Not Found");
	}
}
