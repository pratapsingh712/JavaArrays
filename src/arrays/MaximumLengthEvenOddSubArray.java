package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumLengthEvenOddSubArray {

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
		
		// now i have the element i am going to store the remainder in another array called binary array 
		
		System.out.println("Original array elements are : "+Arrays.toString(array));
		
		int remainder[] = new int[size];
		
		remainder = getRemainder(array,remainder);
		
		System.out.println("After checking for even odd element i get : "+Arrays.toString(remainder));
		
		// i think i should implement a true false sort of model to get the count 
		
		int count = 0;
		
		count = getAlternatingEvenOddCount(remainder);
		
		System.out.println("After carefully considering i got the count as : "+count);
		
		sc.close();
		
	}
	
	public static int getAlternatingEvenOddCount(int[] remainder) {
		
		boolean even = false;
		boolean odd = false;
		
		int count = 1;
		
		for(int i=0;i<remainder.length-1;i++)
		{
			if(remainder[i]==0)
			{
				even = true;
				// then next should be odd then i can increment the count to 1 
				
				if(remainder[i+1]==1)
				{
					odd = true;
				}
				
				if(odd&&even)
				{
					count++;
				}
			}
			
			else if(remainder[i]==1)
			{
				odd = true;
				// then next should be odd then i can increment the count to 1 
				
				if(remainder[i+1]==0)
				{
					even = true;
				}
				
				if(odd&&even)
				{
					count++;
				}
			}
		}
		
		return count;
	}

	public static int[] getRemainder(int array[], int[] remainder)
	{
		for(int i=0;i<array.length;i++)
		{
			remainder[i] = array[i]%2;
		}
		
		return remainder; //hello
	}
}
