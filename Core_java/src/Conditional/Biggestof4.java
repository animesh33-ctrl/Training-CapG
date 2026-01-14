package conditional;

public class Biggestof4 {
	public static void main(String[] args) {
		int a=10,b=117,c=9,d=11;
		int big = a;
		if(big < b) big=b;
		if(big < c) big=c;
		if(big < d) big=d;
		System.out.println(big);
	}
}
