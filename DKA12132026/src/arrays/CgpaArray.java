public class CgpaArray {
    public static void main(String[] args){

      	// Array Intialised and Assigned
        double[][] cpga = { { 3.1, 3.4 }, { 3.4, 2.7 },{4.0,3.9} };

      	// Printing the Array
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 2; j++)
                System.out.print(cpga[i][j]+" ");
          	System.out.println();
    	}
    }
}

