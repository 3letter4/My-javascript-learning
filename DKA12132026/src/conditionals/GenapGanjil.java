import java.util.*;
public class GenapGanjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nombor:");
        int num = input.nextInt(); 

        if (num % 2 == 0) {
            System.out.println("nombor "+ num + " ialah nombor GENAP");
        } else {
             System.out.println("nombor "+ num + " ialah nombor GANJIL");
        }
        input.close();
    }
}
