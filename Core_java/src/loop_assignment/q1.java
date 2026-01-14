package loop_assignment;
import java.util.Scanner;
//count number of digits present in the number
public class q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		while(n>0) {
			n /= 10;
			count++;
		}
		System.out.println("Number of digits : "+count);
		sc.close();
	}
}	
