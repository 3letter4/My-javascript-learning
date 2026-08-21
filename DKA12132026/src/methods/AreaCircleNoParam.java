import java.util.*;

public class test2 { 

    public static void main(String[] args) {
        double result;
        result = area();
        System.out.println("Area of circle is " + result); // Ditambah jarak selepas 'is'
    }

    public static double area() {
        double radius; 
        double area;
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Please enter radius: ");
            radius = input.nextDouble(); // Menggunakan 'radius' yang betul
            area = Math.PI * radius * radius;
            return area;
        } // input ditutup secara automatik di sini
    }
    
}