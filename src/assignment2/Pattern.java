package assignment2;

import java.util.Scanner;

public class Pattern {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String str;
	System.out.print("Enter the string :");
	str=s.nextLine();
	for(int i=0;i<str.length();i++) {
		
		for(int j=0;j<=i;j++) {
			System.out.print(str.charAt(j));
		}
		System.out.println();
		
//		System.out.println(str.substring(0, i + 1));
	}
}
}
