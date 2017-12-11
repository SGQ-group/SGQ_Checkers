public class Int_Checker {
    private int positionX;
    private int positionY;
    private boolean king;

    public Int_Checker(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
        king = false;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public boolean isKing() {
        return king;
    }

    public void setKing(boolean king) {
        this.king = king;
    }
}
