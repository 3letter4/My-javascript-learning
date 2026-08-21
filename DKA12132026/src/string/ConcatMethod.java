package string;

public class ConcatMethod {
    public static void main(String[] args) {
        String firstName = "James";
        String lastName = "Smith";
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println(fullName);
    }
}
