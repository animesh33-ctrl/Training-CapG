package array;

public class RemoveDuplicate {
	
	
	public static int[] removeDuplicates(int[] a) {
		int n = a.length;
		int[] temp = new int[n];
		int k = 0;

		for (int i = 0; i < n; i++) {
			boolean isDuplicate = false;

			for (int j = 0; j < k; j++) {
				if (a[i] == temp[j]) {
					isDuplicate = true;
					break;
				}
			}

			if (!isDuplicate) {
				temp[k++] = a[i];
			}
		}

		int[] result = new int[k];
		for (int i = 0; i < k; i++) {
			result[i] = temp[i];
		}
		return result;
	}

	public static void main(String[] args) {
		int[] a = { 5, 2, 5, 3, 2, 7, 3 };

		int[] res = removeDuplicates(a);

		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}
}
