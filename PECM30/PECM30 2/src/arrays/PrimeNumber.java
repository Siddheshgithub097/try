package arrays;

import java.util.Scanner;

public class PrimeNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of array ");
		int []a=new int[sc.nextInt()];
		for (int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(isPrime(a[i]))
			{
				System.out.println("Prime Number= "+a[i]);
			}
		}
	}
	public static boolean isPrime(int num)
	{
		if (num<=1)
		{
			return false;			
		}
		for(int i=2;i<num;i++)
		{
			if (num%i==0)
			{
				return false;
			}
		}
		return true;
			
	}
}
