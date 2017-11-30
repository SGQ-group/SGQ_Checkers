import javax.swing.*;
import java.util.ArrayList;

public class Checker {
    private ImageIcon icon;
    private ArrayList<Int_Checker> position_b = new ArrayList<>();
    private ArrayList<Int_Checker> position_w = new ArrayList<>();

    public Checker(int index) {
        icon = new ImageIcon(new Img().img2(index));
        init();
    }

    public ImageIcon getIcon() {
        return icon;
    }

    public ArrayList<Int_Checker> getPosition_b() {
        return position_b;
    }

    public ArrayList<Int_Checker> getPosition_w() {
        return position_w;
    }

    public void init() {
        position_b.add(new Int_Checker(156, 60));
        position_b.add(new Int_Checker(354, 60));
        position_b.add(new Int_Checker(552, 60));
        position_b.add(new Int_Checker(750, 60));
        position_b.add(new Int_Checker(56, 159));
        position_b.add(new Int_Checker(254, 159));
        position_b.add(new Int_Checker(452, 159));
        position_b.add(new Int_Checker(650, 159));
        position_b.add(new Int_Checker(156, 258));
        position_b.add(new Int_Checker(354, 258));
        position_b.add(new Int_Checker(552, 258));
        position_b.add(new Int_Checker(750, 258));

        position_w.add(new Int_Checker(650, 753));
        position_w.add(new Int_Checker(452, 753));
        position_w.add(new Int_Checker(254, 753));
        position_w.add(new Int_Checker(56, 753));
        position_w.add(new Int_Checker(750, 654));
        position_w.add(new Int_Checker(552, 654));
        position_w.add(new Int_Checker(354, 654));
        position_w.add(new Int_Checker(156, 654));
        position_w.add(new Int_Checker(650, 555));
        position_w.add(new Int_Checker(452, 555));
        position_w.add(new Int_Checker(254, 555));
        position_w.add(new Int_Checker(56, 555));
    }

}
