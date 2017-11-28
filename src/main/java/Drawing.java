import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Drawing extends JPanel {
    private ArrayList<Checker> checkers_b = new ArrayList<>();
    private ArrayList<Checker> checkers_r = new ArrayList<>();
    private ImageIcon board;
    private boolean graf = true;

    public Drawing() {
        board = new ImageIcon(new Img().img1());
    }

    public void paintComponent(Graphics g) {
        // Обновить шашку
        super.paintComponent(g);
            board.paintIcon(this,g,2,2);
            if(graf){
                create(g);
            } else  {

            }
    }

    public void print(Graphics g) {
        super.print(g);
//        create(g);
        for (int i = 0; i < 12; i++) {
            checkers_b.get(i).getIcon().paintIcon(this,g,checkers_b.get(i).getPosition_b().get(i).getPositionX(),
                    checkers_b.get(i).getPosition_b().get(i).getPositionY());
            checkers_r.get(i).getIcon().paintIcon(this,g,checkers_r.get(i).getPosition_r().get(i).getPositionX(),
                    checkers_r.get(i).getPosition_r().get(i).getPositionY());
        }
    }

    public ArrayList<Checker> getCheckers_b() {
        return checkers_b;
    }

    public ArrayList<Checker> getCheckers_r() {
        return checkers_r;
    }

    public void create(Graphics g){

        for (int i = 0; i < 12; i++) {
            checkers_b.add(new Checker(1));
            checkers_r.add(new Checker(2));

        }
        for (int i = 0; i < 12; i++) {
            checkers_b.get(i).getIcon().paintIcon(this,g,checkers_b.get(i).getPosition_b().get(i).getPositionX(),
                    checkers_b.get(i).getPosition_b().get(i).getPositionY());
            checkers_r.get(i).getIcon().paintIcon(this,g,checkers_r.get(i).getPosition_r().get(i).getPositionX(),
                    checkers_r.get(i).getPosition_r().get(i).getPositionY());
        }
    }

    public void setGraf(boolean graf) {
        this.graf = graf;
    }
}