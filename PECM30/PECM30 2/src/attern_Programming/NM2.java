package attern_Programming;

import java.util.Scanner;

public class NM2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" how many rows you want to print");
		int ele = sc.nextInt();
		
		for (int i = ele; i >= 1; i--) 
		{
			for (int j = 1; j <=i; j++) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
}

/*
	1 2 3 4 5 6 7
	1 2 3 4 5 6
	1 2 3 4 5
	1 2 3 4
	1 2 3
	1 2
	1
 */
