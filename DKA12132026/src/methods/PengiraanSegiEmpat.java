import java.io.*;

public class PengiraanSegiEmpat {

    // Method untuk mengira luas
    public static int kiraLuas(int panjang, int lebar) {
        return panjang * lebar;
    }

    // Method untuk mengira perimeter
    public static int kiraPerimeter(int panjang, int lebar) {
        return (2 * panjang) + (2 * lebar);
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Sila Masukkan Panjang:");
        int panjang = Integer.parseInt(br.readLine());

        System.out.println("Sila Masukkan Lebar:");
        int lebar = Integer.parseInt(br.readLine());

        int luas = kiraLuas(panjang, lebar);
        int perimeter = kiraPerimeter(panjang, lebar);

        System.out.println("Luas ialah:" + luas);
        System.out.println("Perimeter ialah:" + perimeter);
    }
}