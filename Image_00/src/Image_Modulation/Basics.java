package Image_Modulation;

public class Basics {

    /**
     * it is inverting the data which is present in the matrix
     * @param matrix Pixels Matrix
     */
    public void Invert(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j <matrix[0].length; j++){
                int rgb = matrix[i][j];
                int alpha = (rgb >> 24) & 0xFF;
                int Invert_r = 255 - (rgb >> 16) & 0xFF;
                int Invert_g = 255 - (rgb >> 8) & 0xFF;
                int Invert_b = 255 - (rgb) & 0xFF;


                matrix[i][j] = (alpha << 24) | (Invert_r << 16) | (Invert_g << 8) | Invert_b;
            }
        }
    }

    /**
     * it will make image Black White
     * @param matrix Pixels Matrix
     */
    public void BW(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j <matrix[0].length; j++){
                int rgb = matrix[i][j];
                int alpha = (rgb >> 24) & 0xFF;
                int r = (rgb >> 16) & 0xFF;
                int g = (rgb >> 8) & 0xFF;
                int b = (rgb) & 0xFF;

                int bw = (r+g+b)/3;

                matrix[i][j] = (alpha << 24) | (bw << 16) | (bw << 8) | bw;
            }
        }
    }

    /**
     * @param matrix Pixel Matrix
     * @return Flipped Matrix
     */
    public int[][] Flip_Horizontally(int[][] matrix){
         int[][] temp = new int[matrix.length][matrix[0].length];
         for (int i = 0; i < matrix.length; i++) {
             for (int j = 0; j < matrix[0].length; j++) {
                 temp[i][j] = matrix[i][matrix[0].length - 1 - j];
             }
         }
         return temp;
    }

    /**
     *
     * @param matrix Pixel Matrix
     * @return Rotated matrix
     */
    public int[][] Rotate_90(int[][] matrix){
        int[][] temp = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                temp[i][matrix.length - j - 1] = matrix[j][i];
            }
        }
        return temp;
    }

    /**
     * @param matrix Pixel Matrix
     * @return Flipped Matrix
     */
    public int[][] Flip_Vertically(int[][] matrix){
        int[][] temp = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            temp[i] = matrix[matrix.length - i -1];
        }
        return temp;
    }

    /**
     * It is remove colour based on the white value (All value os a pixel is equal)
     * @param matrix Pixel Matrix
     */
    public void AlphaChanger(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j <matrix[0].length; j++){
                int rgb = matrix[i][j];
                int r = (rgb >> 16) & 0xFF;
                int g = (rgb >> 8) & 0xFF;
                int b = (rgb) & 0xFF;

                if(r == g && g == b ){
                    int invert = 255 - r;
                    matrix[i][j] = (invert << 24) | (r << 16) | (g << 8) | b;
                }
            }
        }
    }




}
