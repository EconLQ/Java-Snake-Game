import javax.swing.*;

public class GameFrame extends JFrame {
    public GameFrame() {
//        GamePanel panel = new GamePanel();
        this.add(new GamePanel()); // as an option of adding an instance of GamePanel
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack(); // snugly adds all the components that we add to JFrame
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}