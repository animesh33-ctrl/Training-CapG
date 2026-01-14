package conditional;

public class Conditional1 {
	public static void main(String[] args) {
		int a=10,b=10,c=9;
		if(a>b && a>c) System.out.println(a);
		else {
			if(b>c) System.out.println(b);
			else System.out.println(c);
		}
	}
}