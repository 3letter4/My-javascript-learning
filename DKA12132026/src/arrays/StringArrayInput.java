import java.util.Scanner;
import java.util.Arrays;

public class StringArrayInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // Fix: Clears the leftover newline character from nextInt()
        
        String[] namatadika = new String[size]; // Fix: Changed "Strings[]" to "String[]"
        
        System.out.println("Masukkan  " + size + " tadika:");
        
        // --- LOOP STARTS ---
        for (int i = 0; i < namatadika.length; i++) {
            System.out.print("Element at index " + i + ": ");
            namatadika[i] = scanner.nextLine(); 
        } 
        
        System.out.println("\nYour array contains: " + Arrays.toString(namatadika));
        scanner.close();
    }
}


