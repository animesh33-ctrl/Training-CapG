package MethodAssignment;

public class DecimalToOctal {

	private static int decimalToOctal(int num) {
		if (num == 0)
			return 0;
		StringBuilder str = new StringBuilder();
		while (num > 0) {
			str.insert(0, num % 8);
			num /= 8;
		}
		return Integer.parseInt(str.toString());
	}

	public static void main(String[] args) {
		int num = 10;
		System.out.println(decimalToOctal(num));
	}
}
