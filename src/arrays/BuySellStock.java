package arrays;

import java.util.Scanner;

public class BuySellStock {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Etner the number of day's for which you want to list out the price of a particular stock :");
		int size = sc.nextInt();
		int price[] = new int[size];
		
		System.out.println("Enter the price of stock for each day : ");
		for(int i=0;i<size;i++)
		{
			price[i] = sc.nextInt();
		}
		// in this given solution you can buy twice or sell twice it happens only once that you buy and sell the stock 
		
		// to buy and sell multiple times to get max profit we need to consider different approach
		
		// now we have got the prices we need to calculate the maximum profit we can generate from this listen price
		
		getMaxprofit(price);
		
		getMaxProfitEfficient(price);
				
		sc.close();
	}
	
	public static void getMaxprofit(int price[])
	{
		int profit = 0;
		int diff = 0;
		
		int buyDay = 0;
		int sellDay = 0;
		
		for(int i=0;i<price.length-1;i++)
		{
			for(int j=i+1;j<price.length;j++)
			{
				if(price[i]<price[j])
				{
					diff = price[j]-price[i];
					// now we will check if our previous profit is greater than this difference or not 
					
					if(diff>profit)
					{
						profit = diff;
						buyDay = i+1;
						sellDay = j+1;
					}
				}
			}
		}
		
		System.out.println("Maximum profit i can generate by buying on : "+buyDay+" Day and selling on Day : "+sellDay+" is = "+profit);
	}
	
	public static void getMaxProfitEfficient(int price[])
	{
		int profit = 0;
		
		for(int i=1;i<price.length;i++)
		{
			if(price[i-1]<price[i])
			{
				profit += price[i]-price[i-1];
			}
		}
		
		System.out.println("Maximum profit i can generate by buying and selling multiple times is "+profit);
	}
}
