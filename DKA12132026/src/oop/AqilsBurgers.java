import java.util.Scanner;

// 1. Membina SATU (1) kelas yang dinamakan Menu
class Menu {
    // Variable untuk menyimpan jumlah keseluruhan (running total)
    double runningTotal = 0;

    // 2. Method biasa untuk memaparkan menu (guna nama bermula huruf kecil)
    public void paparMenu() {
        System.out.println("1. Burger (RM5.00)");
        System.out.println("2. Fries (RM3.00)");
        System.out.println("3. Soda (RM2.50)");
        System.out.println("4. Done");
    }

    // 3. Membina method subTotal() - mengira jumlah harga
    public void subTotal(double quantity, double itemPrice) {
        double sub = quantity * itemPrice;
        runningTotal = sub + runningTotal; // Formula: runningTotal = subTotal + runningTotal
        System.out.println("Subtotal: RM " + sub);
        System.out.println(); // Baris kosong untuk kemas
    }

    // 4. Membina method done() - memaparkan jumlah harga akhir
    public void done() {
        System.out.println("Total Price : RM " + runningTotal);
        System.out.println("Enjoy your meal");
    }
}

// 5. Membina kelas utama (main class)
public class AqilsBurgers {
    
    // Instance variables
    int choice;
    int quantity;
    double itemPrice;
    boolean continueOrder;
    Scanner input;
    Menu menuObj;

    // Constructor untuk initialize object dan variable
    public AqilsBurgers() {
        input = new Scanner(System.in);
        menuObj = new Menu();
        continueOrder = true;
    }

    // Method untuk melaksanakan proses tempahan
    public void prosesTempahan() {
        // 6. Menggunakan pernyataan ulangan do-while
        do {
            System.out.println("Welcome to Aqil's Burger");
            menuObj.paparMenu(); // ✅ Panggil method paparMenu()

            System.out.print("Your choice : ");
            choice = input.nextInt();

            // 7. Menggunakan pernyataan pilihan switch-case
            switch (choice) {
                case 1:
                    System.out.println("You've ordered a burger");
                    itemPrice = 5.0;
                    System.out.print("Enter quantity : ");
                    quantity = input.nextInt();
                    menuObj.subTotal(quantity, itemPrice);
                    break;

                case 2:
                    System.out.println("You've ordered a fries");
                    itemPrice = 3.0;
                    System.out.print("Enter quantity : ");
                    quantity = input.nextInt();
                    menuObj.subTotal(quantity, itemPrice);
                    break;

                case 3:
                    System.out.println("You've ordered a soda");
                    itemPrice = 2.5;
                    System.out.print("Enter quantity : ");
                    quantity = input.nextInt();
                    menuObj.subTotal(quantity, itemPrice);
                    break;

                case 4:
                    menuObj.done();
                    continueOrder = false; // Tamatkan loop
                    break;

                default:
                    System.out.println("Pilihan tidak sah. Sila cuba lagi.");
                    System.out.println();
            }
        } while (continueOrder);

        input.close(); // Tutup scanner selepas selesai
    }

    public static void main(String[] args) {
        // Create object kelas utama untuk menjalankan program
        AqilsBurgers sistem = new AqilsBurgers();
        sistem.prosesTempahan();
    }
}