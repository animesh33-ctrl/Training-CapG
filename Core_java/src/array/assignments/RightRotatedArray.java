package array.assignments;

public class RightRotatedArray {
	public static void rightRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; 

        int[] temp = new int[n];
        int index = 0;

        for (int i = n - k; i < n; i++) {
            temp[index++] = arr[i];
        }

        for (int i = 0; i < n - k; i++) {
            temp[index++] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        rightRotate(arr, k);
    }
}
