package string;

public class IndexOfAndLastIndexOf {
    public static void main(String[] args) {
        String myStr = "Hello planet earth, you are a great planet.";
        // Finds the first index of the substring "planet"
        System.out.println("First occurrence of 'planet' is at index: " + myStr.indexOf("planet"));    

        String testing = "Hello World, Welcome to the World of Java";
        // Finds the last index of the character 'W'
        int lastIndexW = testing.lastIndexOf('W');
        System.out.println("Last index of character 'W' is at index: " + lastIndexW);
    }
}