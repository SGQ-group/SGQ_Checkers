import javax.swing.*;
import java.awt.*;

public class Main extends JPanel { //Наследуя от JFrame мы получаем всю функциональность окна

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        ImageIcon icon1 = new ImageIcon(new Img().img1());
        ImageIcon icon2 = new ImageIcon(new Img().img2());
        ImageIcon icon3 = new ImageIcon(new Img().img3());
        g.drawString("Hello", 20, 20);//числа это отступ от левого верхнего угла панели.
        icon1.paintIcon(this,g,2,2);
        for (int i = 0; i < 8; i++) {
            icon2.paintIcon(this,g,60 + (99*i),60);
        }
        for (int i = 1; i < 8; i++) {
            icon3.paintIcon(this,g,60,60 + (99*i));
        }
    }


    public static void main(String[] args) throws InterruptedException { //эта функция может быть и в другом классе
        JFrame jFrame = new JFrame("My First Window");

        jFrame.setBounds(500, 500, 900, 930); //Размер и положение окна
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Возможность закрывать через крестик окно
        jFrame.setResizable(false); //Нельзя изменять размер окна

        JPanel panel = new Main();
        jFrame.add(panel);
        jFrame.setVisible(true);
    }
}