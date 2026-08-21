public class dowhile {
    public static void main(String[] args){
        int i = 1;
        do {
            System.out.println("nombor bernilai: " + i);
            i = i + 1;
        }
            while (i <= 3);
            System.out.println("loop tamat");
            System.out.println("Nilai nombor di luar loop: " + i);
    }
}