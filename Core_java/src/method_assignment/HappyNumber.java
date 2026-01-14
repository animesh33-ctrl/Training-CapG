package method_assignment;

import java.util.Scanner;

public class HappyNumber {

	private static int power(int b, int p) {
		if (p == 0)
			return 1;
		return b * power(b, p - 1);
	}

	private static int sumOfSquare(int num) {
		if (num != 0) {
			int sum = 0;
			while (num > 0) {
				sum += power((num % 10), 2);
				num /= 10;
			}
			return sum;
		}
		return 0;
	}

	public static boolean isHappy(int n) {
		int slow = n;
		int fast = sumOfSquare(n);
//        System.out.printf("At First -> Slow = %d Fast = %d\n",slow,fast);
//		int i = 0;
		while (fast != 1 && slow != fast) {
			slow = sumOfSquare(slow);
//            System.out.println("At Loop "+i+" Previous Fast : "+sumOfSquare(fast));
			fast = sumOfSquare(sumOfSquare(fast));
//            System.out.printf("At Loop %d -> Slow = %d Fast = %d\n",i++,slow,fast);
		}

		return fast == 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(isHappy(sc.nextInt()));
		sc.close();
	}
}
