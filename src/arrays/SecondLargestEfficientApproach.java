package arrays;

import java.util.Scanner;

public class SecondLargestEfficientApproach {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of your array :");
		int size = sc.nextInt();
		int array[] = new int[size];
		
		System.out.println("Enter the elements in your array :");
		
		for(int i=0;i<array.length;i++)
		{
			array[i] = sc.nextInt();
		}
		
		String result = getLargestSecondLargest(array);
	
		//System.out.println(result); for debugging purpose
		
		System.out.println("After calculating my largest element is = "+result.charAt(0));
		
		System.out.println("After calculating my second largest element is = "+result.charAt(2));

	}

	public static String getLargestSecondLargest(int[] array)
	{
		int largest = array[0];
		int secondLargest = -1;
		
		for(int i=1;i<array.length;i++)
		{
			if(array[i]>largest) // if i find new largest 
			{
				secondLargest = largest;
				largest = array[i];
			}
			
			else if(array[i]!=largest || array[i]<largest) // from first element itself if i do not find new largest
			{
				secondLargest = array[i];
			}
		}
		
		if(secondLargest < 0 ) // which means all elemnts were similar thus it should return same element as second largest 
			secondLargest = largest;
		
		String result = largest +" "+secondLargest;
		
		return result;
	}
}
