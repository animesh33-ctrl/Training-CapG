package array.assignments;

public class DuplicateElements {
	
	public static void findRepeated(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (arr[i] == -1) continue; // mark used

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = -1; // mark duplicate
                }
            }

            if (count > 1) {
                System.out.println(arr[i] + " repeated " + count + " times");
            }
        }
    }

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 4, 1, 5, 1, 4 };
		findRepeated(arr);
	}
}
