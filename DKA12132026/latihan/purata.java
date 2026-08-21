package latihan;

import java.util.Scanner;

public class purata {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take the array size from the user
        System.out.println("Enter the size of the array: ");
        int size = 0;
        if (sc.hasNextInt()) {
            size = sc.nextInt();
        }

        // Initialize the array's
        // size using user input
        int[] nom = new int[size];

        // Take user elements for the array
        System.out.println(
            "Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            if (sc.hasNextInt()) {
                nom[i] = sc.nextInt();
            }
        }

        float avg, sum = 0;

            // Get the length of the array
        int length = nom.length;

            // Loop through the elements of the array
        for (int i = 0; i < nom.length; i++) {
            sum += nom[i];
        }
        

        // Calculate the average by dividing the sum by the length
        avg = sum / length;

        // Print the average
        System.out.println("The average number is: " + avg);
        }
}