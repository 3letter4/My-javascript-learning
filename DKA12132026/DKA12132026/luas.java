import java.util.*;
public class luas {
    static double kiraluas(double jejari){
        double luas;
        luas = Math.PI * jejari * jejari;
        return luas;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.print("masukkan nombor:");
        int nom = sc.nextInt(); 
        System.out.println(kiraluas(nom));
        sc.close();
    }
}
