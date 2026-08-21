import java.util.Scanner;

public class markahgred {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan gred anda (A/B/C/D/E): ");
        char gred = input.next().charAt(0); 

        // Letakkan huruf di dalam tanda petik tunggal ' '
        switch (gred) {
            case 'A':
                System.out.println("Tahniah kerana anda dapat A!");
                break;
            case 'B':
                System.out.println("Bagus! Anda mendapat gred B.");
                break;
            case 'C':
                System.out.println("Anda mendapat gred C. Boleh dipertingkatkan lagi.");
                break;
            case 'D':
                System.out.println("Anda mendapat gred D. Sila gandakan usaha.");
                break;
            case 'E':
                System.out.println("Anda mendapat gred E. Perlukan banyak bimbingan.");
                break;
            default:
                System.out.println("Gred tidak sah! Sila masukkan A, B, C, D, atau E sahaja.");
        }
        
        input.close(); 
    }
}
