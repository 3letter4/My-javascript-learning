public class tambahArgs { 
    public static void main(String[] args) { 
        if (args.length < 2) {
            System.out.println("Ralat: Gunakan format 'java tambahArgs [nombor1] [nombor2]'");
            return;
        }

        try {
            int total = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
            System.out.println("Jumlah hasil tambah: " + total); 
        } catch (NumberFormatException e) {
            System.out.println("Ralat: Sila masukkan nombor bulat sahaja.");
        }
    }
}


