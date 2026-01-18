package array;

public class Zigzag {
	
	public static int[] zigzagArray(int a[],int b[]) {
		int c[] = new int[a.length+b.length];
		int i=0,j=0,k=0;
		for(;i<a.length && j<b.length;k++) {
			c[k++] = a[i++];
			c[k] = b[j++];
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
		int a[] = {10,7,8,12,23,34};
		int b[] = {5,6,10,20,8};
		
		printArray(a);
		printArray(b);
		int c[] = zigzagArray(a, b);
		printArray(c);
	}
}
