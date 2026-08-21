
import java.util.*; 

public class ArrayGenapGanjilSeparated {          
    // Method to print array elements     
    public static void printArray(int[] array) {         
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");         
        }
        System.out.println(); 
    }     

    public static void main(String[] args) {         
        Scanner sc = new Scanner(System.in);          

        // Take the array size from the user         
        System.out.print("Enter the size of the array: ");         
        int size = 0;         
        if (sc.hasNextInt()) {             
            size = sc.nextInt();         
        }          

        // Initialize the array size using user input         
        int[] arr = new int[size];          

        // Take user elements for the array         
        System.out.println("Enter the elements of the array: ");         
        for (int i = 0; i < size; i++) {             
            if (sc.hasNextInt()) {                 
                arr[i] = sc.nextInt();             
            }         }         

        // Counting if it was even or odd         
        int bil_genap = 0, bil_ganjil = 0;         
        for (int i = 0; i < arr.length; i++) {               
            if (arr[i] % 2 == 0) {                 
                bil_genap++;               
            } else {                 
                bil_ganjil++;               
            }                       
        } // <-- Fixed: Closed the counting loop properly

        // Create arrays of exact size         
        int[] even = new int[bil_genap];         
        int[] odd = new int[bil_ganjil];         
        int ge = 0, gan = 0;          

        // Second traversal to store elements         
        for (int i1 = 0; i1 < arr.length; i1++) { // <-- Fixed: Changed 'n' to 'arr.length'
            if (arr[i1] % 2 == 0) {
                even[ge++] = arr[i1];             
            } else {
                odd[gan++] = arr[i1];         
            }
        }          

        // Output results
        System.out.print("Even Array: ");         
        printArray(even);          

        System.out.print("Odd Array: ");         
        printArray(odd);     
    } 
}

