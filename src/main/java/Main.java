import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        // Выполнить в EDT
        SwingUtilities.invokeLater(game);
    }
}