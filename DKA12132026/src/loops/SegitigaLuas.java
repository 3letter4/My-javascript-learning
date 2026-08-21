import java.util.Scanner;

public class SegitigaLuas {
    public static void main(String[] args) {
        // Try-with-resources automatically handles closing the resource
        try (Scanner input = new Scanner(System.in)) {
            
            System.out.print("Masukkan tapak segitiga: ");
            double tapak = input.nextDouble();
            
            System.out.print("Masukkan tinggi segitiga: ");
            double tinggi = input.nextDouble();
            
            double luas = (tapak * tinggi) / 2;
            System.out.println("Luas segitiga: " + luas);
            
        } 
    }
}
