package arrays;

import java.util.Scanner;

public class SecondLargestElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of you array :");
		int size = sc.nextInt();
		int array[] = new int[size];
		
		System.out.println("Enter the elements into your array :");
		for(int i=0;i<size;i++)
		{
			array[i] = sc.nextInt();
		}
		
		int largest = getLargest(array);
		
		int secondLargest = getSecondLargest(array,largest);
		
		System.out.println("Largest element in your array is = "+largest);
		
		System.out.println("Second largest element in your array is = "+secondLargest);
		
		sc.close();

	}

	public static int getSecondLargest(int[] array, int largest) {
		
		int secondLargest = -1; // in case all ele is same 
		
		for(int i=0;i<array.length;i++) // i need to find largest only but it shouldn't be equal to my largest will eventually give
			//me my second largest element
		{
			if(array[i]!=largest)
			{
				if(array[i]>secondLargest)
				{
					secondLargest = array[i];
				}
			}
		}
		
		if(secondLargest<0)
		{
			return array[0];
		}
		
		return secondLargest;
	}

	public static int getLargest(int[] array) {
		
		int largest = array[0]; // i dont want to initialize largest with 0 as my integer array could contain only negative numbers
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>largest)
			{
				largest = array[i];
			}
		}
		
		return largest;
	}

}
