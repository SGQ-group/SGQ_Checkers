import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Img {

    //Метод считывания из ресурс папки t.jpg (Доска)
    public BufferedImage img1() {
        try {
            return ImageIO.read(this.getClass().getResource("t.jpg"));
        } catch (IOException e) {
            return null;
        }
    }

    //Метод считывания из ресурс папки w.png и b.png (Черная шашка и белая шашка)
    public BufferedImage img2(int a) {
        //Выбор изображения шашки
        switch (a) {
            case 1: //Белая шашка
                try {
                    return ImageIO.read(this.getClass().getResource("w.png"));
                } catch (IOException e) {
                    return null;
                }
            case 2: //Черная шашка
                try {
                    return ImageIO.read(this.getClass().getResource("b.png"));
                } catch (IOException e) {
                    return null;
                }
            default:
                return null;
        }
    }

    public BufferedImage img3() {
        try {
            return ImageIO.read(this.getClass().getResource("r.png"));
        } catch (IOException e) {
            return null;
        }
    }

    public BufferedImage img4(int a) {
        //Выбор изображения шашки
        switch (a) {
            case 1: //Белая дамка
                try {
                    return ImageIO.read(this.getClass().getResource("wd.png"));
                } catch (IOException e) {
                    return null;
                }
            case 2: //Черная дамка
                try {
                    return ImageIO.read(this.getClass().getResource("bd.png"));
                } catch (IOException e) {
                    return null;
                }
            default:
                return null;
        }
    }
}