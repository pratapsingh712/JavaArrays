package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LeadersInArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of your array :");
		int size = sc.nextInt();
		int array[] = new int[size];
		
		//ask the user for array input 
		
		System.out.println("Enter the array element :");
		for(int i=0;i<array.length;i++)
		{
			array[i] = sc.nextInt();
		}
		
		// now i have the array elements you can print the original array and get the leader later
		
		System.out.println("Original Array elements are : "+Arrays.toString(array));
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("Leaders in the array elements are : ");
		
		int count = leaderElements(array); // now i need to print the array until the count index 
		
		for(int i=0;i<count;i++)
		{
			System.out.print(array[i]+",");
		}
		
		sc.close();
	}
	
	public static int leaderElements(int []array)
	{
		int count = 0;
		
		boolean leader = true;
		
		for(int i=0;i<array.length;i++)
		{
			leader = true;
			
			for(int j=i;j<array.length;j++)
			{
				if(array[i]<array[j]) // enter only when i have found something bigger on right and makes leader ith as flase else true
				{
					leader = false;
				}
			}
			
			if(leader)
			{
				array[count] = array[i];
				count++;
			}
		}
		
		return count;
	}
}
