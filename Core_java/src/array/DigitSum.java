package array;

public class DigitSum {
	
	public static int sumOfDigit(int a) {
		int sum = 0;
		while(a>0) {
			sum += a%10;
			a /= 10;
		}
		return sum;
	}
	
	public static void digitSumArray(int a[]) {
		for(int i=0;i<a.length;i++) {
			if(a[i] >=10)
			a[i] = sumOfDigit(a[i]);
		}
	}
	
	public static void printArray(int a[]) {
		System.out.print("Original Array : ");
        for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
        System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[] = {12,23,34,45,56,67,78,8,9,10};
		printArray(arr);
		digitSumArray(arr);
		printArray(arr);
	}
}
