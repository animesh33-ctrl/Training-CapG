package array.assignments;

public class FrequencyArray {

	public static void frequency(int[] arr) {
		int n = arr.length;
		boolean[] visited = new boolean[n];

		for (int i = 0; i < n; i++) {
			if (visited[i])
				continue;

			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
					visited[j] = true;
				}
			}

			System.out.println(arr[i] + " -> " + count);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 3, 2, 1, 4 };

		frequency(arr);
	}
}
