package Image_Modulation;

public class Channels {

    // Channels ------------------------------------------------

    /**
     * it will get Red_Channel
     * @param matrix Pixel Matrix
     */
    public int[][] Red_Channel(int[][] matrix){

        int [][] R_Channel = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++){
                int rgb = matrix[i][j];
                int alpha = (rgb >> 24) & 0xFF;
                int r = (rgb >> 16) & 0xFF;

                R_Channel[i][j] = (alpha << 24) | (r << 16);
            }
        }

        return R_Channel;
    }

    /**
     * it will get Green_Channel
     * @param matrix Pixel Matrix
     */
    public int[][] Green_Channel(int[][] matrix){
        int [][] G_Channel = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++){
                int rgb = matrix[i][j];
                int alpha = (rgb >> 24) & 0xFF;
                int g = (rgb >> 8) & 0xFF;

                G_Channel[i][j] = (alpha << 24) | (g << 8);
            }
        }

        return G_Channel;
    }

    /**
     * it will get Blue_Channel
     * @param matrix Pixel Matrix
     */
    public int[][] Blue_Channel(int[][] matrix){
        int [][] B_Channel = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++){
                int rgb = matrix[i][j];
                int alpha = (rgb >> 24) & 0xFF;
                int b = rgb & 0xFF;

                B_Channel[i][j] = (alpha << 24) | b;
            }
        }

        return B_Channel;
    }

    // ---------------------------------------------------------

}
