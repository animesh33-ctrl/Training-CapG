package method_assignment;

import java.util.Scanner;

public class Palindrome {

	private static String isPalindrome(int num) {
		if (num == 0)
			return "Good";
		int org = num, rev = 0;
		for (; num > 0; num /= 10)
			rev = rev * 10 + num % 10;
		return (org == rev) ? "Good" : "Bad";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		System.out.println(isPalindrome(sc.nextInt()));
		sc.close();
	}
}
