package patterns;

import java.util.Scanner;
public class MirrorPyramid 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		sc.close();
		int temp=n;
		int spaces=0;
		for(int i=0;i<(2*n)-1;i++)
		{
			for(int j=0;j<spaces;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<temp;j++)
			{
				System.out.print("* ");
			}
			if(i>n-2)
			{
				temp++;
				spaces--;
			}
			else
			{
				temp--;
				spaces++;
			}
			System.out.println();
		}
	}
}
