package Image_Modulation;

public class Tester {

     /**
      * it will Print the Matrix Data Which will Be big
      * But if you want to see it on raw form you can see
      * @param matrix pixel matrix
      */
     public void PrintMatrix(int[][] matrix){
         for (int i = 0; i < matrix.length; i++) {
             for(int j = 0; j < matrix[0].length; j++){
                 System.out.print(matrix[i][j] +" ");
             }
             System.out.println();
         }
     }

     /**
      * it will Print the Matrix Data Which will Be big
      * But if you want to see it on ARGB form you can see
      * @param matrix pixel matrix
      */
     public void PrintMatrixARGB(int[][] matrix){
         for (int i = 0; i < matrix.length; i++) {
             for(int j = 0; j < matrix[0].length; j++){
                 int rgb = matrix[i][j];
                 int alpha = (rgb >> 24) & 0xFF;
                 int r = (rgb >> 16) & 0xFF;
                 int g = (rgb >> 8) & 0xFF;
                 int b = (rgb) & 0xFF;


                 System.out.print("{" + alpha +","+ r +","+ g +","+ b +"}  ");
             }
             System.out.println();
         }
     }

}
