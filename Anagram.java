package task;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram 
{
	static Scanner sc=new Scanner(System.in);
	public static boolean anagram()
	{
		System.out.println("Enter the First String:");
		String str1=sc.next();
		System.out.println("Enter the Second String:");
		String str2=sc.next();
//		if(str1.length()!=str2.length())
//		{
//			System.out.println(str1+" and "+str2+" are not Anagram");
//		}
//		else
//		{
			char[] ch1=str1.toCharArray();
			char[] ch2=str2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if(Arrays.equals(ch1,ch2))
			{
//				System.out.println(str1+" and "+str2+" are Anagram");
				return true;
			}
			else
			{
//				System.out.println(str1+" and "+str2+" are not Anagram");
				return false;
			}
//		}
	}
	public static void main(String[] args) {
		System.out.println(Anagram.anagram());
	}
}
