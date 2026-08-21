public class ArrayHariBulan {
    public static void main(String[] args) {
        int[] hari = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] bulan = {"Januari", "Februari", "Mac", "April", "Mei", "Jun","Julai", "Ogos", "September", "Oktober", "November", "Disember"};

        for (int i = 0; i < hari.length; i++) {
            System.out.println(bulan[i] + " mempunyai " + hari[i] + " hari");
             
        }
}   
}
