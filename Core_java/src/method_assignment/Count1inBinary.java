package method_assignment;

import java.util.Scanner;

public class Count1inBinary {

	public static String decimalToBinary(int n) {
		if (n == 0)
			return "0";
		StringBuilder binary = new StringBuilder();
		while (n > 0) {
			binary.insert(0, n % 2); // Prepend the remainder
			n = n / 2;
		}
		return binary.toString();
	}

	private static int count1s(int decimal) {
		int count = 0;
		String binary = decimalToBinary(decimal);
		System.out.println("Binary equivalent: " + binary);
		for (int i = 0; i < binary.length(); i++) {
			if (binary.charAt(i) == '1')
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		System.out.println("Number of 1's in the binary : " + count1s(sc.nextInt()));
		sc.close();
	}
}