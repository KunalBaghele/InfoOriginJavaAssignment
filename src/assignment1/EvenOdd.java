package assignment1;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = 0;
        System.out.print("Enter the length of array (between 1 and 100): ");
        n = s.nextInt();

        int arr[] = new int[n];
        String even = "";
        String odd = "";

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + " of array: ");

            // Check if the input is an integer
            if (s.hasNextInt()) {
                int num = s.nextInt();

                // Check if the number is between 1 and 100
                if (num > 0 && num <= 100) {
                    arr[i] = num;
                } else {
                    System.out.println("Invalid input..!! Please enter a positive number between 1 and 100.");
                    i--; // Decrement i to re-enter the current element
                }
            } else {
                System.out.println("Invalid input..!! Please enter a valid number.");
                s.next(); // consume the invalid input
                i--; // Decrement i to re-enter the current element
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                even = even.concat(Integer.toString(arr[i])).concat(",");
            } else {
                odd = odd.concat(Integer.toString(arr[i])).concat(",");
            }
        }
        System.out.println("Even String : " + even);
        System.out.println("Odd String : " + odd);
    }
}
