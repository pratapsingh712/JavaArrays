package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumDifferenece {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of your array :");
		// array = [ 5 4 3 2 1 ] if i get the max and min i can easily find the maximum difference 
		
		
		int size = sc.nextInt();
		int array[] = new int[size];
		
		System.out.println("Enter the elements in your array :");
		for(int i=0;i<size;i++)
		{
			array[i] = sc.nextInt();
		}
		
		System.out.println("Original array elements are : "+Arrays.toString(array));
		
		//int getMax = getMaxDifference(array);
		
		int diff = getEfficientDifference(array);
		
		
		System.out.println("Maximum Difference between elements are : "+diff);
		sc.close();
	}
	
	public static int getMaxDifference(int [] array)
	{
		int maxDiff = array[1]-array[0];
		int max = 0;// for positive integer array 
		int min = 0;//for positive integer array 
		int diff = 0;
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				max = Math.max(array[i], array[j]);
				min = Math.min(array[i], array[j]);
				diff = max-min;
				
				if(diff>maxDiff)
				{
					maxDiff = diff;
				}
			}
		}
		
		return maxDiff;
	}
	
	public static int getEfficientDifference(int[] array)
	{
		int max = array[0];
		int min = array[0];
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]<min)
				min = array[i];
			
			if(array[i]>max)
				max = array[i];
		}
		
		return max-min;
	}
}
