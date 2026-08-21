import java.util.Scanner;
public class kuasadua {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nombor: ");
        int nombor = input.nextInt();
        int kuasadua = nombor * nombor;
        System.out.println("Kuasa dua nombor tersebut ialah: " + kuasadua);
       
    input.close();}
}
