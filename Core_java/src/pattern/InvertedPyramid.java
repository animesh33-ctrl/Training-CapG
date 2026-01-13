package pattern;

import java.util.Scanner;

public class InvertedPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter odd number: ");
        int n = sc.nextInt();   // e.g. 5

        int mid = n / 2;

        // Upper part including middle
        for (int i = 0; i <= mid; i++) {
            for (int s = 0; s < i; s++)
                System.out.print(" ");
            for (int j = 0; j < n - 2 * i; j++)
                System.out.print("*");
            System.out.println();
        }

        // Lower part
        for (int i = mid - 1; i >= 0; i--) {
            for (int s = 0; s < i; s++)
                System.out.print(" ");
            for (int j = 0; j < n - 2 * i; j++)
                System.out.print("*");
            System.out.println();
        }
        sc.close();
    }
}
