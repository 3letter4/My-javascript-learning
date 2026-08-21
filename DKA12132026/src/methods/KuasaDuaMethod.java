import java.util.Scanner;

public class KuasaDuaMethod {

    // Method accepts argument 'n' and RETURNS n squared (n * n)
    public static int kiraKuasaDua(int n) {
        int hasil = n * n;
        return hasil;
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan nilai n: ");
            int n = input.nextInt();

            // Panggil method dan terima nilai pulangan
            int jawapan = kiraKuasaDua(n);

            // Papar keputusan
            System.out.println(n + " kuasa 2 (" + n + "²) = " + jawapan);
        }
    }
}