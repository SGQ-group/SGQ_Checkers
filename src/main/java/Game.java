import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Game implements Runnable, MouseListener {
    private JPanel panel;
    private boolean bool1 = false;
    private boolean bool2 = false;
    private boolean bool3 = false;
    private boolean bool4 = false;
    private int index;

    public void run() {
        JFrame frame = new JFrame();
        frame.setTitle("Test mouse events");
        // при закрытии окна выйти
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        panel = new Drawing();

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
//                System.out.println("Button1");
                BoxTrigger(e.getX(), e.getY());
                break;
            }
            default: {
                break;
            }
        }
        Point p = e.getPoint();
        System.out.println("point: " + p);
    }

    public void BoxTrigger(double x, double y) {
        ((Drawing) panel).setGraf(false);
        if (x >= 60.0 && y >= 60.0 && x <= 852.0 && y <= 157.0) {
            if (x >= 156.0 && x <= 255.0) checkCell(156, 60);
            if (x >= 354.0 && x <= 453.0) checkCell(354, 60);
            if (x >= 552.0 && x <= 651.0) checkCell(552, 60);
            if (x >= 750.0 && x <= 849.0) checkCell(750, 60);
        }
        if (x >= 60.0 && y >= 159.0 && x <= 852.0 && y <= 256.0) {
            if (x >= 56.0 && x <= 155.0) checkCell(56, 159);
            if (x >= 254.0 && x <= 353.0) checkCell(254, 159);
            if (x >= 452.0 && x <= 551.0) checkCell(452, 159);
            if (x >= 650.0 && x <= 749.0) checkCell(650, 159);
        }
        if (x >= 60.0 && y >= 258.0 && x <= 852.0 && y <= 355.0) {
            if (x >= 156.0 && x <= 255.0) checkCell(156, 258);
            if (x >= 354.0 && x <= 453.0) checkCell(354, 258);
            if (x >= 552.0 && x <= 651.0) checkCell(552, 258);
            if (x >= 750.0 && x <= 849.0) checkCell(750, 258);
        }
        if (x >= 60.0 && y >= 357.0 && x <= 852.0 && y <= 454.0) {
            if (x >= 56.0 && x <= 155.0) checkCell(56, 357);
            if (x >= 254.0 && x <= 353.0) checkCell(254, 357);
            if (x >= 452.0 && x <= 551.0) checkCell(452, 357);
            if (x >= 650.0 && x <= 749.0) checkCell(650, 357);
        }
        if (x >= 60.0 && y >= 456.0 && x <= 852.0 && y <= 553.0) {
            if (x >= 156.0 && x <= 255.0) checkCell(156, 456);
            if (x >= 354.0 && x <= 453.0) checkCell(354, 456);
            if (x >= 552.0 && x <= 651.0) checkCell(552, 456);
            if (x >= 750.0 && x <= 849.0) checkCell(750, 456);
        }
        if (x >= 60.0 && y >= 555.0 && x <= 852.0 && y <= 652.0) {
            if (x >= 56.0 && x <= 155.0) checkCell(56, 555);
            if (x >= 254.0 && x <= 353.0) checkCell(254, 555);
            if (x >= 452.0 && x <= 551.0) checkCell(452, 555);
            if (x >= 650.0 && x <= 749.0) checkCell(650, 555);
        }
        if (x >= 60.0 && y >= 654.0 && x <= 852.0 && y <= 751.0) {
            if (x >= 156.0 && x <= 255.0) checkCell(156, 654);
            if (x >= 354.0 && x <= 453.0) checkCell(354, 654);
            if (x >= 552.0 && x <= 651.0) checkCell(552, 654);
            if (x >= 750.0 && x <= 849.0) checkCell(750, 654);
        }
        if (x >= 60.0 && y >= 753.0 && x <= 852.0 && y <= 850.0) {
            if (x >= 56.0 && x <= 155.0) checkCell(56, 753);
            if (x >= 254.0 && x <= 353.0) checkCell(254, 753);
            if (x >= 452.0 && x <= 551.0) checkCell(452, 753);
            if (x >= 650.0 && x <= 749.0) checkCell(650, 753);
        }
    }

    private void checkCell(int positionX, int positionY) {
        for (int i = 0; i < 12; i++) {
            int posX = ((Drawing) panel).getCheckers_w().get(i).getPosition_w().get(i).getPositionX();
            int posY = ((Drawing) panel).getCheckers_w().get(i).getPosition_w().get(i).getPositionY();
            if (positionX == posX && positionY == posY) {
                index = i;
                bool1 = true;
                bool2 = false;
                bool3 = false;
                bool4 = false;
                return;
            } else {
                bool2 = true;
            }
        }
        for (int i = 0; i < 12; i++) {
            int posX = ((Drawing) panel).getCheckers_b().get(i).getPosition_b().get(i).getPositionX();
            int posY = ((Drawing) panel).getCheckers_b().get(i).getPosition_b().get(i).getPositionY();
            if (positionX == posX && positionY == posY) {
                index = i;
                bool1 = false;
                bool2 = false;
                bool3 = true;
                bool4 = false;
                return;
            } else {
                bool4 = true;
            }
        }
        if (bool2) {
            if (bool1) {
                ((Drawing) panel).getCheckers_w().get(index).getPosition_w().get(index).setPositionX(positionX);
                ((Drawing) panel).getCheckers_w().get(index).getPosition_w().get(index).setPositionY(positionY);
                panel.print(panel.getGraphics());
                bool1 = false;
                bool2 = false;
                bool3 = false;
                bool4 = false;
            }
        }
        if (bool4) {
            if (bool3) {
                ((Drawing) panel).getCheckers_b().get(index).getPosition_b().get(index).setPositionX(positionX);
                ((Drawing) panel).getCheckers_b().get(index).getPosition_b().get(index).setPositionY(positionY);
                panel.print(panel.getGraphics());
                bool1 = false;
                bool2 = false;
                bool3 = false;
                bool4 = false;
            }
        }
    }
}