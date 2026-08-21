import java.util.Scanner;

public class switcher {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nombor: ");
        int nom = input.nextInt();

        switch (nom) {
            case 1:
                System.out.println("satu");
                break;
            case 2:
                System.out.println("dua");
                break;
            case 3:
                System.out.println("tiga");
                break;
            default: 
                System.err.println("nombor besar sgt");
                break;
        }
        input.close();
    }
}
