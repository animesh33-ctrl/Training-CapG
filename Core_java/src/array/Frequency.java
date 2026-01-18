package array;

public class Frequency {
	
	public static void frequency(int a[],int num) {
		int count = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i] == num) count++;
		}
		System.out.printf("Frequency of %d in arr is : %d",num,count);
	}
	
	public static void main(String[] args) {
		int num=2;
		int arr[] = {1,2,3,4,5,2,3,2,2};
		frequency(arr, num);
	}
}
