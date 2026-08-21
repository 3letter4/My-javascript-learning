import java.util.Scanner;

public class tempahan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Header Menu
        System.out.println("==================================");
        System.out.println("     SELAMAT DATANG KE HOTEL      ");
        System.out.println("==================================");
        System.out.println("--- MENU PILIHAN BILIK ---");
        System.out.printf("T. Bilik Hadap Taman (RM 125)%n");
        System.out.printf("K. Bilik Hadap Kolam (RM 145)%n");
        System.out.printf("S. Bilik Hadap Tasik (RM 180)%n");
        System.out.println("----------------------------------");
        
        // Input details
        System.out.print("Masukkan nama anda             : ");
        String nama = input.nextLine();

        System.out.print("Masukkan jenis bilik anda (T/K/S): ");
        char bilik = input.next().charAt(0); 

        System.out.print("Masukkan bilangan hari tempahan: ");
        int bilanganHari = input.nextInt();

        double hargaBilik = 0.0; 
        String jenisBilik = "";
        boolean kodSah = true;

        // Proses menyemak jenis bilik menggunakan switch-case
        switch (bilik) {
            case 'T':
            case 't': 
                jenisBilik = "Hadap Taman";
                hargaBilik = 125.00;
                break;
            case 'K':
            case 'k':
                jenisBilik = "Hadap Kolam";
                hargaBilik = 145.00;
                break;
            case 'S':
            case 's':
                jenisBilik = "Hadap Tasik";
                hargaBilik = 180.00; 
                break;
            default:
                System.out.println("\nRalat: Sila masukkan kod bilik yang sah (T, K, atau S) sahaja.");
                kodSah = false;
                break; 
        } 

        // Papar resit jika kod bilik sah
        if (kodSah) {
            double jumlahHarga = hargaBilik * bilanganHari;

            System.out.println("\n==================================");
            System.out.println("          RESIT TEMPAHAN          ");
            System.out.println("==================================");
            System.out.printf("%-15s : %s%n", "Nama Pelanggan", nama);
            System.out.printf("%-15s : %s%n", "Jenis Bilik", jenisBilik);
            System.out.printf("%-15s : RM %.2f / malam%n", "Harga Semalam", hargaBilik);
            System.out.printf("%-15s : %d hari%n", "Bilangan Hari", bilanganHari);
            System.out.println("----------------------------------");
            System.out.printf("%-15s : RM %.2f%n", "Jumlah Bayaran", jumlahHarga);
            System.out.println("==================================");
        }
        
        input.close(); 
    } 
}

