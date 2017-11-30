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

    public void init(){
        position_b.add(new Int_Checker(159,60));
        position_b.add(new Int_Checker(357,60));
        position_b.add(new Int_Checker(555,60));
        position_b.add(new Int_Checker(753,60));
        position_b.add(new Int_Checker(60,159));
        position_b.add(new Int_Checker(258,159));
        position_b.add(new Int_Checker(456,159));
        position_b.add(new Int_Checker(654,159));
        position_b.add(new Int_Checker(159,258));
        position_b.add(new Int_Checker(357,258));
        position_b.add(new Int_Checker(555,258));
        position_b.add(new Int_Checker(753,258));

        position_w.add(new Int_Checker(654,753));
        position_w.add(new Int_Checker(456,753));
        position_w.add(new Int_Checker(258,753));
        position_w.add(new Int_Checker(60,753));
        position_w.add(new Int_Checker(753,654));
        position_w.add(new Int_Checker(555,654));
        position_w.add(new Int_Checker(357,654));
        position_w.add(new Int_Checker(159,654));
        position_w.add(new Int_Checker(654,555));
        position_w.add(new Int_Checker(456,555));
        position_w.add(new Int_Checker(258,555));
        position_w.add(new Int_Checker(60,555));
    }

}
