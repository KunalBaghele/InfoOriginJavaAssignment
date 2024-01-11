package assignment1;

import java.util.Scanner;

public class RepeatString {
	public static void main(String[] args) {
		String str;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter string :- ");
		str = s.nextLine();
		int len = str.length();
		
//		str = str.concat(",").repeat(len);
//		System.out.println(str);
		
		for (int i = 0; i < len; i++) {
			System.out.print(str);
			if (i < len - 1) {
				System.out.print(", ");
			}
		}
	}
}
