import java.util.Scanner;

public class bulan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.print("Masukkan nombor mengikut bulan (1-12): ");
        int nom = input.nextInt();

            switch (nom) {
                case 1:
                    System.out.println("Januari");
                    break;
                case 2:
                    System.out.println("Februari");
                    break;
                case 3:
                    System.out.println("Mac");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("Mei");
                    break;
                case 6:
                    System.out.println("Jun");
                    break;
                case 7:
                    System.out.println("Julai");
                    break;
                case 8:
                    System.out.println("Ogos");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("Oktober");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("Disember");
                    break;
                default:
                    System.out.println("Sila masukkan nombor antara 1 hingga 12 sahaja.");
                    break;
            }
        input.close();
    }
}