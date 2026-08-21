
import java.util.*;

public class NomborMenurun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan nombor:");
        int nom = sc.nextInt();

        for (; nom > 1; nom--) {
            System.out.println(nom - 1);
        }
        sc.close();
    }
}