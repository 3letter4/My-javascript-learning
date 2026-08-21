import java.util.Scanner; // 1. Import Scanner

public class JumlahMethod {
    public static void main(String[] args) {
        
        // 2. Cipta objek Scanner untuk membaca input dari keyboard
        Scanner input = new Scanner(System.in);
        
        // 3. Minta pengguna masukkan nombor
        System.out.print("Masukkan No 1: ");
        int no1 = input.nextInt();
        
        System.out.print("Masukkan No 2: ");
        int no2 = input.nextInt();
        
        // 4. Panggil fungsi jumlah
        int hasil = jumlah(no1, no2);
        
        // 5. Paparkan keputusan
        System.out.println("\n--- KEPUTUSAN ---");
        System.out.println("No 1 = " + no1);
        System.out.println("No 2 = " + no2);
        System.out.println("Hasil tambah = " + hasil);
        
        // 6. Tutup Scanner
        input.close();
    }

    // Fungsi tetap sama seperti kod asal anda
    static int jumlah(int no1, int no2) {
        int total;
        total = no1 + no2;
        return total;
    }
}