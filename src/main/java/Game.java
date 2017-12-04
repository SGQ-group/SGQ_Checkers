import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Game implements Runnable, MouseListener {
    private JPanel panel;
    private boolean bool1 = false;
    private boolean bool2 = false;
    private boolean bool3 = false;
    private boolean bool4 = false;
    private boolean bool6 = false;
    private int index;
    private ImageIcon icon;

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
            if (x >= 159.0 && x <= 255.0) checkCell(159, 60);
            if (x >= 357.0 && x <= 453.0) checkCell(357, 60);
            if (x >= 555.0 && x <= 651.0) checkCell(555, 60);
            if (x >= 753.0 && x <= 849.0) checkCell(753, 60);
        }
        if (x >= 60.0 && y >= 159.0 && x <= 852.0 && y <= 260.0) {
            if (x >= 60.0 && x <= 155.0) checkCell(60, 159);
            if (x >= 258.0 && x <= 353.0) checkCell(258, 159);
            if (x >= 456.0 && x <= 551.0) checkCell(456, 159);
            if (x >= 654.0 && x <= 749.0) checkCell(654, 159);
        }
        if (x >= 60.0 && y >= 258.0 && x <= 852.0 && y <= 355.0) {
            if (x >= 159.0 && x <= 255.0) checkCell(159, 258);
            if (x >= 357.0 && x <= 453.0) checkCell(357, 258);
            if (x >= 555.0 && x <= 651.0) checkCell(555, 258);
            if (x >= 753.0 && x <= 849.0) checkCell(753, 258);
        }
        if (x >= 60.0 && y >= 357.0 && x <= 852.0 && y <= 454.0) {
            if (x >= 60.0 && x <= 155.0) checkCell(60, 357);
            if (x >= 258.0 && x <= 353.0) checkCell(258, 357);
            if (x >= 456.0 && x <= 551.0) checkCell(456, 357);
            if (x >= 654.0 && x <= 749.0) checkCell(654, 357);
        }
        if (x >= 60.0 && y >= 456.0 && x <= 852.0 && y <= 553.0) {
            if (x >= 159.0 && x <= 255.0) checkCell(159, 456);
            if (x >= 357.0 && x <= 453.0) checkCell(357, 456);
            if (x >= 555.0 && x <= 651.0) checkCell(555, 456);
            if (x >= 753.0 && x <= 849.0) checkCell(753, 456);
        }
        if (x >= 60.0 && y >= 555.0 && x <= 852.0 && y <= 652.0) {
            if (x >= 60.0 && x <= 155.0) checkCell(60, 555);
            if (x >= 258.0 && x <= 353.0) checkCell(258, 555);
            if (x >= 456.0 && x <= 551.0) checkCell(456, 555);
            if (x >= 654.0 && x <= 749.0) checkCell(654, 555);
        }
        if (x >= 60.0 && y >= 654.0 && x <= 852.0 && y <= 751.0) {
            if (x >= 159.0 && x <= 255.0) checkCell(159, 654);
            if (x >= 357.0 && x <= 453.0) checkCell(357, 654);
            if (x >= 555.0 && x <= 651.0) checkCell(555, 654);
            if (x >= 753.0 && x <= 849.0) checkCell(753, 654);
        }
        if (x >= 60.0 && y >= 753.0 && x <= 852.0 && y <= 850.0) {
            if (x >= 60.0 && x <= 155.0) checkCell(60, 753);
            if (x >= 258.0 && x <= 353.0) checkCell(258, 753);
            if (x >= 456.0 && x <= 551.0) checkCell(456, 753);
            if (x >= 654.0 && x <= 749.0) checkCell(654, 753);
        }
    }

    private void checkCell(int positionX, int positionY) {
        for (int i = 0; i < 12; i++) {  // Белые шашки
            int posX = ((Drawing) panel).getCheckers_w().get(i).getPosition_w().get(i).getPositionX();
            int posY = ((Drawing) panel).getCheckers_w().get(i).getPosition_w().get(i).getPositionY();
            if (positionX == posX && positionY == posY) {
                index = i;
                ArrayList<Int_Checker> int_rectangle = new ArrayList<>();
//                for (int j = 0; j < 2; j++) { //Цикл бл.. не трогать
                if (method_test(positionX + 99, positionY - 99)) {
                    if (method_test4(positionX + 99, positionY - 99)) {
                        int_rectangle.add(new Int_Checker(positionX + 99, positionY - 99));
                        bool6 = true;
                    }
                } else if (method_test(positionX + 99, positionY - 99, true)) {
                    if (method_test2(positionX + 198, positionY - 198))
                        if (method_test4(positionX + 198, positionY - 198)) {
                            int_rectangle.add(new Int_Checker(positionX + 198, positionY - 198));
                            bool6 = false;
                        }
                }

                if (method_test(positionX - 99, positionY - 99)) {
                    if (method_test3(positionX - 99, positionY - 99)) {
                        int_rectangle.add(new Int_Checker(positionX - 99, positionY - 99));
                        bool6 = true;
                    }
                } else if (method_test(positionX - 99, positionY - 99, true)) {
                    if (method_test2(positionX - 198, positionY - 198))
                        if (method_test3(positionX - 198, positionY - 198)) {
                            int_rectangle.add(new Int_Checker(positionX - 198, positionY - 198));
                            bool6 = false;
                        }
                }
//                }
                ((Drawing) panel).setInt_rectangle(int_rectangle);
                ((Drawing) panel).setBool5(true);
                panel.print(panel.getGraphics());
                bool1 = true;
                bool2 = false;
                bool3 = false;
                bool4 = false;
                return;
            } else {
                bool2 = true;
            }
        }
        for (int i = 0; i < 12; i++) {  // Чёрные шашки
            int posX = ((Drawing) panel).getCheckers_b().get(i).getPosition_b().get(i).getPositionX();
            int posY = ((Drawing) panel).getCheckers_b().get(i).getPosition_b().get(i).getPositionY();
            if (positionX == posX && positionY == posY) {
                index = i;
                ArrayList<Int_Checker> int_rectangle = new ArrayList<>();
//                for (int j = 0; j < 2; j++) { //Цикл бл.. не трогать
                if (method_test(positionX + 99, positionY + 99)) {
                    if (method_test4(positionX + 99, positionY + 99)) {
                        int_rectangle.add(new Int_Checker(positionX + 99, positionY + 99));
                        bool6 = true;
                    }

                } else if (method_test(positionX + 99, positionY + 99, false)) {
                    if (method_test2(positionX + 198, positionY + 198))
                        if (method_test4(positionX + 198, positionY + 198)) {
                            int_rectangle.add(new Int_Checker(positionX + 198, positionY + 198));
                            bool6 = false;
                        }
                }
                if (method_test(positionX - 99, positionY + 99)) {
                    if (method_test3(positionX - 99, positionY + 99)) {
                        int_rectangle.add(new Int_Checker(positionX - 99, positionY + 99));
                        bool6 = true;
                    }

                } else if (method_test(positionX - 99, positionY + 99, false)) {
                    if (method_test2(positionX - 198, positionY + 198))
                        if (method_test3(positionX - 198, positionY + 198)) {
                            int_rectangle.add(new Int_Checker(positionX - 198, positionY + 198));
                            bool6 = false;
                        }
                }
//                }
                ((Drawing) panel).setInt_rectangle(int_rectangle);
                ((Drawing) panel).setBool5(true);
                panel.print(panel.getGraphics());
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
                if (bool6) {
                    steps(positionX + 99, positionX - 99, positionY + 99, true, 99);
                } else {
                    steps(positionX + 198, positionX - 198, positionY + 198, true, 198);
                }
            }
        }
        if (bool4) {
            if (bool3) {
                if (bool6) {
                    steps(positionX + 99, positionX - 99, positionY - 99, false, 99);
                } else {
                    steps(positionX + 198, positionX - 198, positionY - 198, false, 198);
                }
            }
        }
    }

    private boolean method_test(int positionX, int positionY) {

        for (int i = 0; i < 12; i++) {
            int posX = ((Drawing) panel).getCheckers_w().get(i).getPosition_w().get(i).getPositionX();
            int posY = ((Drawing) panel).getCheckers_w().get(i).getPosition_w().get(i).getPositionY();
            if (positionX == posX && positionY == posY)
                return false;
        }
        for (int i = 0; i < 12; i++) {
            int posX = ((Drawing) panel).getCheckers_b().get(i).getPosition_b().get(i).getPositionX();
            int posY = ((Drawing) panel).getCheckers_b().get(i).getPosition_b().get(i).getPositionY();
            if (positionX == posX && positionY == posY)
                return false;
        }
        return true;
    }

    private boolean method_test(int positionX, int positionY, boolean boolb) {
        if (boolb) {
            for (int i = 0; i < 12; i++) {
                int posX = ((Drawing) panel).getCheckers_w().get(i).getPosition_w().get(i).getPositionX();
                int posY = ((Drawing) panel).getCheckers_w().get(i).getPosition_w().get(i).getPositionY();
                if (positionX == posX && positionY == posY)
                    return false;
            }
            for (int i = 0; i < 12; i++) {
                int posX = ((Drawing) panel).getCheckers_b().get(i).getPosition_b().get(i).getPositionX();
                int posY = ((Drawing) panel).getCheckers_b().get(i).getPosition_b().get(i).getPositionY();
                if (positionX == posX && positionY == posY)
                    return true;
            }

        } else {
            for (int i = 0; i < 12; i++) {
                int posX = ((Drawing) panel).getCheckers_w().get(i).getPosition_w().get(i).getPositionX();
                int posY = ((Drawing) panel).getCheckers_w().get(i).getPosition_w().get(i).getPositionY();
                if (positionX == posX && positionY == posY)
                    return true;
            }
            for (int i = 0; i < 12; i++) {
                int posX = ((Drawing) panel).getCheckers_b().get(i).getPosition_b().get(i).getPositionX();
                int posY = ((Drawing) panel).getCheckers_b().get(i).getPosition_b().get(i).getPositionY();
                if (positionX == posX && positionY == posY)
                    return false;
            }


        }
        return true;
    }

    private boolean method_test2(int positionX, int positionY) {

        for (int i = 0; i < 12; i++) {
            int posX = ((Drawing) panel).getCheckers_w().get(i).getPosition_w().get(i).getPositionX();
            int posY = ((Drawing) panel).getCheckers_w().get(i).getPosition_w().get(i).getPositionY();
            if (positionX == posX && positionY == posY)
                return false;
        }

        for (int i = 0; i < 12; i++) {
            int posX = ((Drawing) panel).getCheckers_b().get(i).getPosition_b().get(i).getPositionX();
            int posY = ((Drawing) panel).getCheckers_b().get(i).getPosition_b().get(i).getPositionY();
            if (positionX == posX && positionY == posY)
                return false;
        }
        return true;
    }

    private boolean method_test3(int positionX, int positionY) { // Проверка левой линии
        if (positionX >= 60 && positionY >= 60 && positionY < 852)
            return true;
        return false;
    }

    private boolean method_test4(int positionX, int positionY) { // Проверка правой линии
        if (positionX < 852 && positionY >= 60 && positionY < 852)
            return true;
        return false;
    }

    private void steps(int positionX_1, int positionX_2, int positionY, boolean bol, int inta) {
        if (bol) {
            int checkerX = ((Drawing) panel).getCheckers_w().get(index).getPosition_w().get(index).getPositionX();
            int checkerY = ((Drawing) panel).getCheckers_w().get(index).getPosition_w().get(index).getPositionY();
            if (positionX_1 == checkerX) {
                if (positionY == checkerY) {
                    ((Drawing) panel).getCheckers_w().get(index).getPosition_w().get(index).setPositionX(positionX_1 - inta);
                    ((Drawing) panel).getCheckers_w().get(index).getPosition_w().get(index).setPositionY(positionY - inta);
                    ((Drawing) panel).setBool5(false);
                    panel.print(panel.getGraphics());
                    bool1 = false;
                    bool2 = false;
                    bool3 = false;
                    bool4 = false;
                }
            } else if (positionX_2 == checkerX) {
                if (positionY == checkerY) {
                    ((Drawing) panel).getCheckers_w().get(index).getPosition_w().get(index).setPositionX(positionX_2 + inta);
                    ((Drawing) panel).getCheckers_w().get(index).getPosition_w().get(index).setPositionY(positionY - inta);
                    ((Drawing) panel).setBool5(false);
                    panel.print(panel.getGraphics());
                    bool1 = false;
                    bool2 = false;
                    bool3 = false;
                    bool4 = false;
                }
            }
        } else {
            int checkerX = ((Drawing) panel).getCheckers_b().get(index).getPosition_b().get(index).getPositionX();
            int checkerY = ((Drawing) panel).getCheckers_b().get(index).getPosition_b().get(index).getPositionY();
            if (positionX_1 == checkerX) {
                if (positionY == checkerY) {
                    ((Drawing) panel).getCheckers_b().get(index).getPosition_b().get(index).setPositionX(positionX_1 - inta);
                    ((Drawing) panel).getCheckers_b().get(index).getPosition_b().get(index).setPositionY(positionY + inta);
                    ((Drawing) panel).setBool5(false);
                    panel.print(panel.getGraphics());
                    bool1 = false;
                    bool2 = false;
                    bool3 = false;
                    bool4 = false;
                }
            } else if (positionX_2 == checkerX) {
                if (positionY == checkerY) {
                    ((Drawing) panel).getCheckers_b().get(index).getPosition_b().get(index).setPositionX(positionX_2 + inta);
                    ((Drawing) panel).getCheckers_b().get(index).getPosition_b().get(index).setPositionY(positionY + inta);
                    ((Drawing) panel).setBool5(false);
                    panel.print(panel.getGraphics());
                    bool1 = false;
                    bool2 = false;
                    bool3 = false;
                    bool4 = false;
                }
            }
        }
    }
}