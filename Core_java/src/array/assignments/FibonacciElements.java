package array.assignments;

public class FibonacciElements {
	public static boolean isFibonacci(int n) {
        if (n < 0) return false;
        int a = 0, b = 1;
        if (n == 0 || n == 1) return true;

        while (b < n) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b == n;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 8, 10, 13, 21, 22};

        System.out.print("Fibonacci elements: ");
        for (int x : arr) {
            if (isFibonacci(x)) {
                System.out.print(x + " ");
            }
        }
    }
}
