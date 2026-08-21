
import java.util.Scanner;

public class NomborPlus2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nombor:");
        int nom = sc.nextInt();

        for (; nom <= 10; nom = nom + 2) {
            System.out.println(nom);
            }
        sc.close();
    }
}
