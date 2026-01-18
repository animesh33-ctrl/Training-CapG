package array;

public class BiggestSmallest {
	public static int[] bigSmall(int a[]) {
		int big=0,small=Integer.MAX_VALUE;
		for(int i:a) {
			if(i>big) big=i;
			if(i<small) small = i;
		}
		return new int[] {big,small};
	}
	
	public static void main(String[] args) {
		int a[] = {12,2,3,4,5,6,7,8,9};
		int c[] = bigSmall(a);
		System.out.println("Biggest : "+c[0]+" Smallest : "+c[1]);
	}
}
