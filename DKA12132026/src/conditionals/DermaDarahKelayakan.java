import java.util.*;
public class DermaDarahKelayakan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age, weight;

        System.out.print("masukkan umur anda: ");
        age = sc.nextInt();
        System.out.print("masukkan berat anda: ");
        weight = sc.nextInt();

        if(age>=18){
            if(weight >= 50){
                System.out.println("Anda layak untuk menderma darah");
            } else {
                System.out.println("anda tidak layak untuk menderma darah");
            }
        } else {
            System.out.println("anda tidak layak untuk menderma darah");
        }
    sc.close();}
}
