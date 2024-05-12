package arrays;

import java.util.Scanner;

public class MaxSumSubArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of your array :");
		int size = sc.nextInt();
		int array[] = new int[size];
		
		System.out.println("Enter the elements in your array :");
		for(int i=0;i<size;i++)
		{
			array[i] = sc.nextInt();
		}
		
		getMaxSumSubArray(array);
		
		sc.close();	
	}
	
	public static void getMaxSumSubArray(int[] array)
	{
		int maxSum = 0; // initially
		int currSum = 0; // initially
		
		for(int i=0;i<array.length;i++) //1 -2 3 -1 2 = 1+-2 = -1 curr sum = 0; i = 2, currsum = 0+3 = 3, max = 3, i = 4, cusum = 3-1
			// =2, i=4, currsum = 2+2 4 max sum = 4
		{
			currSum = currSum+array[i];
			
			maxSum = Math.max(maxSum, currSum);
			
			if(currSum<0)
			{
				currSum=0; 
			}
		}
		// -2 1 -3 4 -1 2 1 -5 4
		System.out.println("Maximum sum subarray is : "+maxSum);
		
	}
}
