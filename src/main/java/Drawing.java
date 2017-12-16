import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Drawing extends JPanel {
    private ArrayList<Checker> checkers_b = new ArrayList<>(); //Черные шашки
    private ArrayList<Checker> checkers_w = new ArrayList<>(); //Белые шашки
    private ArrayList<Int_Checker> int_rectangle = new ArrayList<>(); //Rectangle
    private ImageIcon rect;
    private ImageIcon board;
    private boolean graf = true;
    private boolean bool5 = false;

    public void setBool5(boolean bool5) {
        this.bool5 = bool5; //изменение вырисовки шашек
    }

    public Drawing() { //Конструктор
        rect = new ImageIcon(new Img().img3()); //Получаем Rectangle
        board = new ImageIcon(new Img().img1()); //Получаем доску
    }

    public void paintComponent(Graphics g) { //Рисуем
        super.paintComponent(g); //Конструктор базового класса
        board.paintIcon(this, g, 2, 2); //Рисуем доску
        if (graf) {
            create(g); // создать шашки и нарисовать на доске
        }
    }

    public void print(Graphics g) {//Рисуем
        super.print(g);
        if (bool5) { //Рисуем с Rectangle
            for (int i = 0; i < 12; i++) {
                if (checkers_b.get(i).getPosition_b().get(i).isKing()) { //Если дамка
                    checkers_b.get(i).setIcon(new ImageIcon(new Img().img4(2)));
                    checkers_b.get(i).getIcon().paintIcon(this, g, checkers_b.get(i).getPosition_b().get(i).getPositionX(),
                            checkers_b.get(i).getPosition_b().get(i).getPositionY());
                    checkers_b.get(i).setIcon(new ImageIcon(new Img().img2(2)));
                } else {//Если не дамка
                    checkers_b.get(i).getIcon().paintIcon(this, g, checkers_b.get(i).getPosition_b().get(i).getPositionX(),
                            checkers_b.get(i).getPosition_b().get(i).getPositionY());

                }

                if (checkers_w.get(i).getPosition_w().get(i).isKing()) {//Если дамка
                    checkers_w.get(i).setIcon(new ImageIcon(new Img().img4(1)));
                    checkers_w.get(i).getIcon().paintIcon(this, g, checkers_w.get(i).getPosition_w().get(i).getPositionX(),
                            checkers_w.get(i).getPosition_w().get(i).getPositionY());
                    checkers_w.get(i).setIcon(new ImageIcon(new Img().img2(1)));
                } else {
                    checkers_w.get(i).getIcon().paintIcon(this, g, checkers_w.get(i).getPosition_w().get(i).getPositionX(),
                            checkers_w.get(i).getPosition_w().get(i).getPositionY());
                }

            }
            for (Int_Checker anInt_rectangle : int_rectangle) {
                rect.paintIcon(this, g, anInt_rectangle.getPositionX(), anInt_rectangle.getPositionY());
            }
        } else {//Рисуем без Rectangle
            for (int i = 0; i < 12; i++) {
                if (checkers_b.get(i).getPosition_b().get(i).isKing()) {//Если дамка
                    checkers_b.get(i).setIcon(new ImageIcon(new Img().img4(2)));
                    checkers_b.get(i).getIcon().paintIcon(this, g, checkers_b.get(i).getPosition_b().get(i).getPositionX(),
                            checkers_b.get(i).getPosition_b().get(i).getPositionY());
                    checkers_b.get(i).setIcon(new ImageIcon(new Img().img2(2)));
                } else {//Если не дамка
                    checkers_b.get(i).getIcon().paintIcon(this, g, checkers_b.get(i).getPosition_b().get(i).getPositionX(),
                            checkers_b.get(i).getPosition_b().get(i).getPositionY());
                }

                if (checkers_w.get(i).getPosition_w().get(i).isKing()) {//Если дамка
                    checkers_w.get(i).setIcon(new ImageIcon(new Img().img4(1)));
                    checkers_w.get(i).getIcon().paintIcon(this, g, checkers_w.get(i).getPosition_w().get(i).getPositionX(),
                            checkers_w.get(i).getPosition_w().get(i).getPositionY());
                    checkers_w.get(i).setIcon(new ImageIcon(new Img().img2(1)));
                } else {//Если не дамка
                    checkers_w.get(i).getIcon().paintIcon(this, g, checkers_w.get(i).getPosition_w().get(i).getPositionX(),
                            checkers_w.get(i).getPosition_w().get(i).getPositionY());
                }
            }
        }
    }

    public void setInt_rectangle(ArrayList<Int_Checker> int_rectangle) {
        this.int_rectangle = int_rectangle;
    }

    public ArrayList<Checker> getCheckers_b() {
        return checkers_b; //Отдаем черные шашки (коллекцию)
    }

    public ArrayList<Checker> getCheckers_w() {
        return checkers_w;//Отдаем белые шашки (коллекцию)
    }

    public void create(Graphics g) { //Создаем шашки и рисуем

        for (int i = 0; i < 12; i++) { //Создаем
            checkers_b.add(new Checker(2));
            checkers_w.add(new Checker(1));

        }
        for (int i = 0; i < 12; i++) { //Рисуем
            checkers_b.get(i).getIcon().paintIcon(this, g, checkers_b.get(i).getPosition_b().get(i).getPositionX(),
                    checkers_b.get(i).getPosition_b().get(i).getPositionY());
            checkers_w.get(i).getIcon().paintIcon(this, g, checkers_w.get(i).getPosition_w().get(i).getPositionX(),
                    checkers_w.get(i).getPosition_w().get(i).getPositionY());
        }
    }

    public void setGraf(boolean graf) {
        this.graf = graf; //Для создания шашек (один раз применяется)
    }
}