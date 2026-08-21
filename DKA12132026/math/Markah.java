public class Markah {
    public static void main(String[] args) {
        int bil_subjek = 5, bm = 80, bi = 65, math = 85, pi = 90, sains = 55;
        double purata;
        String namapljr = "Ali";

        // ✅ Ditambah 'pi' di dalam pengiraan
        purata = (bm + bi + math + sains + pi) / (double) bil_subjek;

        System.out.println("Nama pelajar = " + namapljr);
        System.out.println("Purata = " + purata);
    }
}