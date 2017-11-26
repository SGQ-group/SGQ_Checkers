import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Game implements Runnable, MouseListener {

    public void run() {
        JFrame frame = new JFrame();
        frame.setTitle("Test mouse events");
        // при закрытии окна выйти
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        JPanel panel = new Drawing();
        panel.setPreferredSize(new Dimension(900, 900));

        panel.addMouseListener(this);

        Container cp = frame.getContentPane();
        cp.setLayout(new BorderLayout());

        cp.add(panel, BorderLayout.CENTER);

        // пакуем
        frame.pack();
        // показываем
        frame.setVisible(true);
    }

    /////////////
    // MouseEvent methods
    public void mouseClicked(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
        printMouseEvent(e);
    }

    public void mouseReleased(MouseEvent e) {
    }

    //////////////
    // util methods
    private void printMouseEvent(MouseEvent e) {
        int button = e.getButton();
        switch (button) {
            case MouseEvent.BUTTON1: {
                System.out.println("Button1");
                break;
            }
            default: {
                break;
            }
        }
        Point p = e.getPoint();
        System.out.println("point: " + p);
    }
}