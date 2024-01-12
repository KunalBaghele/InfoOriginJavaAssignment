package assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class SortSplitOptimised {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int p, q;

        do {
            System.out.print("Enter size of array A[] (should not be negative): ");
            p = s.nextInt();
        } while (p < 0);

        do {
            System.out.print("Enter size of array B[] (should not be negative): ");
            q = s.nextInt();
        } while (q < 0);

        int a[] = new int[p];
        int b[] = new int[q];
        int c[] = new int[p + q];
        int i, j, k;

        // Input for array A
        System.out.println("Enter elements for array A (sorted):");
        for (i = 0; i < p; i++) {
            System.out.print("Enter " + (i + 1) + " element of A[] :");
            a[i] = s.nextInt();
            if (i > 0 && a[i - 1] > a[i]) {
                System.out.println("Please enter the elements in sorted order.");
                i--;
            }
        }

        // Input for array B
        System.out.println("----------------------------------------");
        System.out.println("Enter elements for array B (sorted):");
        for (j = 0; j < q; j++) {
            System.out.print("Enter " + (j + 1) + " element of B[] :");
            b[j] = s.nextInt();
            if (j > 0 && b[j - 1] > b[j]) {
                System.out.println("Please enter the elements in sorted order.");
                j--;
            }
        }

        System.out.println("\nInitial Arrays:");
        System.out.println("A: " + Arrays.toString(a));
        System.out.println("B: " + Arrays.toString(b));

        // Merge Sort a= [1,3,5,7,9] b=[2,4,6]
        for (i=0,j=0,k=0; i < p && j < q; k++) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
        }

        // Copy remaining elements from A, if any
        for (i=0,k=0; i < p; k++, i++) {
            c[k] = a[i];
        }

        // Copy remaining elements from B, if any
        for (j=0,k=0; j < q; k++, j++) {
            c[k] = b[j];
        }

        // Copy elements from c back to a and b
        for (k = 0; k < p; k++) {
            a[k] = c[k];
        }

        for (k = 0; k < q; k++) {
            b[k] = c[p + k];
        }

        System.out.println("\nFinal Arrays:");
        System.out.println("A: " + Arrays.toString(a));
        System.out.println("B: " + Arrays.toString(b));
    }
}
