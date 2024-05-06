package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotate {

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
		
		System.out.println("Array elements are : "+Arrays.toString(array));
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("Array after left rotating : "+Arrays.toString(leftRotate(array)));
		
		sc.close();
	}
	
	public static int[] leftRotate(int array[])
	{
		int first = array[0];
		int last = array.length;
		
		for(int i=1;i<array.length;i++)
		{
			array[i-1] = array[i];
		}
		
		array[last-1] = first;
		
		return array;
	}
}
