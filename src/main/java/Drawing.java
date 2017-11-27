import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Drawing extends JPanel {
    private ArrayList<Checker> checkers_b = new ArrayList<>();
    private ArrayList<Checker> checkers_r = new ArrayList<>();
    private ImageIcon board;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        board = new ImageIcon(new Img().img1());
        board.paintIcon(this,g,2,2);

        create();

        for (int i = 0; i < 12; i++) {
            checkers_b.get(i).getIcon().paintIcon(this,g,checkers_b.get(i).getPosition_b().get(i).getPositionX(),
                    checkers_b.get(i).getPosition_b().get(i).getPositionY());
            checkers_r.get(i).getIcon().paintIcon(this,g,checkers_r.get(i).getPosition_r().get(i).getPositionX(),
                    checkers_r.get(i).getPosition_r().get(i).getPositionY());
        }
    }

    public void create(){
        for (int i = 0; i < 12; i++) {
            checkers_b.add(new Checker(1));
            checkers_r.add(new Checker(2));
        }

    }
}