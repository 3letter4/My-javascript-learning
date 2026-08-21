import java.util.Scanner;
public class gred {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Berapakah markah anda?:");
        int markah = input.nextInt();

        if (markah >= 50) {
            System.out.println("Tahniah, anda lulus!");
        } else {
            System.out.println("Maaf, sila berusaha lagi...");
        }
        input.close();
    }
}
