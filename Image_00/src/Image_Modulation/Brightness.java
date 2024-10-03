package Image_Modulation;

public class Brightness {

    // Brightness ------------------------------------------------

    /**
     * it will increase/Decrease brightness of the image &
     * if  0 < Value <= 1 then Increase
     * if -1 < Value < 0 then Decrease
     *
     * @param matrix Pixel Matrix
     * @param value Brightness
     */
    public void Brightness_IncDec(int[][] matrix, double value){

        if (value >= 0){
            value += 1;

            for (int i = 0; i < matrix.length; i++) {
                for(int j = 0; j <matrix[0].length; j++){
                    int rgb = matrix[i][j];
                    int alpha = (rgb >> 24) & 0xFF;
                    int r = (int) (((rgb >> 16) & 0xFF) * value);
                    int g = (int) (((rgb >> 8) & 0xFF) * value);
                    int b = (int) (((rgb) & 0xFF) * value);

                    r = Math.min(r, 255);
                    g = Math.min(g, 255);
                    b = Math.min(b, 255);


                    matrix[i][j] = (alpha << 24) | (r << 16) | (g << 8) | b;
                }
            }
        }

        else {
            value *= -1;
            value += 1;

            for (int i = 0; i < matrix.length; i++) {
                for(int j = 0; j <matrix[0].length; j++){
                    int rgb = matrix[i][j];
                    int alpha = (rgb >> 24) & 0xFF;
                    int r = (int) (((rgb >> 16) & 0xFF) / value);
                    int g = (int) (((rgb >> 8) & 0xFF) / value);
                    int b = (int) (((rgb) & 0xFF) / value);

                    matrix[i][j] = (alpha << 24) | (r << 16) | (g << 8) | b;
                }
            }

        }
    }


    // ---------------------------------------------------------

    // Change Color ------------------------------------------------------

    /**
     * It will Increase/Decrease only the brightness of red channel… &
     * 0 < Value <= 1  for Increase
     * -1 < value < 0 for Decrease
     *
     * @param matrix Pixel Matrix
     * @param value Brightness
     */
    public void Red_Brightness_IncDec(int[][] matrix, double value){

        if (value >= 0){
            value += 1;

            for (int i = 0; i < matrix.length; i++) {
                for(int j = 0; j <matrix[0].length; j++){
                    int rgb = matrix[i][j];
                    int alpha = (rgb >> 24) & 0xFF;
                    int r = (int) (((rgb >> 16) & 0xFF) * value);
                    int g = ((rgb >> 8) & 0xFF);
                    int b = ((rgb) & 0xFF);

                    r = Math.min(r, 255);

                    matrix[i][j] = (alpha << 24) | (r << 16) | (g << 8) | b;
                }
            }
        }

        else {
            value *= -1;
            value += 1;

            for (int i = 0; i < matrix.length; i++) {
                for(int j = 0; j <matrix[0].length; j++){
                    int rgb = matrix[i][j];
                    int alpha = (rgb >> 24) & 0xFF;
                    int r = (int) (((rgb >> 16) & 0xFF) / value);
                    int g = ((rgb >> 8) & 0xFF);
                    int b = ((rgb) & 0xFF);

                    matrix[i][j] = (alpha << 24) | (r << 16) | (g << 8) | b;
                }
            }

        }
    }

    /**
     * It will Increase only the brightness of Green channel… &
     * 0 < Value <= 1  for Increase
     * -1 < value < 0 for Decrease
     * @param matrix Pixel Matrix
     * @param value Brightness
     */
    public void Green_Brightness_IncDec(int[][] matrix, double value){

        if (value >= 0){
            value += 1;

            for (int i = 0; i < matrix.length; i++) {
                for(int j = 0; j <matrix[0].length; j++){
                    int rgb = matrix[i][j];
                    int alpha = (rgb >> 24) & 0xFF;
                    int r = ((rgb >> 16) & 0xFF);
                    int g = (int) (((rgb >> 8) & 0xFF) * value);
                    int b = ((rgb) & 0xFF);

                    g = Math.min(g, 255);

                    matrix[i][j] = (alpha << 24) | (r << 16) | (g << 8) | b;
                }
            }
        }

        else {
            value *= -1;
            value += 1;

            for (int i = 0; i < matrix.length; i++) {
                for(int j = 0; j <matrix[0].length; j++){
                    int rgb = matrix[i][j];
                    int alpha = (rgb >> 24) & 0xFF;
                    int r = ((rgb >> 16) & 0xFF);
                    int g = (int) (((rgb >> 8) & 0xFF) / value);
                    int b = ((rgb) & 0xFF);

                    matrix[i][j] = (alpha << 24) | (r << 16) | (g << 8) | b;
                }
            }

        }
    }

    /**
     * It will Increase only the brightness of Blue channel… &
     * 0 < Value <= 1  for Increase
     * -1 < value < 0 for Decrease
     * @param matrix Pixel Matrix
     * @param value Brightness
     */
    public void Blue_Brightness_IncDec(int[][] matrix, double value){

        if (value >= 0){
            value += 1;

            for (int i = 0; i < matrix.length; i++) {
                for(int j = 0; j <matrix[0].length; j++){
                    int rgb = matrix[i][j];
                    int alpha = (rgb >> 24) & 0xFF;
                    int r = ((rgb >> 16) & 0xFF);
                    int g = ((rgb >> 8) & 0xFF);
                    int b = (int) (((rgb) & 0xFF) * value);

                    b = Math.min(b, 255);

                    matrix[i][j] = (alpha << 24) | (r << 16) | (g << 8) | b;
                }
            }
        }

        else {
            value *= -1;
            value += 1;

            for (int i = 0; i < matrix.length; i++) {
                for(int j = 0; j <matrix[0].length; j++){
                    int rgb = matrix[i][j];
                    int alpha = (rgb >> 24) & 0xFF;
                    int r = ((rgb >> 16) & 0xFF);
                    int g = ((rgb >> 8) & 0xFF);
                    int b = (int) (((rgb) & 0xFF) / value);

                    matrix[i][j] = (alpha << 24) | (r << 16) | (g << 8) | b;
                }
            }

        }
    }

    // -------------------------------------------------------------------


}
