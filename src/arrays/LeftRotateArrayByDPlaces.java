package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateArrayByDPlaces {

	public static void main(String[] args) {
		
		// [ 1 2 3 4 5 ] i say left rotate 3 times then array will become [ 4 5 1 2 3 ] 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of your array :");
		int size = sc.nextInt();
		int array[] = new int[size];
		
		System.out.println("Enter the elements in your array :");
		for(int i=0;i<array.length;i++)
		{
			array[i] = sc.nextInt();
		}
		
		System.out.println("Enter how many times you want to left rotate :");
		int times = sc.nextInt();
		
		System.out.println("Array elements are : "+Arrays.toString(array));
		
		for(int i=0;i<times;i++)
		{
			leftRotate(array); // if the loop runs two times left rotate will happen twice depending upon user input
		}
		
		System.out.println("Array after left rotating the array : "+Arrays.toString(array));
		
		sc.close();
	}
	
	public static int [] leftRotate(int array[])
	{
		int first = array[0];
		
		for(int i=1;i<array.length;i++)
		{
			array[i-1] = array[i];
		}
		
		array[array.length-1] = first;
		
		return array;
	}
}
