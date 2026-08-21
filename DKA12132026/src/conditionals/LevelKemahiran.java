import java.util.Scanner;
public class LevelKemahiran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.println("Masukkan nombor mengikut kepakaran anda (1 = beginner,2 = intermediate, 3 = expert");
        
        int nom = input.nextInt();

        switch (nom) {
            case 1:
                System.out.println("Beginner");
                break;
            case 2:
                System.out.println("Intermediate");
                break;
            case 3:
                System.out.println("Expert");
                break;
            default:
                System.out.println("Sila masukkan nombor yang ditetapkan");
                break;
        }
        input.close();
    }
}
