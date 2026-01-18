package twodimensionalarray;

import java.util.Scanner;

public class Basic {
	
	public static void findEvenIndex(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j] %2==0) {
					System.out.printf("{%d,%d}\n",i+1,j+1);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[2][3];
		System.out.printf("Enter %d elements : \n",arr.length*arr[0].length);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Array : ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		findEvenIndex(arr);
		
		sc.close();
	}
}
