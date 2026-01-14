package loop_assignment;

import java.util.Scanner;

//average of the digits
public class q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=0,sum=0;
		while(n>0) {
			sum += n%10;
			count++;
			n/=10;
		}
		System.out.println("Average of the digits in a number : "+(float)sum/count);
		
		sc.close();
	}
}
