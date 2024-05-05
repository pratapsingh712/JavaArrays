package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Insert {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of your array :");
		int size = sc.nextInt();
		
		int array[] = new int[size];
		
		System.out.println("Enter the element in your array :");
		
		for(int i=0;i<size-1;i++) // delebrately taking two less elements 
		{
			array[i] = sc.nextInt();
		}
		
		System.out.println("Enter the position at which you want to insert an element :");
		int pos = sc.nextInt();
		
		System.out.println("Enter th element you want to insert :");
		int element = sc.nextInt();

		
		insert(pos,element,array); // in this way your last element will be removed from the array 
		// another better solution is to copy your array in newly intialized array with more size and then copy everything from 
		// array1 to new array and when you encouter the position == index insert the ele and copy the rest of the ele
		
		
		sc.close();
		
	}
	
	public static void insert(int position, int element, int[] array) {
		
			int index_at_which_element_will_be_inserted = position-1;
			
			for(int i=array.length-1;i>index_at_which_element_will_be_inserted;i--)
			{
				// my condition is better because it will not copy everything if the place at which i want to insert is at last
				// if no space everything will be right shifted by one 
				array[i] = array[i-1];
				System.out.println(Arrays.toString(array));				
			}
			
			array[index_at_which_element_will_be_inserted] = element;
		
		System.out.println(Arrays.toString(array));
		
	}
}
