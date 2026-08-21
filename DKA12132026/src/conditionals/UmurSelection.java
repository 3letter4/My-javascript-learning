import java.util.*;
public class umur {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    
    System.out.println("Your age?");
    int umur = input.nextInt();
    
    if (umur >= 16) {
        System.out.println("Welcome to KVSA");
    } else {
        System.out.println("Sorry, your age isn't enough for entering college");
    }
    input.close();}
}
