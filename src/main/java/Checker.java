import javax.swing.*;
import java.util.ArrayList;

public class Checker {
    private ImageIcon icon; //Картинка шашки
    private ArrayList<Int_Checker> position_b = new ArrayList<>(); //Позиция черных шашек
    private ArrayList<Int_Checker> position_w = new ArrayList<>();//Позиция белых шашек

    public Checker(int index) {
        icon = new ImageIcon(new Img().img2(index)); //Картинка обычной шашки (Не привязывается к position_w или position_b
        init(); //Создаем шашки
    }

    public ImageIcon getIcon() {
        return icon; //Отдаем картинку шашки
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon; // изменяем картинку шашки
    }

    public ArrayList<Int_Checker> getPosition_b() {
        return position_b;//Отдаем коллекцию черной шашки (Позиция)
    }

    public ArrayList<Int_Checker> getPosition_w() {
        return position_w; //Отдаем коллекцию белой шашки (Позиция)
    }

    public void init(){
        position_b.add(new Int_Checker(159,60)); //Создание белой шашки
        position_b.add(new Int_Checker(357,60));//Создание белой шашки
        position_b.add(new Int_Checker(555,60));//Создание белой шашки
        position_b.add(new Int_Checker(753,60));//Создание белой шашки
        position_b.add(new Int_Checker(60,159));//Создание белой шашки
        position_b.add(new Int_Checker(258,159));//Создание белой шашки
        position_b.add(new Int_Checker(456,159));//Создание белой шашки
        position_b.add(new Int_Checker(654,159));//Создание белой шашки
        position_b.add(new Int_Checker(159,258));//Создание белой шашки
        position_b.add(new Int_Checker(357,258));//Создание белой шашки
        position_b.add(new Int_Checker(555,258));//Создание белой шашки
        position_b.add(new Int_Checker(753,258));//Создание белой шашки

        position_w.add(new Int_Checker(654,753));//Создание черной шашки
        position_w.add(new Int_Checker(456,753));//Создание черной шашки
        position_w.add(new Int_Checker(258,753));//Создание черной шашки
        position_w.add(new Int_Checker(60,753));//Создание черной шашки
        position_w.add(new Int_Checker(753,654));//Создание черной шашки
        position_w.add(new Int_Checker(555,654));//Создание черной шашки
        position_w.add(new Int_Checker(357,654));//Создание черной шашки
        position_w.add(new Int_Checker(159,654));//Создание черной шашки
        position_w.add(new Int_Checker(654,555));//Создание черной шашки
        position_w.add(new Int_Checker(456,555));//Создание черной шашки
        position_w.add(new Int_Checker(258,555));//Создание черной шашки
        position_w.add(new Int_Checker(60,555));//Создание черной шашки
    }

}
