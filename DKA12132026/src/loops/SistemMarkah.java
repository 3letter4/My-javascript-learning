
import java.util.Scanner;

public class SistemMarkah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlah, tertinggi, terendah, lulus, gagal;
        jumlah = 0;
        tertinggi = -1;       // initialise with lowest possible
        terendah = 101;       // initialise with highest possible
        lulus = 0;
        gagal = 0;

        // Loop to input marks for 10 students
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan markah pelajar ke-" + i + " :");
            int markah = sc.nextInt();

            jumlah += markah;

            // Update highest
            if (markah > tertinggi) {
                tertinggi = markah;
            }

            // Update lowest
            if (markah < terendah) {
                terendah = markah;
            }

            // Count pass/fail
            if (markah >= 50) {
                lulus++;
            } else {
                gagal++;
            }
        }

        // Calculate average as double (for decimal precision)
        double purata = (double) jumlah / 10;

        // -------------------- DISPLAY REPORT --------------------
        System.out.println("========================================");
        System.out.println("       LAPORAN MARKAH 10 PELAJAR");
        System.out.println("========================================");
        System.out.println("Jumlah markah           : " + jumlah);
        System.out.println("Purata markah           : " + String.format("%.2f", purata));
        System.out.println("Markah tertinggi        : " + tertinggi);
        System.out.println("Markah terendah         : " + terendah);
        System.out.println("Bilangan pelajar lulus  : " + lulus + " (≥ 50)");
        System.out.println("Bilangan pelajar gagal  : " + gagal + " (< 50)");
        System.out.println("========================================");

        sc.close();  // optional: close scanner
    }
}