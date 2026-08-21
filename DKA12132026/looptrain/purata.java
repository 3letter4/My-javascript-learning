package looptrain;

import java.util.Scanner;

public class purata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double jumlah = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nombor ke-" + i + " :");
            double nombor = input.nextDouble();
            jumlah += nombor;
        }

        double purata = jumlah / 10;

        System.out.println("Jumlah = " + jumlah);
        System.out.printf("Purata = %.2f%n", purata);  // dibundarkan kepada 2 tempat perpuluhan

        input.close();
    }
}
