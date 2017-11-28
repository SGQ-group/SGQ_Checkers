import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        //Создать объект Game
        Game game = new Game();
        // Выполнить в EDT
        SwingUtilities.invokeLater(game);
    }
}