    import java.util.*;
    public class AreaOfCircle {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Please enter radius: ");
            double radius = input.nextDouble();
            
            // Memanggil kaedah dengan hantaran argumen dan menerima nilai pulangan
            double result = area(radius);
            
            System.out.println("Area of circle is " + result);
        }
    }

    // Kaedah menerima argumen (double radius) DAN mengembalikan nilai (double)
    public static double area(double radius) {
        double area = Math.PI * radius * radius;
        return area; // Mengembalikan nilai hasil pengiraan
    }
    
}

