package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FrequencyOfElements {

	public static void main(String[] args) {
		
		// our array is sorted so it's easy to get the frequency and print the element 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of your array :");
		int size = sc.nextInt();
		int array[] = new int[size];
		
		System.out.println("Enter the elements in your array :");
		for(int i=0;i<array.length;i++)
		{
			array[i] = sc.nextInt();
		}
		
		// now i have got the element in sorted format 
		
		System.out.println("Original elements are : "+Arrays.toString(array));
		
		getFrequency(array);
		
		sc.close();
	}
	
	public static void getFrequency(int[] array)
	{
		int frequency = 1;
		
		int i = 1;
		
		for(;i<array.length;i++)
		{
			if(array[i-1]==array[i])
			{
				frequency++;
			}
			else
			{
				System.out.println(array[i-1]+" "+frequency);
				frequency = 1;
			}
		}
		
		if(array[i-1]!=array[i-2])
		{
			System.out.println(array[i-1]+" "+frequency);
		}
	}
}
