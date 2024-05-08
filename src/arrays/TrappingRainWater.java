package arrays;

import java.util.Scanner;

public class TrappingRainWater {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of your water tanker :");
		int size = sc.nextInt();
		int array[] = new int[size];
		
		System.out.println("Enter the blocks to store water : ");
		for(int i=0;i<size;i++)
		{
			array[i] = sc.nextInt();
		}
		
		getMaxRainWater(array);
		
		sc.close();
		
	}
	
	public static void getMaxRainWater(int[] array)
	{
		int ans = 0;
		int left[] = new int[array.length];
		int right[] = new int[array.length];
		
		left[0] = array[0];
		for(int i=1;i<array.length;i++)
		{
			left[i] = Math.max(left[i-1], array[i]); // because i am starting loop from 1 so i need to compare it with previous ele
		}
		
		right[array.length-1] = array[array.length-1];
		for(int i=array.length-2;i>=0;i--)
		{
			right[i] = Math.max(array[i], right[i+1]);
		}
		
		// now i have to compare it with my original array 
		
		for(int i=0;i<array.length;i++)
		{
			ans += (Math.min(right[i], left[i]))-array[i];
		}
		
		System.out.println("Maximum water that can be stored will be = "+ans);
	}
}
