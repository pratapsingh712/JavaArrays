package arrays;

import java.util.Scanner;

public class Delete {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of your array :");
		int size = sc.nextInt();
		int array[] = new int[size];
		
		System.out.println("Enter elements in your array :");
		for(int i=0;i<size;i++)
		{
			array[i] = sc.nextInt();
		}
		
		System.out.println("Enter the element you want to delete :");
		int element = sc.nextInt();
		
		int deleted_array = delete(array,element);
		
		System.out.println("after deleting the element we have :");
		
		for(int i=0;i<deleted_array;i++)
		{
			System.out.print(array[i]+" ");
		}
		
		sc.close();
		
	}
	
	public static int delete(int array[],int element)
	{
		int i=0;
		
		for(;i<array.length;i++)
		{
			if(array[i]==element)
			break;
		}
		
		//System.out.println(i);
		
		int cap = array.length-1;
		
		if(i==cap)
		{
			return cap; // this operation is basically return 1 2 3 4 if the element you want to delete is at last location
		}
		
		for(int j=i;j<cap;j++)
		{
			array[j] = array[j+1];
		}
		
		return array.length-1;
	}
}
