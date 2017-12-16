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
    private boolean bool16 = false; //Для шагов на следующую клетку направо
    private boolean bool6 = false; //Для шагов на следующую клетку направо
    private boolean bool17 = false; //Для шагов на следующую клетку направо наверх
    private boolean bool7 = false; //Для шагов на следующую клетку направо наверх
    private boolean bool18 = false; //Для шагов на следующую клетку налево
    private boolean bool8 = false; //Для шагов на следующую клетку налево
    private boolean bool19 = false; //Для шагов на следующую клетку налево наверх
    private boolean bool9 = false; //Для шагов на следующую клетку налево наверх
    private boolean bool10 = false; //Для шагов на следующую клетку налево наверх
    private boolean bool11 = false; //Для шагов на следующую клетку налево наверх

    private boolean boolGame = true;

    private int index;
    private int index2;
    private int index3;
    //Runnable
    public void run() {
        JFrame frame = new JFrame(); //Окно
        frame.setTitle("SGQ_Checkers"); //Заголовок
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Закрытие
        frame.setResizable(false); //Нельзя изменить размер окна
        panel = new Drawing(); //Рисовалка
        panel.setPreferredSize(new Dimension(900, 900)); //Окно, от и до
        panel.addMouseListener(this); //Обработчик мыши
        Container cp = frame.getContentPane(); //Настройки окна
        cp.setLayout(new BorderLayout()); //Для порядка компонентов (см ниже)
        cp.add(panel, BorderLayout.CENTER); //Установить рисование по всему окну (Центр)
        frame.pack(); // пакуем
        frame.setVisible(true);// показываем
    }

    /////////////
    // Обработчик мыши (Методы интерфейса)
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

    private void printMouseEvent(MouseEvent e) {   //Клик мышки
        switch (e.getButton()) {
            case MouseEvent.BUTTON1: {
                BoxTrigger(e.getX(), e.getY()); //Передаем координаты
                break;
            }
            default: {
                break;
            }
        }
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
        if (boolGame) { //Белые шашки
            for (int i = 0; i < 12; i++) {  //Белые
                int posX = ((Drawing) panel).getCheckers_w().get(i).getPosition_w().get(i).getPositionX(); //Проверяем по X
                int posY = ((Drawing) panel).getCheckers_w().get(i).getPosition_w().get(i).getPositionY(); //Проверяем по Y
                if (positionX == posX && positionY == posY) { //Проверяем совпадают ли координаты шашки с теми куда кликнули
                    index = i; //Забираем index шашки в глобальную переменную
                    ArrayList<Int_Checker> int_rectangle = new ArrayList<>(); //Коллекция для рисования красных rectangle
                    if (method_test(positionX + 99, positionY - 99, 0)) {  //Проверяем на свободность первой клетки
                        if (method_test4(positionX + 99, positionY - 99)) {  //Не выходим за рамки доски?
                            int_rectangle.add(new Int_Checker(positionX + 99, positionY - 99)); //Рисуем rectangle
                            bool6 = true;
                        }
                    } else if (method_test(positionX + 99, positionY - 99, true)) { //Если стоит черная шашка, то проверяем, можно ли ее рубать
                        if (method_test2(positionX + 198, positionY - 198))               //Если нет шашек на второй клетке, то рубаем шашку
                            if (method_test4(positionX + 198, positionY - 198)) {         //Не выходим за рамки доски?
                                int_rectangle.add(new Int_Checker(positionX + 198, positionY - 198)); //Рисуем rectangle
                                bool7 = true;
                            }
                    }

                    if (method_test(positionX - 99, positionY - 99, 1)) {          //Проверяем на свободность первой клетки
                        if (method_test3(positionX - 99, positionY - 99)) {     //Не выходим за рамки доски?
                            int_rectangle.add(new Int_Checker(positionX - 99, positionY - 99)); //Рисуем rectangle
                            bool8 = true;
                        }
                    } else if (method_test(positionX - 99, positionY - 99, true)) { //Если стоит черная шашка, то проверяем, можно ли ее рубать
                        if (method_test2(positionX - 198, positionY - 198))               //Если нет шашек на второй клетке, то рубаем шашку
                            if (method_test3(positionX - 198, positionY - 198)) {         //Не выходим за рамки доски?
                                int_rectangle.add(new Int_Checker(positionX - 198, positionY - 198)); //Рисуем rectangle
                                bool9 = true;
                            }
                    }
//                }
                    if (((Drawing) panel).getCheckers_w().get(i).getPosition_w().get(i).isKing()){ //Если дамка, то даем спосообность ходить и рубать назад
                        if (method_test(positionX + 99, positionY + 99, 0)) {      //Проверяем на свободность первой клетки
                            if (method_test4(positionX + 99, positionY + 99)) { //Не выходим за рамки доски?
                                int_rectangle.add(new Int_Checker(positionX + 99, positionY + 99)); //Рисуем rectangle
                                bool16 = true;
                            }

                        } else if (method_test(positionX + 99, positionY + 99, true)) { //Если стоит черная шашка, то проверяем, можно ли ее рубать
                            if (method_test2(positionX + 198, positionY + 198))                //Если нет шашек на второй клетке, то рубаем шашку
                                if (method_test4(positionX + 198, positionY + 198)) {          //Не выходим за рамки доски?
                                    int_rectangle.add(new Int_Checker(positionX + 198, positionY + 198)); //Рисуем rectangle
                                    bool17 = true;
                                }
                        }
                        if (method_test(positionX - 99, positionY + 99, 1)) {          //Проверяем на свободность первой клетки
                            if (method_test3(positionX - 99, positionY + 99)) {     //Не выходим за рамки доски?
                                int_rectangle.add(new Int_Checker(positionX - 99, positionY + 99)); //Рисуем rectangle
//                        bool11 = false;
                                bool18 = true;
                            }

                        } else if (method_test(positionX - 99, positionY + 99, true)) {  //Если стоит черная шашка, то проверяем, можно ли ее рубать
                            if (method_test2(positionX - 198, positionY + 198))                 //Если нет шашек на второй клетке, то рубаем шашку
                                if (method_test3(positionX - 198, positionY + 198)) {           //Не выходим за рамки доски?
                                    int_rectangle.add(new Int_Checker(positionX - 198, positionY + 198)); //Рисуем rectangle
                                    bool19 = true;
                                }
                        }
                    }
                    ((Drawing) panel).setInt_rectangle(int_rectangle); //Передаем коллекцию rectangle, для вырисовки дальнейшей
                    ((Drawing) panel).setBool5(true); //Ставим галочку на то, что нужно будет рисовать rectangle
                    panel.print(panel.getGraphics()); //Рисуем
                    bool1 = true;
                    bool2 = false;
                    bool3 = false;
                    bool4 = false;
                    return; //Выход из метода
                } else {
                    bool2 = true;
                }
            }
        } else { // Чёрные шашки
            for (int i = 0; i < 12; i++) {  //Черные
                int posX = ((Drawing) panel).getCheckers_b().get(i).getPosition_b().get(i).getPositionX(); //Проверяем по Х
                int posY = ((Drawing) panel).getCheckers_b().get(i).getPosition_b().get(i).getPositionY(); //Проверяем по Y
                if (positionX == posX && positionY == posY) {       //Если координаты шашки и координаты куда мы кликнули совпадают, то мы идём дальше
                    index = i;//Забираем index шашки в глобальную переменную
                    ArrayList<Int_Checker> int_rectangle = new ArrayList<>();//Коллекция для рисования красных rectangle
                    if (method_test(positionX + 99, positionY + 99, 0)) {      //Проверяем на свободность первой клетки
                        if (method_test4(positionX + 99, positionY + 99)) { //Не выходим за рамки доски?
                            int_rectangle.add(new Int_Checker(positionX + 99, positionY + 99)); //Рисуем rectangle
                            bool6 = true;
                        }

                    } else if (method_test(positionX + 99, positionY + 99, false)) { //Если стоит черная шашка, то проверяем, можно ли ее рубать
                        if (method_test2(positionX + 198, positionY + 198))                //Если нет шашек на второй клетке, то рубаем шашку
                            if (method_test4(positionX + 198, positionY + 198)) {           //Не выходим за рамки доски?
                                int_rectangle.add(new Int_Checker(positionX + 198, positionY + 198)); //Рисуем rectangle
                                bool7 = true;
                            }
                    }
                    if (method_test(positionX - 99, positionY + 99, 1)) {          //Проверяем на свободность первой клетки
                        if (method_test3(positionX - 99, positionY + 99)) {     //Не выходим за рамки доски?
                            int_rectangle.add(new Int_Checker(positionX - 99, positionY + 99)); //Рисуем rectangle
                            bool8 = true;
                        }

                    } else if (method_test(positionX - 99, positionY + 99, false)) {  //Если стоит черная шашка, то проверяем, можно ли ее рубать
                        if (method_test2(positionX - 198, positionY + 198))                 //Если нет шашек на второй клетке, то рубаем шашку
                            if (method_test3(positionX - 198, positionY + 198)) {           //Не выходим за рамки доски?
                                int_rectangle.add(new Int_Checker(positionX - 198, positionY + 198)); //Рисуем rectangle
                                bool9 = true;
                            }
                    }
                    if (((Drawing) panel).getCheckers_b().get(i).getPosition_b().get(i).isKing()){//Если дамка, то даем спосообность ходить и рубать назад
                        if (method_test(positionX + 99, positionY - 99, 0)) {  //Проверяем на свободность первой клетки
                            if (method_test4(positionX + 99, positionY - 99)) {  //Не выходим за рамки доски?
                                int_rectangle.add(new Int_Checker(positionX + 99, positionY - 99)); //Рисуем rectangle
                                bool16 = true;
                            }
                        } else if (method_test(positionX + 99, positionY - 99, false)) {//Если стоит черная шашка, то проверяем, можно ли ее рубать
                            if (method_test2(positionX + 198, positionY - 198))               //Если нет шашек на второй клетке, то рубаем шашку
                                if (method_test4(positionX + 198, positionY - 198)) {         //Не выходим за рамки доски?
                                    int_rectangle.add(new Int_Checker(positionX + 198, positionY - 198)); //Рисуем rectangle
                                    bool17 = true;
                                }
                        }

                        if (method_test(positionX - 99, positionY - 99, 1)) {          //Проверяем на свободность первой клетки
                            if (method_test3(positionX - 99, positionY - 99)) {     //Не выходим за рамки доски?
                                int_rectangle.add(new Int_Checker(positionX - 99, positionY - 99)); //Рисуем rectangle
                                bool18 = true;
                            }
                        } else if (method_test(positionX - 99, positionY - 99, false)) { //Если стоит черная шашка, то проверяем, можно ли ее рубать
                            if (method_test2(positionX - 198, positionY - 198))              //Если нет шашек на второй клетке, то рубаем шашку
                                if (method_test3(positionX - 198, positionY - 198)) {         //Не выходим за рамки доски?
                                    int_rectangle.add(new Int_Checker(positionX - 198, positionY - 198)); //Рисуем rectangle
                                    bool19 = true;
                                }
                        }
                    }
                    ((Drawing) panel).setInt_rectangle(int_rectangle);//Передаем коллекцию rectangle, для вырисовки дальнейшей
                    ((Drawing) panel).setBool5(true);//Ставим галочку на то, что нужно будет рисовать rectangle
                    panel.print(panel.getGraphics());//Рисуем
                    bool1 = false;
                    bool2 = false;
                    bool3 = true;
                    bool4 = false;
                    return;//Выход из метода
                } else {
                    bool4 = true;
                }
            }
        }

        //Если не кликали по шашке (Не запускали return для закрытия метода)

        if (bool2) {  //Проверяем клик на белой шашки
            if (bool1) { //Проверяем клик на пустую клетку для белых шашек
                if (bool6)
                    steps(positionX - 99, positionY + 99, true, 99, true, false); //Если bool6 = true, то мы передаём в метод Steps ход направо на 1 клетку для белых
                if (bool8)
                    steps(positionX + 99, positionY + 99, true, 99, false, false); //Если bool7 = true, то мы передаём в метод Steps ход налево на 1 клетку для белых
                if (bool7)
                    steps(positionX - 198, positionY + 198, true, 198, true, false); //Если bool8 = true, то мы передаём в метод Steps ход направо на 2 клетки для белых
                if (bool9)
                    steps(positionX + 198, positionY + 198, true, 198, false, false); //Если bool9 = true, то мы передаём в метод Steps ход налево на 2 клетки для белых

                if (((Drawing) panel).getCheckers_w().get(index).getPosition_w().get(index).isKing()){ //Если дамка, то даем спосообность ходить и рубать назад
                    if (bool16)
                        steps(positionX - 99, positionY - 99, true, 99, true, true); //Если bool6 = true, то мы передаём в метод Steps ход направо на 1 клетку для чёрных
                    if (bool18)
                        steps(positionX + 99, positionY - 99, true, 99, false, true); //Если bool7 = true, то мы передаём в метод Steps ход налево на 1 клетку для чёрных
                    if (bool17)
                        steps(positionX - 198, positionY - 198, true, 198, true, true); //Если bool8 = true, то мы передаём в метод Steps ход направо на 2 клетки для чёрных
                    if (bool19)
                        steps(positionX + 198, positionY - 198, true, 198, false, true); //Если bool9 = true, то мы передаём в метод Steps ход налево на 2 клетки для чёрных

                }
            }
        }
        if (bool4) {  //Проверяем клик на чёрой шашки
            if (bool3) { //Проверяем клик на пустую клетку для чёрных шашек
                if (bool6)
                    steps(positionX - 99, positionY - 99, false, 99, true, false); //Если bool6 = true, то мы передаём в метод Steps ход направо на 1 клетку для чёрных
                if (bool8)
                    steps(positionX + 99, positionY - 99, false, 99, false, false); //Если bool7 = true, то мы передаём в метод Steps ход налево на 1 клетку для чёрных
                if (bool7)
                    steps(positionX - 198, positionY - 198, false, 198, true, false); //Если bool8 = true, то мы передаём в метод Steps ход направо на 2 клетки для чёрных
                if (bool9)
                    steps(positionX + 198, positionY - 198, false, 198, false, false); //Если bool9 = true, то мы передаём в метод Steps ход налево на 2 клетки для чёрных

                if (((Drawing) panel).getCheckers_b().get(index).getPosition_b().get(index).isKing()){//Если дамка, то даем спосообность ходить и рубать назад
                    if (bool16)
                        steps(positionX - 99, positionY + 99, false, 99, true, true); //Если bool6 = true, то мы передаём в метод Steps ход направо на 1 клетку для белых
                    if (bool18)
                        steps(positionX + 99, positionY + 99, false, 99, false, true); //Если bool7 = true, то мы передаём в метод Steps ход налево на 1 клетку для белых
                    if (bool17)
                        steps(positionX - 198, positionY + 198, false, 198, true, true); //Если bool8 = true, то мы передаём в метод Steps ход направо на 1 клетку для белых
                    if (bool19)
                        steps(positionX + 198, positionY + 198, false, 198, false, true); //Если bool9 = true, то мы передаём в метод Steps ход налево на 2 клетки для белых

                }
            }
        }
    }

    private boolean method_test(int positionX, int positionY, int a) { //Проверяем на свободность первой клетки

        for (int i = 0; i < 12; i++) { //Перебираем все белые шашки
            int posX = ((Drawing) panel).getCheckers_w().get(i).getPosition_w().get(i).getPositionX(); //Проверяем координаты белых шашек по X
            int posY = ((Drawing) panel).getCheckers_w().get(i).getPosition_w().get(i).getPositionY(); //Проверяем координаты белых шашек по Y
            if (positionX == posX && positionY == posY) { //Если координаты какой-то белой шашки совпали с координатами клика
                if (a == 0) { //если 0
                    index2 = i;
                    bool10 = true;
                } else { //если 1
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
                if (a == 0) {//если 0
                    index2 = i;
                    bool10 = true;
                } else { //если 1
                    index3 = i;
                    bool11 = true;
                }
                return false; //Возвращаем false
            }
        }
        return true; //Возвращаем true
    }

    private boolean method_test(int positionX, int positionY, boolean boolb) {  //Если стоит черная шашка, то проверяем, можно ли ее рубать
        if (boolb) { //Белые
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

        } else { //Черные
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

    private boolean method_test2(int positionX, int positionY) { //Если нет шашек на второй клетке, то рубаем шашку

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

    private void steps(int positionX_1, int positionY, boolean bol, int inta, boolean bool, boolean test) {
        if (bol) { //Белые
            int checkerX = ((Drawing) panel).getCheckers_w().get(index).getPosition_w().get(index).getPositionX();
            int checkerY = ((Drawing) panel).getCheckers_w().get(index).getPosition_w().get(index).getPositionY();
            if (bool) { //Направо
                if (positionX_1 == checkerX)
                    if (positionY == checkerY) {
                    if (!test){
                        ((Drawing) panel).getCheckers_w().get(index).getPosition_w().get(index).setPositionX(positionX_1 + inta);
                        ((Drawing) panel).getCheckers_w().get(index).getPosition_w().get(index).setPositionY(positionY - inta);
                    } else {
                        ((Drawing) panel).getCheckers_w().get(index).getPosition_w().get(index).setPositionX(positionX_1 + inta);
                        ((Drawing) panel).getCheckers_w().get(index).getPosition_w().get(index).setPositionY(positionY + inta);
                    }

                        if (bool10) {//Если рубают, то убираем шашку
                            ((Drawing) panel).getCheckers_b().get(index2).getPosition_b().get(index2).setPositionX(2000);//Перемещаем шашку за окно
                            ((Drawing) panel).getCheckers_b().get(index2).getPosition_b().get(index2).setPositionY(2000);//Перемещаем шашку за окно
                            bool10 = false;
                        }
                        if (!((Drawing) panel).getCheckers_w().get(index).getPosition_w().get(index).isKing())//Если не дамка
                            if (((Drawing) panel).getCheckers_w().get(index).getPosition_w().get(index).getPositionY() == 60) //Клетка для того, чтобы стать дамкой
                                ((Drawing) panel).getCheckers_w().get(index).getPosition_w().get(index).setKing(true); //Делаем дамку
                        ((Drawing) panel).setBool5(false); //Рисуем только шашки
                        panel.print(panel.getGraphics()); //Рисуем

                        //Обнуляем
                        bool1 = false;
                        bool2 = false;
                        bool3 = false;
                        bool4 = false;
                        bool6 = false;
                        bool16 = false;
                        bool7 = false;
                        bool17 = false;
                        bool8 = false;
                        bool18 = false;
                        bool9 = false;
                        bool19 = false;
                        bool10 = false;
                        bool11 = false;
                        boolGame = false;
                    }
            } else { //Налево
                if (positionX_1 == checkerX)
                    if (positionY == checkerY) {
                        if (!test){
                            ((Drawing) panel).getCheckers_w().get(index).getPosition_w().get(index).setPositionX(positionX_1 - inta);
                            ((Drawing) panel).getCheckers_w().get(index).getPosition_w().get(index).setPositionY(positionY - inta);
                        } else {
                            ((Drawing) panel).getCheckers_w().get(index).getPosition_w().get(index).setPositionX(positionX_1 - inta);
                            ((Drawing) panel).getCheckers_w().get(index).getPosition_w().get(index).setPositionY(positionY + inta);
                        }

                        if (bool11) {//Если рубают, то убираем шашку
                            ((Drawing) panel).getCheckers_b().get(index3).getPosition_b().get(index3).setPositionX(2000);//Перемещаем шашку за окно
                            ((Drawing) panel).getCheckers_b().get(index3).getPosition_b().get(index3).setPositionY(2000);//Перемещаем шашку за окно
                            bool11 = false;
                        }
                        if (!((Drawing) panel).getCheckers_w().get(index).getPosition_w().get(index).isKing()) //Если не дамка
                            if (((Drawing) panel).getCheckers_w().get(index).getPosition_w().get(index).getPositionY() == 60)//Клетка для того, чтобы стать дамкой
                                ((Drawing) panel).getCheckers_w().get(index).getPosition_w().get(index).setKing(true);//Делаем дамку
                        ((Drawing) panel).setBool5(false); //Рисуем только шашки
                        panel.print(panel.getGraphics()); //Рисуем

                        //Обнуляем
                        bool1 = false;
                        bool2 = false;
                        bool3 = false;
                        bool4 = false;
                        bool6 = false;
                        bool16 = false;
                        bool7 = false;
                        bool17 = false;
                        bool8 = false;
                        bool18 = false;
                        bool9 = false;
                        bool19 = false;
                        bool10 = false;
                        bool11 = false;
                        boolGame = false;
                    }
            }
        } else { //Черные
            int checkerX = ((Drawing) panel).getCheckers_b().get(index).getPosition_b().get(index).getPositionX();
            int checkerY = ((Drawing) panel).getCheckers_b().get(index).getPosition_b().get(index).getPositionY();
            if (bool) {//Направо
                if (positionX_1 == checkerX)
                    if (positionY == checkerY) {
                        if (!test){
                            ((Drawing) panel).getCheckers_b().get(index).getPosition_b().get(index).setPositionX(positionX_1 + inta);
                            ((Drawing) panel).getCheckers_b().get(index).getPosition_b().get(index).setPositionY(positionY + inta);
                        } else {
                            ((Drawing) panel).getCheckers_b().get(index).getPosition_b().get(index).setPositionX(positionX_1 + inta);
                            ((Drawing) panel).getCheckers_b().get(index).getPosition_b().get(index).setPositionY(positionY - inta);
                        }

                        if (bool10) {//Если рубают, то убираем шашку
                            ((Drawing) panel).getCheckers_w().get(index2).getPosition_w().get(index2).setPositionX(2000); //Перемещаем шашку за окно
                            ((Drawing) panel).getCheckers_w().get(index2).getPosition_w().get(index2).setPositionY(2000);//Перемещаем шашку за окно
                            bool10 = false;

                        }
                        if (!((Drawing) panel).getCheckers_b().get(index).getPosition_b().get(index).isKing())//Если не дамка
                            if (((Drawing) panel).getCheckers_b().get(index).getPosition_b().get(index).getPositionY() == 753)//Клетка для того, чтобы стать дамкой
                            ((Drawing) panel).getCheckers_b().get(index).getPosition_b().get(index).setKing(true);//Делаем дамку

                        ((Drawing) panel).setBool5(false); //Рисуем только шашки
                        panel.print(panel.getGraphics()); //Рисуем

                        //Обнуляем
                        bool1 = false;
                        bool2 = false;
                        bool3 = false;
                        bool4 = false;
                        bool6 = false;
                        bool16 = false;
                        bool7 = false;
                        bool17 = false;
                        bool8 = false;
                        bool18 = false;
                        bool9 = false;
                        bool19 = false;
                        bool10 = false;
                        bool11 = false;
                        boolGame = true;
                    }
            } else {//Налево
                if (positionX_1 == checkerX)
                    if (positionY == checkerY) {
                        if (!test){
                            ((Drawing) panel).getCheckers_b().get(index).getPosition_b().get(index).setPositionX(positionX_1 - inta);
                            ((Drawing) panel).getCheckers_b().get(index).getPosition_b().get(index).setPositionY(positionY + inta);
                        } else {
                            ((Drawing) panel).getCheckers_b().get(index).getPosition_b().get(index).setPositionX(positionX_1 - inta);
                            ((Drawing) panel).getCheckers_b().get(index).getPosition_b().get(index).setPositionY(positionY - inta);
                        }

                        if (bool11) {//Если рубают, то убираем шашку
                            ((Drawing) panel).getCheckers_w().get(index3).getPosition_w().get(index3).setPositionX(2000);//Перемещаем шашку за окно
                            ((Drawing) panel).getCheckers_w().get(index3).getPosition_w().get(index3).setPositionY(2000);//Перемещаем шашку за окно
                            bool11 = false;
                        }
                        if (!((Drawing) panel).getCheckers_b().get(index).getPosition_b().get(index).isKing())//Если не дамка
                            if (((Drawing) panel).getCheckers_b().get(index).getPosition_b().get(index).getPositionY() == 753)//Клетка для того, чтобы стать дамкой
                                ((Drawing) panel).getCheckers_b().get(index).getPosition_b().get(index).setKing(true);//Делаем дамку
                        ((Drawing) panel).setBool5(false); //Рисуем только шашки
                        panel.print(panel.getGraphics()); //Рисуем

                        //Обнуляем
                        bool1 = false;
                        bool2 = false;
                        bool3 = false;
                        bool4 = false;
                        bool6 = false;
                        bool16 = false;
                        bool7 = false;
                        bool17 = false;
                        bool8 = false;
                        bool18 = false;
                        bool9 = false;
                        bool19 = false;
                        bool10 = false;
                        bool11 = false;
                        boolGame = true;
                    }
            }
        }
    }
}