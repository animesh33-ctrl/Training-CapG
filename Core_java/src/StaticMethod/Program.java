package StaticMethod;

public class Program {
	public static boolean isPalindrome(int a) {
		int org = a, rev = 0;
		for (; a > 0; a /= 10)
			rev = rev * 10 + a % 10;
		return org==rev;
	}
	public static boolean isPrime(int a) {
		if(a<=1) return false;
		for(int i=2;i<a/2;i++) {
			if(a%i==0) return false;
		}
		return true;
	}
}
