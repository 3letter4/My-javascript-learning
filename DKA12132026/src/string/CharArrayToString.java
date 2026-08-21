package string;

public class CharArrayToString {
    public static void main(String[] args) {
        char huruf[] = {'A', 'B', 'C', 'D', 'E'};
        
        // Convert char array to String
        String message = new String(huruf);
        
        System.out.println(message); // ABCDE
    }
}