package Image_Modulation;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Essentials {

    /**
     * It will create a file from the matrix provide with same resolution, And save a file in that folder only
     * @param matrix Pixel Matrix
     * @param Location Location og Original File
     */
    public void CreateImage(int[][] matrix, String Location) {
        String Name = Time_Name();
        String Output_Location = Location_Original(Location) + Name + ".png";

        BufferedImage output = new BufferedImage(matrix.length, matrix[0].length, BufferedImage.TYPE_INT_ARGB);

        Write_Data(matrix, output);

        File output_img = new File(Output_Location);

        try {
            ImageIO.write( output, "png", output_img);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("File Is Created :) with Name :" + Name + ".png");
        System.out.println("Enjoy Your File");
    }

    /**
     * It is extracting data from "imageFile" And making a matrix of that
     *
     * @param matrix Pixel Matrix
     * @param imageFile Og Image
     */
    public void Matrix_Maker(int[][] matrix , BufferedImage imageFile){

        for (int i = 0; i < imageFile.getWidth(); i++) {
            for(int j = 0; j < imageFile.getHeight(); j++){
                matrix[i][j] = (imageFile.getRGB(i, j));
            }
        }
    }

    /**
     * It will Write data on the imageFile
     *
     * @param matrix Pixel Matrix
     * @param imageFile Og Image
     */
    private void Write_Data(int[][] matrix , BufferedImage imageFile){

        for (int i = 0; i < imageFile.getWidth(); i++) {
            for(int j = 0; j < imageFile.getHeight(); j++){
                imageFile.setRGB(i, j, matrix[i][j]);
            }
        }
    }

    /**
     * it will return the time for the name of the file
     *
     * @return Date_Time
     */
    private String Time_Name(){
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH_mm_ss");

        return LocalDate.now() + "_" + time.format(formatter);
    }

    /**
     * @param Location Location of the Original Image
     * @return Location From where Image Belongs to
     */
    private String Location_Original(String Location){

        char[] Location_arr = Location.toCharArray();

        for (int i =  Location.length() - 1 ; i >=0 ; i--) {
            if(Location_arr[i] != '\\' ){
                Location_arr[i] = ' ';
            }
            else {
                break;
            }
        }

        Location = String.valueOf(Location_arr);
        Location = Location.strip();

        return Location;
    }

}
