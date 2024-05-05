package arrays;

import java.util.Scanner;

public class CheckIfSorted {

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
		
		// now i have my array i need to check if it's sorted or not :
		
		if(sorted(array))
		{
			System.out.println("Array is sorted in increasing order ");
		}
		else
		{
			System.out.println("Array is not sorted in increasing order :");
		}
		
		sc.close();
	}
	
	public static boolean sorted(int []array)
	{
		boolean sorted = false;
		
		for(int i=0;i<array.length-1;i++)
		{
			if(array[i]>array[i+1])
			{
				return sorted;
			}			
		}
		
		return true;
	}
}
