import java.util.*;

public class test3 { 

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Please enter radius: ");
            double radius = input.nextDouble();
            
            // Memanggil kaedah dengan hantaran argumen (radius)
            area(radius);
        }
    }

    // Kaedah menerima argumen (double radius) dan TIADA nilai dipulangkan (void)
    public static void area(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle is " + area);
    }
    
}


