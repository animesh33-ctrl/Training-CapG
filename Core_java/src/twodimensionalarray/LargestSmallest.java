package twodimensionalarray;

public class LargestSmallest {
	
	public static void findLargest(int arr[][]) {
		int lr=0,sm=arr[0][0];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j] > lr) lr = arr[i][j];
				if(arr[i][j] < sm) sm = arr[i][j];
			}
		}
		
		System.out.println("Largest Element : "+lr);
		System.out.println("Smallest Element : "+sm);
		
	}
	
	
	public static void printArray(int arr[][]) {
		System.out.println("Original Array : ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int arr[][] = {
				{1,2,3},
				{4,5,6}
		};
		printArray(arr);
		findLargest(arr);
	}
}
