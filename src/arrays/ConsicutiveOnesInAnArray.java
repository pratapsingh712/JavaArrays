package arrays;

import java.util.Scanner;

public class ConsicutiveOnesInAnArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of your array :");
		int size = sc.nextInt();
		int array[] = new int[size];
		
		System.out.println("Enter elements in your array in binary format :");
		for(int i=0;i<size;i++)
		{
			array[i] = sc.nextInt();
		}
		
		getMaxConsecutiveOnes(array);
		
		getEffectiveMaxConsecutiveOnes(array);
		
		sc.close();
	}

	public static void getMaxConsecutiveOnes(int[] array) {
		
		int currMax = 0;
		int count = 0;
		
		for(int i=0;i<array.length;i++)
		{
			currMax = 0;
			for(int j=i;j<array.length;j++)
			{
				if(array[j]==1)
					currMax++;
				else 
					break;
			}
			
			count = Math.max(currMax, count); 
		}
		
		System.out.println("Total number of consecutive ones are = "+count);
	}
	
	public static void getEffectiveMaxConsecutiveOnes(int []array)
	{
		int currMax = 0;
		int count = 0;
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==0)
				currMax=0;
			else
			{
				currMax++;
				count = Math.max(currMax, count);
			}
		}
		
		System.out.println("Total number of consecutive ones are = "+count);
	}
}
