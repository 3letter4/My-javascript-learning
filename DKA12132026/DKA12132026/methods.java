public class methods {
    public class MethodExample {
    
    // Define the wish method
    public static void wish() {
        System.out.println("Senyum adalah sedeqah");
    }

    // Define the line method
    public static void line() {
        System.out.println("======================");
    }

    public static void main(String[] args) {
        // Call the methods in the desired sequence
        for (int i = 0; i < 10; i++) {
            line();
            wish();
            line();
        }
    }
}

}
