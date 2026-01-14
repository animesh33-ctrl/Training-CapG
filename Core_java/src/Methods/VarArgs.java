package methods;

public class VarArgs {
	public static void add(int... n) {
		int sum = 0;
		for (int i : n) {
			sum += i;
		}
		System.out.println(sum);
	}

	public static void stringConcatenation(String... arr) {
		String s = "";
		for (String i : arr) {
			s += i;
		}
		System.out.println("Concatenated String : " + s);
	}

	public static void greatest(double... arr) {
		double dl = 0.0d;
		for (double d : arr)
			if (d > dl)
				dl = d;
		System.out.println("Greatest : " + dl);
	}

	public static void main(String[] args) {
//		add(1, 2, 3, 4);

		stringConcatenation("abcd", "efgh", "ijkl");
		greatest(1.1d, 1.2d, 1.3d, 1.4d);
	}
}
