import Image_Modulation.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {

    static final String Location = "E:\\Language\\Projects\\1.jpg";

    public static void main(String[] args) {

        BufferedImage Image;

        File file_Image = new File(Location);

        try {
            Image = ImageIO.read(file_Image);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        int[][] matrix = new int[Image.getWidth()][Image.getHeight()];

        Essentials essentials = new Essentials();
        Channels channels = new Channels();
        Brightness brightness = new Brightness();
        Basics basics = new Basics();

        // it will read image and add data to the matrix
        essentials.Matrix_Maker(matrix, Image);

        essentials.CreateImage(basics.Rotate_90(basics.Rotate_90(matrix)), Location);

    }

}
