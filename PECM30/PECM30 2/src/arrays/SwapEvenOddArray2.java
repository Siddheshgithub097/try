package arrays;

import java.util.Scanner;

public class SwapEvenOddArray2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size: ");
		int[]arr=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		arr=isStore(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static int[] isStore(int[] a)
	{
		int[] b=new int[a.length];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				b[index++]=a[i];
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==1)
			{
				b[index++]=a[i];
			}
		}
		a=b;
		return a;
	}
}
