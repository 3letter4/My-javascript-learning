import java.util.Scanner;

public class TambahScanner {
    public static void main(String[] args) {
        
        // 1. Cipta objek Scanner
        Scanner input = new Scanner(System.in);
        
        // 2. Minta pengguna masukkan nombor pertama
        System.out.print("Masukkan nombor pertama: ");
        int no1 = input.nextInt();
        
        // 3. Minta pengguna masukkan nombor kedua
        System.out.print("Masukkan nombor kedua: ");
        int no2 = input.nextInt();
        
        // 4. Proses penambahan
        int hasil = no1 + no2;
        
        // 5. Paparkan hasil tambah
        System.out.println("\n--- HASIL ---");
        System.out.println(no1 + " + " + no2 + " = " + hasil);
        
        // 6. Tutup Scanner
        input.close();
    }
}