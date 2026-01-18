package array;

public class SortMergedArray {
	public static int[] sortMergedArray(int a[],int b[]) {
		int c[] = new int[a.length+b.length];
		int i=0,j=0,k=0;
		for(;i<a.length&&j<b.length;k++) {
			c[k] = (a[i] <= b[j])? a[i++]:b[j++];
		}
		while(i<a.length) {
			c[k++] = a[i++];
		}
		while(j<b.length) {
			c[k++] = b[j++];
		}
		return c;
	}
	
	public static void printArray(int a[]) {
//		System.out.print("Original Array : ");
        for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
        System.out.println();
	}
	
	
	public static void main(String[] args) {
		int a[] = {5,7,10};
		int b[] = {1,3,6,8};
		int c[] = sortMergedArray(a, b);
		printArray(c);
	}
}
