package assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class SortNegativePositive {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, i;

        while (true) {
            System.out.print("Enter the length of array (even number): ");
            n = s.nextInt();

            if (n % 2 == 0 && n > 0) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid even number of elements.");
            }
        }

        int arr[] = new int[n];
        int pos[] = new int[n / 2];
        int neg[] = new int[n / 2];

        while (true) {
            // Check condition for positive and negative
            System.out.println("Enter " + n / 2 + " positive and " + n / 2 + " negative elements.");
            for (i = 0; i < n; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                arr[i] = s.nextInt();
            }

            Arrays.sort(arr);

            if (arr[(n / 2) - 1] < 0 && arr[(n / 2)] > 0) {
                int pcnt = 0;
                int ncnt = 0;
                for (i = 0; i < n; i++) {
                    if (arr[i] > 0) {
                        pos[pcnt] = arr[i];
                        pcnt++;
                    } else {
                        neg[ncnt] = arr[i];
                        ncnt++;
                    }
                }

                Arrays.sort(neg); // Sorting negative array

                // Sorting positive array in descending order (Bubble sort - swapping adjacent)
                int temp = 0;
                for (i = 0; i < pcnt; i++) {
                    for (int j = i + 1; j < pcnt; j++) {
                        if (pos[i] < pos[j]) {
                            temp = pos[i];
                            pos[i] = pos[j];
                            pos[j] = temp;
                        }
                    }
                }

                // Printing alternately
                System.out.println("Alternately sorted elements:");
                for (i = 0; i < n / 2; i++) {
                    System.out.print(pos[i] + " ");
                    System.out.print(neg[i] + " ");
                }
                break; // Exit the loop if input is valid
            } else {
                System.out.println("Invalid Input..!! Enter equal number of positive and negative elements. Please try again.");
            }
        }
    }
}
