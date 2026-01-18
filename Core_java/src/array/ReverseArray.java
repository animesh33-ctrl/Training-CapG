package array;

public class ReverseArray {
	
	public static void reverseArray(int a[]) {
		int i = -1,j=a.length;
		while(i++<=j--){
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
//			i++;j--;
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
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		printArray(arr);
		reverseArray(arr);
		printArray(arr);
	}
}
