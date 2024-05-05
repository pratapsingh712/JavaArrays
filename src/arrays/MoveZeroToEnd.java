package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroToEnd {

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
		
		System.out.println("Arrays elements are : "+Arrays.toString(array));
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("Arrays after shifting zero to end : "+Arrays.toString(moveZeroToEnd(array)));
		
		sc.close();
	}
	
	public static int[] moveZeroToEnd(int[] array)
	{
		int temp = 0;
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==0) // if my array element is not zero i will simpy go to next iteration else i will go inside this if condition
			{
				for(int j=i+1;j<array.length;j++)
				{
					if(array[j]!=0) // i am finding non zero element after finding zero to swap and bring zero to end
					{
						temp = array[j];
						array[j] = array[i];
						array[i] = temp;
					}
				}
			}
		}
		
		return array;
	}
}
