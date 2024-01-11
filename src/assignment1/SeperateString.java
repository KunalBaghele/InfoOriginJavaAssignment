package assignment1;

import java.util.Scanner;

public class SeperateString {
	public static void main(String[] args) {
		String str;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string :- ");
		str = s.nextLine();
		String words[] = str.split("\\s");
		
		// Print every second element of string
		
		for (int i = 1; i <words.length; i = i + 2) {
			System.out.print(words[i]);
			if (i < words.length - 1) {
				System.out.print(", ");
			}
		}
		
	}
}
