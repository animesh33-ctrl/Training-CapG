package array.assignments;

public class LinearSearch {
	public static void main(String[] args) {
		int[] a = { 4, 7, 1, 9 };
		int key = 7;
		boolean found = false;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				System.out.println("Found at index " + i);
				found = true;
				break;
			}
		}
		if (!found)
			System.out.println("Not Found");
	}
}
