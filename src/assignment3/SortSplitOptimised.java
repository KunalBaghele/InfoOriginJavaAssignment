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

        int[] a = new int[p];
        int[] b = new int[q];

        // Input for array A
        System.out.println("Enter elements for array A:");
        for (int i = 0; i < p; i++) {
            System.out.print("Enter " + (i + 1) + " element of A[]: ");
            a[i] = s.nextInt();
        }

        // Input for array B
        System.out.println("----------------------------------------");
        System.out.println("Enter elements for array B:");
        for (int i = 0; i < q; i++) {
            System.out.print("Enter " + (i + 1) + " element of B[]: ");
            b[i] = s.nextInt();
        }

        System.out.println("\nInitial Arrays:");
        System.out.println("A: " + Arrays.toString(a));
        System.out.println("B: " + Arrays.toString(b));

        // Merge arrays directly into a
        int i = 0, j = 0, k = 0;
        while (i < p && j < q) {
            if (a[i] < b[j]) {
                a[k++] = a[i++];
            } else {
                a[k++] = b[j++];
            }
        }
        while (i < p) {
            a[k++] = a[i++];
        }
        while (j < q) {
            a[k++] = b[j++];
        }

        // Update array B from the second half of the merged array
        System.arraycopy(a, 0, b, 0, p + q);


        System.out.println("\nFinal Arrays:");
        System.out.println("A: " + Arrays.toString(a));
        System.out.println("B: " + Arrays.toString(b));
    }
}
