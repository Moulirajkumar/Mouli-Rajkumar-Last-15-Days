package patterns;

import java.util.Scanner;

public class BridgePattern
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input:");
		int n = sc.nextInt();
		for (int i = 0; i < n * 2 - 1; i++)
		{
			int k = 1;
			for (int j = 0; j < n * 2; j++) 
			{
				if (i < n) 
				{
					if (i >= j || i + j >= 2 * n - 1) 
					{
						if (j < n)
						{
							System.out.print(k++ + " ");
						} 
						else 
						{
							System.out.print(--k + " ");
						}
					} 
					else 
					{
						System.out.print("  ");
					}
				}
				else 
				{
					if (i + j >= n || i + j <= n) 
					{
						if (i + j <= n * 2 - 2) 
						{
							System.out.print(k++ + " ");
						} 
						else if (i < j) 
						{
							System.out.print(--k + " ");
						} else 
						{
							System.out.print("  ");
						}
					}
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
