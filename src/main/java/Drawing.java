import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Drawing extends JPanel {
    private ArrayList<Checker> checkers_b = new ArrayList<>();
    private ArrayList<Checker> checkers_w = new ArrayList<>();
    private ArrayList<Int_Checker> int_rectangle = new ArrayList<>();
    private ImageIcon rect;
    private ImageIcon board;
    private boolean graf = true;
    private boolean bool5 = false;

    public void setBool5(boolean bool5) {
        this.bool5 = bool5;
    }

    public Drawing() {
        rect = new ImageIcon(new Img().img3());
        board = new ImageIcon(new Img().img1());
    }

    public void paintComponent(Graphics g) {
        // Обновить шашку
        super.paintComponent(g);
        board.paintIcon(this, g, 2, 2);
        if (graf) {
            create(g);
        } else {

        }
    }

    public void print(Graphics g) {
        super.print(g);
        if (bool5) {
            for (int i = 0; i < 12; i++) {
                if (checkers_b.get(i).getPosition_b().get(i).isKing()) {
                    checkers_b.get(i).setIcon(new ImageIcon(new Img().img4(2)));
                    checkers_b.get(i).getIcon().paintIcon(this, g, checkers_b.get(i).getPosition_b().get(i).getPositionX(),
                            checkers_b.get(i).getPosition_b().get(i).getPositionY());
                    checkers_b.get(i).setIcon(new ImageIcon(new Img().img2(2)));
                } else {
                    checkers_b.get(i).getIcon().paintIcon(this, g, checkers_b.get(i).getPosition_b().get(i).getPositionX(),
                            checkers_b.get(i).getPosition_b().get(i).getPositionY());

                }

                if (checkers_w.get(i).getPosition_w().get(i).isKing()) {
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
        } else {
            for (int i = 0; i < 12; i++) {
                if (checkers_b.get(i).getPosition_b().get(i).isKing()) {
                    checkers_b.get(i).setIcon(new ImageIcon(new Img().img4(2)));
                    checkers_b.get(i).getIcon().paintIcon(this, g, checkers_b.get(i).getPosition_b().get(i).getPositionX(),
                            checkers_b.get(i).getPosition_b().get(i).getPositionY());
                    checkers_b.get(i).setIcon(new ImageIcon(new Img().img2(2)));
                } else {
                    checkers_b.get(i).getIcon().paintIcon(this, g, checkers_b.get(i).getPosition_b().get(i).getPositionX(),
                            checkers_b.get(i).getPosition_b().get(i).getPositionY());
                }

                if (checkers_w.get(i).getPosition_w().get(i).isKing()) {
                    checkers_w.get(i).setIcon(new ImageIcon(new Img().img4(1)));
                    checkers_w.get(i).getIcon().paintIcon(this, g, checkers_w.get(i).getPosition_w().get(i).getPositionX(),
                            checkers_w.get(i).getPosition_w().get(i).getPositionY());
                    checkers_w.get(i).setIcon(new ImageIcon(new Img().img2(1)));
                } else {
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
        return checkers_b;
    }

    public ArrayList<Checker> getCheckers_w() {
        return checkers_w;
    }

    public void create(Graphics g) {

        for (int i = 0; i < 12; i++) {
            checkers_b.add(new Checker(2));
            checkers_w.add(new Checker(1));

        }
        for (int i = 0; i < 12; i++) {
            checkers_b.get(i).getIcon().paintIcon(this, g, checkers_b.get(i).getPosition_b().get(i).getPositionX(),
                    checkers_b.get(i).getPosition_b().get(i).getPositionY());
            checkers_w.get(i).getIcon().paintIcon(this, g, checkers_w.get(i).getPosition_w().get(i).getPositionX(),
                    checkers_w.get(i).getPosition_w().get(i).getPositionY());
        }
    }

    public void setGraf(boolean graf) {
        this.graf = graf;
    }
}