public class loop {
    public static void main (String[] args) {
        
        // Loop 1: Prints numbers from 1 to 6
        int nombor;
        for (nombor = 1; nombor <= 6; nombor++) {
            System.out.println(nombor);
        }
        
        // Loop 2: Prints "Hello" 5 times, each on a new line
        String buah = "Durian";
        int repetitions = 5;
        for (int i = 0; i < repetitions; i++) {
            System.out.println(buah);
        }
        
        // Loop 3: Prints five asterisks on a single line
        int stars = 5;
        for (int i = 0; i < stars; i++) {
            System.out.print("*");
        }
        System.out.println(); // Moves to a new line after the stars
    }
}
