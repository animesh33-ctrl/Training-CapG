package array.assignments;

public class ReverseArray2 {
    public static int[] reverse(int[] arr) {
        int n = arr.length;
        int[] rev = new int[n];

        for (int i = 0; i < n; i++) {
            rev[i] = arr[n - 1 - i];
        }
        return rev;
    }

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};

        int[] r = reverse(a);

        System.out.print("Reversed Array: ");
        for (int i = 0; i < r.length; i++) {
            System.out.print(r[i] + " ");
        }
    }
}

