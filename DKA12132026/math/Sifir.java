import java.util.*;

public class Sifir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("[+] Masukkan Sifir: ");
        int sifir = input.nextInt();
        
        System.out.println("=====================");
        System.out.printf("   Sifir %d Utama \n", sifir);
        System.out.println("=====================");
        
        for (int i = 1; i <= 12; i++) {
            // %2d ensures numbers align perfectly in a straight line
            System.out.printf("| %2d x %-2d = %3d |\n", sifir, i, (sifir * i));
        }
        
        System.out.println("=====================");
        input.close();
    }
}
