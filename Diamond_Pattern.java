package patterns;

import java.util.Scanner;

public class Diamond_Pattern 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name: ");
		String str=sc.next();
		if(str.length()%2==0)
		{
			System.out.println("Enter Odd Length of String !!!");
		}
		else
		{
			int n=str.length();
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(i+j==n/2)
					{
						System.out.print(str.charAt(i)+" ");
					}
					else if(i-j==n/2)
					{
						System.out.print(str.charAt(i)+" ");
					}
					else if(j-i==n/2)
					{
						System.out.print(str.charAt(i)+" ");
					}
					else if(i+j==n/2*3)
					{
						System.out.print(str.charAt(i)+" ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}
		sc.close();
	}
}
