package array;

public class EvenNumberFinder {  
	  
    public static int[] getEvenNumbers(int[] arr) {  
        int count = 0;  
        for (int num : arr) {  
            if (num % 2 == 0) {  
                count++;  
            }  
        }  
   
        int[] evenNumbers = new int[count];  
  
        int index = 0;  
        for (int num : arr) {  
            if (num % 2 == 0) {  
                evenNumbers[index++] = num;  
            }  
        }  
  
        return evenNumbers;  
    }  
  
    public static void main(String[] args) {  
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
        
        System.out.print("Original Array : ");
        for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
        System.out.println();
        int[] evenNumbers = getEvenNumbers(numbers);  
          
        System.out.print("Even numbers in the array: ");  
        for (int num : evenNumbers) {  
            System.out.print(num + " ");  
        }  
    }  
}