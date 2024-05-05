package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of your array :");
		int size = sc.nextInt();
		int array[] = new int[size];
		
		System.out.println("Enter the elements into your array :");
		for(int i=0;i<array.length;i++)
		{
			array[i] = sc.nextInt();
		}
		
		System.out.println("Before reversing the array : "+Arrays.toString(array));
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("After reversing the array : "+Arrays.toString(reverseArray((array))));
		
		
		sc.close();
	}
	
	public static int[] reverseArray(int array[])
	{
		int start = 0;
		int end = array.length-1;
		int temp = 0;
		
		//System.out.println(array[end]);
		
		while(start<end)
		{
			temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
		return array;
	}
}
