package Operator;

public class Ternary {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println(false ? "stm1":"stm2");
		System.out.println(true ? "stm1":"stm2");
		String res = true ? "stm1":"stm2";
		System.out.println(res);
	}
}
