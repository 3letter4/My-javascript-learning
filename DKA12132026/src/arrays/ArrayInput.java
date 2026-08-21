import java.util.Scanner;
import java.util.Arrays;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];
        
        System.out.println("Enter " + size + " integers:");
        
        // --- LOOP STARTS ---
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Element at index " + i + ": ");
            numbers[i] = scanner.nextInt(); 
        } 
        
        System.out.println("\nYour array contains: " + Arrays.toString(numbers));
        scanner.close();
    }
}
