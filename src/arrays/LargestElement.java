package arrays;

import java.util.Scanner;

public class LargestElement {

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
		
		int max = findlargest(array); // this is an efficient solution that will take exact theta of n time complexity 
		
		System.out.println("Largest element in your array is :"+max);
		
		sc.close();
	}

	public static int findlargest(int[] array) {
		
		int updateMax = 0;
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>updateMax)
			{
				updateMax = array[i];
			}
		}
		
		return updateMax;
	}
}
