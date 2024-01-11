package assignment2;

import java.util.Scanner;

public class Chocolate {
	
    public static void forward(int[] arr, int chocolate) {
        for (int i = 0; i < arr.length && chocolate != 0; i++) {
            arr[i]++;
            chocolate--;
        }
        if (chocolate != 0) {
            backward(arr, chocolate);
        }
    }

    public static void backward(int[] arr, int chocolate) {
        for (int i = arr.length - 1; i >= 0 && chocolate != 0; i--) {
            arr[i]++;
            chocolate--;
        }
        if (chocolate != 0) {
            forward(arr, chocolate);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int chocolate, people;
        System.out.print("Enter number of chocolates: ");
        chocolate = s.nextInt();

        do {
            System.out.print("Enter number of people: ");
            people = s.nextInt();

            if (people <= 0) {
                System.out.println("Number of people should be greater than zero. Please try again.");
            }
        } while (people <= 0);

        int[] arr = new int[people];
        
        backward(arr,chocolate);

//        forward(arr, chocolate);

        System.out.print("Distribution of chocolates: ");
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
