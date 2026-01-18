package twodimensionalarray;

public class MultiplyMatrices {
	public static int[][] multiplyMatrices(int arr1[][],int arr2[][]) {
		int temp[][] = new int[arr1.length][arr1[0].length];
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[0].length;j++) {
				temp[i][j] = arr1[i][j]*arr2[i][j];
			}
		}
		return temp;
	}
	
	public static void printArray(int arr[][]) {
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
		System.out.println("Original Array : ");
		printArray(arr);
		System.out.println("Added New Array : ");
		printArray(multiplyMatrices(arr,arr));

	}
}
