package assignment1;

import java.util.Scanner;

public class WaterfallAntiwaterfall {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input from user
        System.out.print("Enter the size of the array: ");
        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + i + " element : ");
            arr[i] = s.nextInt();
        }

        // condition for x
        int x;
        do {
            System.out.print("Enter the value of X (should be less than " + n + "): ");
            x = s.nextInt();
        } while (x >= n);

     // Print Waterfall and Antiwaterfall side by side
        System.out.println("Waterfall\tAntiWaterfall");
        for (int i = n - x, j = 0; i < n; i++, j++) {
            System.out.println(arr[i] + "\t\t" + arr[j]);
        }
        for (int i = 0, j = x; i < n - x; i++, j++) {
            System.out.println(arr[i] + "\t\t" + arr[j]);
        }
    }
}
