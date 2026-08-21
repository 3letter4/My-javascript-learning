import java.util.Scanner;

public class KategoriUmur { // Class names should start with a capital letter
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur anda: ");
        int umur = input.nextInt();

        if (umur >= 60) {
            System.out.println("Warga Emas");
        } else if (umur >= 30) {
            System.out.println("Dewasa");
        } else if (umur >= 20) {
            System.out.println("Belia");
        } else if (umur >= 0) { 
            System.out.println("Junior");
        } else {
            System.out.println("Sila masukkan umur yang sah.");
        }

        input.close(); 
    }
}

