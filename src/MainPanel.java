import javax.swing.*;
import java.awt.*;

public class MainPanel extends JFrame {

    private GamePanel gamePanel;
    private MenuPanel menuPanel;

    public MainPanel() throws HeadlessException {
        this.setTitle("Můj Arkanoid");
        this.setSize(Constants.WIDTH, Constants.HEIGHT);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.menuPanel = new MenuPanel();
        this.gamePanel = new GamePanel();


        this.add(gamePanel);
        this.add(menuPanel, BorderLayout.EAST);
        this.setVisible(true);
        this.gamePanel.init();
    }

    public GamePanel getGamePanel() {
        return gamePanel;
    }
}
