
public class TwoDimensionArray {
    public static void main(String[] args) {
    // membina mutidementional array    
        char huruf [] [] = { 
            {'A','B','C'},
            {'D','E','F'},
            {'G','H','I'}
        };
        /*  
        System.out.println(huruf [0][0]);
        System.out.println(huruf [1][1]);
        System.out.println(huruf [2][1]);
        */
    
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c< 3; c++) {
                System.out.println(huruf [r][c] + "  ");
            }
            System.out.println();
        }
}
}