import java.util.*;

public class TahunLompat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tahun: ");
        int tahun = input.nextInt();

        /* nombor seperti 1900 dan 2100 bukan tahun lompat 
        namun nombor yang dibahagi 400 ialah tahun lompat */
        if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
            System.out.println(tahun + " merupakan tahun lompat");
        } else {
            System.out.println(tahun + " merupakan bukan tahun lompat");
        }

        input.close();
    }
}
