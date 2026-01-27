package operator;

public class Ternary2 {
	public static void main(String[] args) {
		int a = 5,b=16,c=7,d=8;
		int big = (a>b && a>c && a>d)?a:(b>c && b>d)?b:(c>d)?c:d;
		System.out.println(big +" is biggest");
	}
}
