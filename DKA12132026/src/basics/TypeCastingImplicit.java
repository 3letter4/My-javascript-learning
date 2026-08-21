public class TypeCastingImplicit {
    public static void main (String[] args){
        double x; 
        int y = 3; 
        float z = 2.5f; // Added 'f' to fix the compilation error
        
        x = y + z; // Implicit casting happens here
        System.out.println("Hasil tambah dua nombor " + x);
    }
}
