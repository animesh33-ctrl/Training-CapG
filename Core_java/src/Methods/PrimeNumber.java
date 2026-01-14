package methods;

public class PrimeNumber {

	public static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.println(i);
				return false;
			}
		}
		return true;

	}
	
	private static int power(int b,int p) {
		if(p==0)return 1;
//		System.out.println(b);
//		System.out.println(p);		
		return b*power(b,p-1);
	}

	public static void main(String[] args) {
		int n = 3;
		if (isPrime(n)) {

			System.out.println("Not a prime number!!!!");
		} else {
			System.out.println("Prime Number!!!!!!!");
		}
		
		System.out.println(power(2,4));
	}
}
