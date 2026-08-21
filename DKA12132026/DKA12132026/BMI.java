import java.util.Scanner;

public class BMI { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double BMI, tinggi, berat;

        System.out.print("Masukkan tinggi anda(m): ");
        tinggi = input.nextDouble();
        System.out.print("Masukkan berat anda(kg): ");
        berat = input.nextDouble();

        BMI = berat / (tinggi * tinggi);
        
        // Memformat paparan BMI kepada 2 tempat perpuluhan
        System.out.print("BMI anda ialah: ");
        System.out.printf("%.2f\n", BMI); 

        if (BMI <= 20.6) {
            System.out.println("Kurus");
        } else if (BMI <= 26.4) {
            System.out.println("Normal");
        } else if (BMI <= 30.9) {
            System.out.println("Gemuk");
        } else if (BMI <= 45.2) { 
            System.out.println("Obesiti");
        } else if (BMI > 45.2){
            System.out.println("Bahaya");
        } else {
            System.out.println("masukkan input yang betul");
        }

        input.close(); 
    }
}

