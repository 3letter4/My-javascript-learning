import java.util.Scanner;
public class KiraTudung {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            
            System.out.print("Masukkan wang: ");
            double wang = input.nextDouble();

            System.out.print("Masukkan harga tudung: ");
            double harga = input.nextDouble();
            

            double jumlah = wang / harga;
            double baki = wang % harga;

            System.out.println("Jumlah tudung yang boleh dibeli: " + (int) jumlah);
            System.out.println("Baki wang: RM" + baki);

            
        } 
    }
}


