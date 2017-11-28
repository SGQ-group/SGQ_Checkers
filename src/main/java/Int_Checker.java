public class Int_Checker {
    //Позиция шашки по Х
    private int positionX;
    //Позиция шашки по Y
    private int positionY;

    //Конструктор
    public Int_Checker(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    //Читать позицию X
    public int getPositionX() {
        return positionX;
    }

    //Читать позицию Y
    public int getPositionY() {
        return positionY;
    }

    //Изменить позицию X
    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }
    //Изменить позицию Y
    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }
}
