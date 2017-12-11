import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Game implements Runnable, MouseListener {
    private JPanel panel;
    private boolean bool1 = false; //Для проверки нажатия на пустую клетку для белых
    private boolean bool2 = false; //Для проверки нажатия на белую шашку
    private boolean bool3 = false; //Для проверки нажатия на пустую клетку для чёрных
    private boolean bool4 = false; //Для проверки нажатия на чёрную шашку
    private boolean bool6 = false; //Для шагов на следующую клетку направо
    private boolean bool7 = false; //Для шагов на следующую клетку направо наверх
    private boolean bool8 = false; //Для шагов на следующую клетку налево
    private boolean bool9 = false; //Для шагов на следующую клетку налево наверх
    private boolean bool10 = false; //Для шагов на следующую клетку налево наверх
    private boolean bool11 = false; //Для шагов на следующую клетку налево наверх

    private boolean boolGame = true;

    private int index;
    private int index2;
    private int index3;

    public void run() {   //Этот класс короче зачем-то нужен, я уже забыл. Просто не трогай его
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
    private void printMouseEvent(MouseEvent e) {   //Клики мышкой
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

    public void BoxTrigger(double x, double y) {    //Координаты чёрных клеток
        ((Drawing) panel).setGraf(false);
        if (x >= 60.0 && y >= 60.0 && x <= 852.0 && y <= 157.0) {   //8 линия
            if (x >= 159.0 && x <= 255.0) checkCell(159, 60);  //b8
            if (x >= 357.0 && x <= 453.0) checkCell(357, 60);  //d8
            if (x >= 555.0 && x <= 651.0) checkCell(555, 60);  //f8
            if (x >= 753.0 && x <= 849.0) checkCell(753, 60);  //h8
        }
        if (x >= 60.0 && y >= 159.0 && x <= 852.0 && y <= 260.0) {  //7 линия
            if (x >= 60.0 && x <= 155.0) checkCell(60, 159);   //a7
            if (x >= 258.0 && x <= 353.0) checkCell(258, 159); //c7
            if (x >= 456.0 && x <= 551.0) checkCell(456, 159); //e7
            if (x >= 654.0 && x <= 749.0) checkCell(654, 159); //g7
        }
        if (x >= 60.0 && y >= 258.0 && x <= 852.0 && y <= 355.0) {  //6 линия
            if (x >= 159.0 && x <= 255.0) checkCell(159, 258); //b6
            if (x >= 357.0 && x <= 453.0) checkCell(357, 258); //d6
            if (x >= 555.0 && x <= 651.0) checkCell(555, 258); //f6
            if (x >= 753.0 && x <= 849.0) checkCell(753, 258); //h6
        }
        if (x >= 60.0 && y >= 357.0 && x <= 852.0 && y <= 454.0) {  //5 линия
            if (x >= 60.0 && x <= 155.0) checkCell(60, 357);   //a5
            if (x >= 258.0 && x <= 353.0) checkCell(258, 357); //c5
            if (x >= 456.0 && x <= 551.0) checkCell(456, 357); //e5
            if (x >= 654.0 && x <= 749.0) checkCell(654, 357); //g5
        }
        if (x >= 60.0 && y >= 456.0 && x <= 852.0 && y <= 553.0) {  //4 линия
            if (x >= 159.0 && x <= 255.0) checkCell(159, 456); //b4
            if (x >= 357.0 && x <= 453.0) checkCell(357, 456); //d4
            if (x >= 555.0 && x <= 651.0) checkCell(555, 456); //f4
            if (x >= 753.0 && x <= 849.0) checkCell(753, 456); //h4
        }
        if (x >= 60.0 && y >= 555.0 && x <= 852.0 && y <= 652.0) {  //3 линия
            if (x >= 60.0 && x <= 155.0) checkCell(60, 555);   //a3
            if (x >= 258.0 && x <= 353.0) checkCell(258, 555); //c3
            if (x >= 456.0 && x <= 551.0) checkCell(456, 555); //e3
            if (x >= 654.0 && x <= 749.0) checkCell(654, 555); //g3
        }
        if (x >= 60.0 && y >= 654.0 && x <= 852.0 && y <= 751.0) {  //2 линия
            if (x >= 159.0 && x <= 255.0) checkCell(159, 654); //b2
            if (x >= 357.0 && x <= 453.0) checkCell(357, 654); //d2
            if (x >= 555.0 && x <= 651.0) checkCell(555, 654); //f2
            if (x >= 753.0 && x <= 849.0) checkCell(753, 654); //h2
        }
        if (x >= 60.0 && y >= 753.0 && x <= 852.0 && y <= 850.0) {  //1 линия
            if (x >= 60.0 && x <= 155.0) checkCell(60, 753);   //a1
            if (x >= 258.0 && x <= 353.0) checkCell(258, 753); //c1
            if (x >= 456.0 && x <= 551.0) checkCell(456, 753); //e1
            if (x >= 654.0 && x <= 749.0) checkCell(654, 753); //g1
        }
    }

    private void checkCell(int positionX, int positionY) {  //Для проверки чёрных клеток
        if (boolGame) {
            for (int i = 0; i < 12; i++) {  // Белые шашки
                int posX = ((Drawing) panel).getCheckers_w().get(i).getPosition_w().get(i).getPositionX(); //Проверяем по X
                int posY = ((Drawing) panel).getCheckers_w().get(i).getPosition_w().get(i).getPositionY(); //Проверяем по Y
                if (positionX == posX && positionY == posY) { //Проверяем совпадают ли координаты шашки с теми куда кликнули
                    index = i;
                    ArrayList<Int_Checker> int_rectangle = new ArrayList<>();
//                for (int j = 0; j < 2; j++) { //Цикл бл.. не трогать
                    if (method_test(positionX + 99, positionY - 99, 0)) {  //Проверяем стоит ли шашка на клетке справа. Идём дальше если не стоит
                        if (method_test4(positionX + 99, positionY - 99)) {  //Проверяем занята ли клетка справа
                            int_rectangle.add(new Int_Checker(positionX + 99, positionY - 99)); //Рисуем квадратик
//                        bool10 = false;
                            bool6 = true;
                        }
                    } else if (method_test(positionX + 99, positionY - 99, true)) { //Проверем стоит ли шашка на клетке справа. Если стоит, то идём дальше
                        if (method_test2(positionX + 198, positionY - 198))               //Проверяем занята ли клетка справа через одну
                            if (method_test4(positionX + 198, positionY - 198)) {         //Проверяем свободна ли клетка справа через одну???
                                int_rectangle.add(new Int_Checker(positionX + 198, positionY - 198)); //Рисуем квадратик
//                            bool10 = false;
                                bool7 = true;
                            }
                    }

                    if (method_test(positionX - 99, positionY - 99, 1)) {          //Проверяем стоит ли шашка на клетке слева. Идём дальше, если не стоит
                        if (method_test3(positionX - 99, positionY - 99)) {     //Проверяем занята ли клетка слева???
                            int_rectangle.add(new Int_Checker(positionX - 99, positionY - 99)); //Рисуем квадратик
//                        bool11 = false;
                            bool8 = true;
                        }
                    } else if (method_test(positionX - 99, positionY - 99, true)) { //Проверяем стоит ли шашка на клетке слева. Если нет, то идём дальше
                        if (method_test2(positionX - 198, positionY - 198))               //Проверяем стоит ли шашка на клетке слева через одну. Если нет, то идём дальше
                            if (method_test3(positionX - 198, positionY - 198)) {         //Проверяем занята ли клетка сверху слева???
                                int_rectangle.add(new Int_Checker(positionX - 198, positionY - 198)); //Рисуем квадратик
//                            bool10 = false;
                                bool9 = true;
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
        } else {
            for (int i = 0; i < 12; i++) {  // Чёрные шашки
                int posX = ((Drawing) panel).getCheckers_b().get(i).getPosition_b().get(i).getPositionX(); //Проверяем по Х
                int posY = ((Drawing) panel).getCheckers_b().get(i).getPosition_b().get(i).getPositionY(); //Проверяем по Y
                if (positionX == posX && positionY == posY) {       //Если координаты шашки и координаты куда мы кликнули совпадают, то мы идём дальше
                    index = i;
                    ArrayList<Int_Checker> int_rectangle = new ArrayList<>();
//                for (int j = 0; j < 2; j++) { //Цикл бл.. не трогать
                    if (method_test(positionX + 99, positionY + 99, 0)) {      //Проверяем стоит ли шашка на клетке справа. Идём дальше если не стоит
                        if (method_test4(positionX + 99, positionY + 99)) { //Проверяем занята ли клетка справа???
                            int_rectangle.add(new Int_Checker(positionX + 99, positionY + 99)); //Рисуем квадратик
//                        bool10 = false;
                            bool6 = true;
                        }

                    } else if (method_test(positionX + 99, positionY + 99, false)) { //Проверяем стоит ли шашка на клетке справа. Идём дальше если не стоит
                        if (method_test2(positionX + 198, positionY + 198))                //Проверяем стоит ли шашка на клетке справа сверху. Идём дальше если не стоит
                            if (method_test4(positionX + 198, positionY + 198)) {          //Проверяем стоит ли шашка на клетке справа сверху. Идём дальше если не стоит???
                                int_rectangle.add(new Int_Checker(positionX + 198, positionY + 198)); //Рисуем квадратик
                                bool7 = true;
                            }
                    }
                    if (method_test(positionX - 99, positionY + 99, 1)) {          //Проверяем стоит ли шашка на клетке слева. Идём дальше если не стоит
                        if (method_test3(positionX - 99, positionY + 99)) {     //Проверяем стоит ли шашка на клетке слева. Идём дальше если не стоит???
                            int_rectangle.add(new Int_Checker(positionX - 99, positionY + 99)); //Рисуем квадратик
//                        bool11 = false;
                            bool8 = true;
                        }

                    } else if (method_test(positionX - 99, positionY + 99, false)) {  //Проверяем стоит ли шашка на клетке слева. Идём дальше если не стоит
                        if (method_test2(positionX - 198, positionY + 198))                 //Проверяем стоит ли шашка на клетке слева сверху. Идём дальше если не стоит
                            if (method_test3(positionX - 198, positionY + 198)) {           //Проверяем стоит ли шашка на клетке слева сверху. Идём дальше если не стоит???
                                int_rectangle.add(new Int_Checker(positionX - 198, positionY + 198)); //Рисуем квадратик
                                bool9 = true;
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
        }
        if (bool2) {  //Проверяем клик на белую шашку
            if (bool1) { //Проверяем клик на пустую клетку для белых
                if (bool6)
                    steps(positionX - 99, positionY + 99, true, 99, true); //Если bool6 = true, то мы передаём в метод Steps ход направо на 1 клетку для белых
                if (bool8)
                    steps(positionX + 99, positionY + 99, true, 99, false); //Если bool7 = true, то мы передаём в метод Steps ход налево на 1 клетку для белых
                if (bool7)
                    steps(positionX - 198, positionY + 198, true, 198, true); //Если bool8 = true, то мы передаём в метод Steps ход направо на 1 клетку для белых
                if (bool9)
                    steps(positionX + 198, positionY + 198, true, 198, false); //Если bool9 = true, то мы передаём в метод Steps ход налево на 2 клетки для белых


//                if (bool6) {
//                    steps(positionX + 99, positionX - 99, positionY + 99, true, 99);
//                } else if (bool7) {
//                    steps(positionX + 198, positionX - 198, positionY + 198, true, 198);
//                }
            }
        }
        if (bool4) {  //Проверяем клик на чёрную шашку
            if (bool3) { //Проверяем клик на пустую клетку для чёрных
                if (bool6)
                    steps(positionX - 99, positionY - 99, false, 99, true); //Если bool6 = true, то мы передаём в метод Steps ход направо на 1 клетку для чёрных
                if (bool8)
                    steps(positionX + 99, positionY - 99, false, 99, false); //Если bool7 = true, то мы передаём в метод Steps ход налево на 1 клетку для чёрных
                if (bool7)
                    steps(positionX - 198, positionY - 198, false, 198, true); //Если bool8 = true, то мы передаём в метод Steps ход направо на 2 клетки для чёрных
                if (bool9)
                    steps(positionX + 198, positionY - 198, false, 198, false); //Если bool9 = true, то мы передаём в метод Steps ход налево на 2 клетки для чёрных
//                if (bool6) {
//                    steps(positionX + 99, positionX - 99, positionY - 99, false, 99);
//                } else if (bool7) {
//                    steps(positionX + 198, positionX - 198, positionY - 198, false, 198);
//                }
            }
        }
    }

    private boolean method_test(int positionX, int positionY, int a) { //Метод для проверки стоят ли шашки на клетке куда мы кликнули

        for (int i = 0; i < 12; i++) { //Перебираем все белые шашки
            int posX = ((Drawing) panel).getCheckers_w().get(i).getPosition_w().get(i).getPositionX(); //Проверяем координаты белых шашек по X
            int posY = ((Drawing) panel).getCheckers_w().get(i).getPosition_w().get(i).getPositionY(); //Проверяем координаты белых шашек по Y
            if (positionX == posX && positionY == posY) { //Если координаты какой-то белой шашки совпали с координатами клика
                if (a == 0) {
                    index2 = i;
                    bool10 = true;
                } else {
                    index3 = i;
                    bool11 = true;
                }
                return false; //Возвращаем false
            }
        }
        for (int i = 0; i < 12; i++) { //Перебираем все чёрные шашки
            int posX = ((Drawing) panel).getCheckers_b().get(i).getPosition_b().get(i).getPositionX(); //Проверяем координаты чёрных шашек по X
            int posY = ((Drawing) panel).getCheckers_b().get(i).getPosition_b().get(i).getPositionY(); //Проверяе координаты чёрных шашек по Y
            if (positionX == posX && positionY == posY) { //Если координаты какой-то чёрной шашки совпали с координатами клика
                if (a == 0) {
                    index2 = i;
                    bool10 = true;
                } else {
                    index3 = i;
                    bool11 = true;
                }
                return false; //Возвращаем false
            }
        }
        return true;
    }

    private boolean method_test(int positionX, int positionY, boolean boolb) {  //Я пока не понял зачем нам этот метод :)
        if (boolb) {
            for (int i = 0; i < 12; i++) { //Перебираем все белые шашки
                int posX = ((Drawing) panel).getCheckers_w().get(i).getPosition_w().get(i).getPositionX(); //Проверяем координаты белых шашек по Х
                int posY = ((Drawing) panel).getCheckers_w().get(i).getPosition_w().get(i).getPositionY(); //Проверяем координаты белых шашек по Y
                if (positionX == posX && positionY == posY) //Если координаты какой-то шашки и координаты клика совпали
                    return false; //Возвращаем false
            }
            for (int i = 0; i < 12; i++) { //Перебираем все чёрные шашки
                int posX = ((Drawing) panel).getCheckers_b().get(i).getPosition_b().get(i).getPositionX(); //Проверяем координаты черных шашек по Х
                int posY = ((Drawing) panel).getCheckers_b().get(i).getPosition_b().get(i).getPositionY(); //Проверяем координаты чёрных шашек по Y
                if (positionX == posX && positionY == posY) //Если координаты какой-то шашки совпали с координатами клика
                    return true; //Возвращаем true
            }

        } else {
            for (int i = 0; i < 12; i++) { //Перебираем белые шашки
                int posX = ((Drawing) panel).getCheckers_w().get(i).getPosition_w().get(i).getPositionX(); //Проверяем координаты белых шашек по Х
                int posY = ((Drawing) panel).getCheckers_w().get(i).getPosition_w().get(i).getPositionY(); //Проверяем координаты белых шашек по Y
                if (positionX == posX && positionY == posY) ////Если координаты какой-то шашки совпали с координатами клика
                    return true; //Возвращаем true
            }
            for (int i = 0; i < 12; i++) { //Перебираем чёрные шашки
                int posX = ((Drawing) panel).getCheckers_b().get(i).getPosition_b().get(i).getPositionX(); //Проверяем координаты чёрных шашек по Х
                int posY = ((Drawing) panel).getCheckers_b().get(i).getPosition_b().get(i).getPositionY(); //Проверяем координаты чёрных шашек по Y
                if (positionX == posX && positionY == posY) ////Если координаты какой-то шашки совпали с координатами клика
                    return false; //Возвращаем false
            }


        }
        return true; //Проверяем true
    }

    private boolean method_test2(int positionX, int positionY) {  //Проверка на наличие шашки

        for (int i = 0; i < 12; i++) {  //Перебираем белые шашки
            int posX = ((Drawing) panel).getCheckers_w().get(i).getPosition_w().get(i).getPositionX(); //Проверяем координаты белых шашек по Х
            int posY = ((Drawing) panel).getCheckers_w().get(i).getPosition_w().get(i).getPositionY(); //Проверяем координаты белых шашек по Y
            if (positionX == posX && positionY == posY) ////Если координаты какой-то шашки совпали с координатами клика
                return false; //Возвращаем false
        }

        for (int i = 0; i < 12; i++) { //Перебираем чёрные шашки
            int posX = ((Drawing) panel).getCheckers_b().get(i).getPosition_b().get(i).getPositionX(); //Проверяем кординаты чёрных шашек по Х
            int posY = ((Drawing) panel).getCheckers_b().get(i).getPosition_b().get(i).getPositionY(); //Проверяем координаты чёрных шашек по Y
            if (positionX == posX && positionY == posY) ////Если координаты какой-то шашки совпали с координатами клика
                return false; //Возвращаем false
        }
        return true; //Возвращаем true
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

    private void steps(int positionX_1, int positionY, boolean bol, int inta, boolean bool) {
        if (bol) {
            int checkerX = ((Drawing) panel).getCheckers_w().get(index).getPosition_w().get(index).getPositionX();
            int checkerY = ((Drawing) panel).getCheckers_w().get(index).getPosition_w().get(index).getPositionY();
            if (bool) {
                if (positionX_1 == checkerX)
                    if (positionY == checkerY) {
                        ((Drawing) panel).getCheckers_w().get(index).getPosition_w().get(index).setPositionX(positionX_1 + inta);
                        ((Drawing) panel).getCheckers_w().get(index).getPosition_w().get(index).setPositionY(positionY - inta);
                        if (bool10) {
                            ((Drawing) panel).getCheckers_b().get(index2).getPosition_b().get(index2).setPositionX(2000);
                            ((Drawing) panel).getCheckers_b().get(index2).getPosition_b().get(index2).setPositionY(2000);
                            bool10 = false;
                        }
                        if (!((Drawing) panel).getCheckers_w().get(index).getPosition_w().get(index).isKing())
                            if (((Drawing) panel).getCheckers_w().get(index).getPosition_w().get(index).getPositionY() == 60)
                                ((Drawing) panel).getCheckers_w().get(index).getPosition_w().get(index).setKing(true);
                        ((Drawing) panel).setBool5(false);
                        panel.print(panel.getGraphics());
                        bool1 = false;
                        bool2 = false;
                        bool3 = false;
                        bool4 = false;
                        bool6 = false;
                        bool7 = false;
                        bool8 = false;
                        bool9 = false;
                        bool10 = false;
                        bool11 = false;
                        boolGame = false;
                    }
            } else {
                if (positionX_1 == checkerX)
                    if (positionY == checkerY) {
                        ((Drawing) panel).getCheckers_w().get(index).getPosition_w().get(index).setPositionX(positionX_1 - inta);
                        ((Drawing) panel).getCheckers_w().get(index).getPosition_w().get(index).setPositionY(positionY - inta);
                        if (bool11) {
                            ((Drawing) panel).getCheckers_b().get(index3).getPosition_b().get(index3).setPositionX(2000);
                            ((Drawing) panel).getCheckers_b().get(index3).getPosition_b().get(index3).setPositionY(2000);
                            bool11 = false;
                        }
                        if (!((Drawing) panel).getCheckers_w().get(index).getPosition_w().get(index).isKing())
                            if (((Drawing) panel).getCheckers_w().get(index).getPosition_w().get(index).getPositionY() == 60)
                                ((Drawing) panel).getCheckers_w().get(index).getPosition_w().get(index).setKing(true);
                        ((Drawing) panel).setBool5(false);
                        panel.print(panel.getGraphics());
                        bool1 = false;
                        bool2 = false;
                        bool3 = false;
                        bool4 = false;
                        bool6 = false;
                        bool7 = false;
                        bool8 = false;
                        bool9 = false;
                        bool10 = false;
                        bool11 = false;
                        boolGame = false;
                    }
            }
        } else {
            int checkerX = ((Drawing) panel).getCheckers_b().get(index).getPosition_b().get(index).getPositionX();
            int checkerY = ((Drawing) panel).getCheckers_b().get(index).getPosition_b().get(index).getPositionY();
            if (bool) {
                if (positionX_1 == checkerX)
                    if (positionY == checkerY) {
                        ((Drawing) panel).getCheckers_b().get(index).getPosition_b().get(index).setPositionX(positionX_1 + inta);
                        ((Drawing) panel).getCheckers_b().get(index).getPosition_b().get(index).setPositionY(positionY + inta);
                        if (bool10) {
                            ((Drawing) panel).getCheckers_w().get(index2).getPosition_w().get(index2).setPositionX(2000);
                            ((Drawing) panel).getCheckers_w().get(index2).getPosition_w().get(index2).setPositionY(2000);
                            bool10 = false;

                        }
                        if (!((Drawing) panel).getCheckers_b().get(index).getPosition_b().get(index).isKing())
                            if (((Drawing) panel).getCheckers_b().get(index).getPosition_b().get(index).getPositionY() == 753)
                            ((Drawing) panel).getCheckers_b().get(index).getPosition_b().get(index).setKing(true);

                        ((Drawing) panel).setBool5(false);
                        panel.print(panel.getGraphics());
                        bool1 = false;
                        bool2 = false;
                        bool3 = false;
                        bool4 = false;
                        bool6 = false;
                        bool7 = false;
                        bool8 = false;
                        bool9 = false;
                        bool10 = false;
                        bool11 = false;
                        boolGame = true;
                    }
            } else {
                if (positionX_1 == checkerX)
                    if (positionY == checkerY) {
                        ((Drawing) panel).getCheckers_b().get(index).getPosition_b().get(index).setPositionX(positionX_1 - inta);
                        ((Drawing) panel).getCheckers_b().get(index).getPosition_b().get(index).setPositionY(positionY + inta);
                        if (bool11) {
                            ((Drawing) panel).getCheckers_w().get(index3).getPosition_w().get(index3).setPositionX(2000);
                            ((Drawing) panel).getCheckers_w().get(index3).getPosition_w().get(index3).setPositionY(2000);
                            bool11 = false;
                        }
                        if (!((Drawing) panel).getCheckers_b().get(index).getPosition_b().get(index).isKing())
                            if (((Drawing) panel).getCheckers_b().get(index).getPosition_b().get(index).getPositionY() == 753)
                                ((Drawing) panel).getCheckers_b().get(index).getPosition_b().get(index).setKing(true);
                        ((Drawing) panel).setBool5(false);
                        panel.print(panel.getGraphics());
                        bool1 = false;
                        bool2 = false;
                        bool3 = false;
                        bool4 = false;
                        bool6 = false;
                        bool7 = false;
                        bool8 = false;
                        bool9 = false;
                        bool10 = false;
                        bool11 = false;
                        boolGame = true;
                    }
            }
        }
    }
}