
import java.util.Scanner; 
public class TwoDimensionInput { 
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 
        
        int rows = 3; // Mengisytiharkan pembolehubah integer 'rows' dengan nilai 3 (untuk 3 pelajar)
        // Col 0 = Name, Col 1 = Class, Col 2 = CGPA (Komen asal: menerangkan struktur lajur)
        Object[][] students = new Object[rows][3]; // Mengisytiharkan dan mencipta array dua dimensi jenis Object bernama 'students' dengan 3 baris dan 3 lajur

        for (int i = 0; i < rows; i++) { // Memulakan gelung 'for' untuk mengulangi proses input bagi setiap baris (pelajar) dari indeks 0 hingga 2

            System.out.print("Enter Name: "); // Mencetak teks "Enter Name: " di konsol tanpa baris baharu
            students[i][0] = input.next(); // Membaca input teks (String) nama dan menyimpannya di lajur 0 bagi baris semasa
            // Column 0: String (Komen asal: lajur 0 menyimpan data jenis String)

            System.out.print("Enter Class: "); // Mencetak teks "Enter Class: " di konsol tanpa baris baharu
            students[i][1] = input.next(); // Membaca input teks (String) kelas dan menyimpannya di lajur 1 bagi baris semasa
            // Column 1: String (Komen asal: lajur 1 menyimpan data jenis String)

            System.out.print("Enter CGPA: "); // Mencetak teks "Enter CGPA: " di konsol tanpa baris baharu
            students[i][2] = input.nextDouble(); // Membaca input nombor perpuluhan (double) CGPA dan menyimpannya di lajur 2 bagi baris semasa
            // Column 2: double (Komen asal: lajur 2 menyimpan data jenis double)
        } // Menutup gelung 'for' untuk proses input

        // Print rows (Komen asal: bahagian untuk mencetak baris)
        for (int i = 0; i < rows; i++) { // Memulakan gelung 'for' untuk mengulangi proses cetakan bagi setiap baris data pelajar
            System.out.printf("%-12s %-10s %-5.2f\n", // Menggunakan format cetakan: %-12s (String, 12 ruang, rata kiri), %-10s (String, 10 ruang, rata kiri), %-5.2f (nombor perpuluhan, 5 ruang total, 2 tempat perpuluhan, rata kiri), \n (baris baharu)
                students[i][0], students[i][1], (Double) students[i][2]); // Menghantar nilai Nama, Kelas, dan CGPA (ditukar jenis kepada Double) untuk diisi ke dalam format cetakan di atas
        } // Menutup gelung 'for' untuk proses cetakan

        input.close(); // Menutup objek Scanner untuk mengelakkan kebocoran sumber (resource leak) dan membebaskan memori
    }
} 