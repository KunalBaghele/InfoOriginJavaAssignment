package assignment1;

import java.util.Scanner;

public class SumOfDigit {

	public static int getSum(int n) {
		int sum = 0;
		while (n != 0) {
			sum = sum + n % 10; // Add the last digit to the sum
			n = n / 10; // Remove the last digit from the number
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int a = s.nextInt();
		int[] arr = new int[a]; // Assuming array length is 5

		for (int i = 0; i < arr.length; i++) {
			int num;
			while (true) {
				System.out.print("Enter a 3-digit number only for num[" + (i + 1) + "]: ");
				num = s.nextInt();

				if (num >= 100 && num <= 999 || num <= -100 && num >= -999) {
					break;// Exit the loop bcoz input is valid
				} else {
					System.out.println("Invalid input. Please enter a 3-digit number.");
				}
			}

			arr[i] = num; // Store the valid input in the array
		}

		// Process array elements
		for (int i = 0; i < arr.length; i++) {
			int ele = arr[i];

			// Loop to add digits until the element becomes a single digit
			while (ele > 9 || ele < -9) {
				int sumdigit = getSum(Math.abs(ele));

				if (ele < 0) {
					ele = -sumdigit; // If original element was negative, make the result negative
				} else {
					ele = sumdigit; // Update the element with the sum of its digits
				}
			}
			arr[i] = ele; // Update the array with the processed element
		}

		// Output the final array
		System.out.print("{ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i < arr.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println(" }");

		// Calculate and print the sum of the final array
		int sum = 0;
		for (int add : arr) {
			sum = sum + add;
		}
		System.out.println("Sum of array: " + sum);

		s.close(); // Close the scanner to prevent resource leak
	}
}