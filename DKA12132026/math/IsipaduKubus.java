import java.io.*;

public class IsipaduKubus {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int sisi, isipadu;
        System.out.print("Sila masukkan panjang sisi kubus: ");
        str = br.readLine();
        sisi = Integer.parseInt(str);
        isipadu = sisi * sisi * sisi;
        System.out.println("Isipadu kubus ialah: " + isipadu);
    }
}
