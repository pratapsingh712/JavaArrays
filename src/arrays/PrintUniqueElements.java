package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintUniqueElements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of your array :");
		int size = sc.nextInt();
		int array[] = new int[size];
		
		System.out.println("Enter the elements into your array in sorted format :");
	
		for(int i=0;i<size;i++)
		{
			array[i] = sc.nextInt();
		}
		
		System.out.println("Arrays elements are : "+Arrays.toString(array));
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("Unique Elements in your array are : "+Arrays.toString(uniqueElements(array)));
		// in the place of duplicate elements 0 will be printed to handle this i can return the size of unique array and print the ele

		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.print("Unique Elements in your array are : ");
		
		int unique_size = efficientUniqueElements(array);
		
		for(int i=0;i<unique_size;i++)
		{
			System.out.print(array[i]+" ");
		}
		
		
		sc.close();
	}
	
	public static int[] uniqueElements(int array[])
	{
		boolean visited = false;
		
		int unique[] = new int[array.length];
		
		int k = 0;
		
		for(int i=0;i<array.length;i++)
		{
			visited = false;
			
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					visited = true;
					break;
				}
			}
			
			if(!visited)
			{
				unique[k] = array[i];
				k++;// this means it will keep the last occurence of any ele in an array whether it is repeated or not
			}
		}
		
		
		
		return unique;
	}
	
	public static int efficientUniqueElements(int []array)
	{
		int uniquePointer = 0;
		int uniqueArray[] = new int[array.length]; // could happen all elements are sorted and unique
		
		uniqueArray[uniquePointer] = array[0];
		
		uniquePointer = 1;
		
		for(int i=1;i<array.length;i++)
		{
			if(uniqueArray[uniquePointer-1]!=array[i])
			{
				uniqueArray[uniquePointer++] = array[i];
			}
		}
		
		
		for(int i=0;i<uniquePointer;i++)
		{
			array[i] = uniqueArray[i];
		}
		
		return uniquePointer;
	}
}
