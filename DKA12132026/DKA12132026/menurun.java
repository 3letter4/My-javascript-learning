import java.util.*;
public class menurun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan nombor:");
        int nom = sc.nextInt();
        sc.close();

for (; nom > 1; ) {          
    nom--;                   
    System.out.println(nom); 
}
    }
}
