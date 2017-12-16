import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Img {

    //Метод считывания из ресурс папки t.jpg (Доска)
    public BufferedImage img1() {
        try {//Для безопасности
            return ImageIO.read(this.getClass().getResource("t.jpg")); //Достаем картинку с ресурс папки
        } catch (IOException e) {
            return null; //В случае ошибки, возвращаем null
        }
    }

    //Метод считывания из ресурс папки w.png и b.png (Черная шашка и белая шашка)
    public BufferedImage img2(int a) {
        //Выбор изображения шашки
        switch (a) {
            case 1: //Белая шашка
                try {//Для безопасности
                    return ImageIO.read(this.getClass().getResource("w.png"));//Достаем картинку с ресурс папки
                } catch (IOException e) {
                    return null;//В случае ошибки, возвращаем null
                }
            case 2: //Черная шашка
                try {//Для безопасности
                    return ImageIO.read(this.getClass().getResource("b.png"));//Достаем картинку с ресурс папки
                } catch (IOException e) {
                    return null;//В случае ошибки, возвращаем null
                }
            default:
                return null;
        }
    }

    public BufferedImage img3() {
        try {
            return ImageIO.read(this.getClass().getResource("r.png"));//Достаем картинку с ресурс папки
        } catch (IOException e) {
            return null;//В случае ошибки, возвращаем null
        }
    }

    public BufferedImage img4(int a) {
        //Выбор изображения шашки
        switch (a) {
            case 1: //Белая дамка
                try { //Для безопасности
                    return ImageIO.read(this.getClass().getResource("wd.png"));//Достаем картинку с ресурс папки
                } catch (IOException e) {
                    return null;//В случае ошибки, возвращаем null
                }
            case 2: //Черная дамка
                try {//Для безопасности
                    return ImageIO.read(this.getClass().getResource("bd.png"));//Достаем картинку с ресурс папки
                } catch (IOException e) {
                    return null;//В случае ошибки, возвращаем null
                }
            default:
                return null;
        }
    }
}