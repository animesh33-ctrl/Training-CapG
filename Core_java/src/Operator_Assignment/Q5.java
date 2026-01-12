package Operator_Assignment;

public class Q5 {
	public static void main(String[] args) {
		char ch = 'L';
		int n = (int)ch;
		if(n>=65 && n<=90) {
			ch = (char)(n+(97-65));
		}
		else {
			ch = (char)(n-(97-65));
		}
		System.out.println(ch);
	}
}
