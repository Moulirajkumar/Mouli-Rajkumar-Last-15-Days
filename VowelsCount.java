package task;

import java.util.Scanner;

public class VowelsCount {
	public static void wordcount() {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.next();
		for (int i = 0; i < str.length(); i++) {
			char temp = str.charAt(i);
			switch (temp) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'a':
			case 'e':
			case 'o':
			case 'u':
				count++;
				break;
			}
		}
		System.out.println("The Number of Vowels are present in string is: "+count);
		sc.close();
	}
	public static void main(String[] args) {
		VowelsCount.wordcount();
	}
}
