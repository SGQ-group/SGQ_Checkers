import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Img {

    public Img() {
    }

    public BufferedImage img1() {
        try {
            return ImageIO.read(this.getClass().getResource("t.jpg"));
        } catch (IOException e) {
            return null;
        }
    }

    public BufferedImage img2(int a) {
        switch (a) {
            case 1:
                try {
                    return ImageIO.read(this.getClass().getResource("w.png"));
                } catch (IOException e) {
                    return null;
                }

            case 2:
                try {
                    return ImageIO.read(this.getClass().getResource("b.png"));
                } catch (IOException e) {
                    return null;
                }

            default:
                return null;

        }
    }
}