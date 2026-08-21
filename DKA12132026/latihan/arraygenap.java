package latihan;
import java.util.*;
public class arraygenap {
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
        int[] arr = new int[size];

        // Take user elements for the array
        System.out.println(
            "Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }
        //counting if it was even or odd
        System.out.println(
            "The elements of the array are: ");
            for (int i = 0; i < arr.length; i++) {
              if (arr[i] % 2 == 0) {
                System.out.println("nombor genap: " + arr[i]);
              } else {
                System.out.println("nombor ganjil: " + arr[i]);
              }
        }

    }
}
