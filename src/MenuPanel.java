import javax.swing.*;
import java.awt.*;

public class MenuPanel extends JPanel {
    public MenuPanel() {
        this.setBackground(Color.DARK_GRAY);
        this.setPreferredSize(new Dimension(Constants.SCORE_WIDTH, Constants.HEIGHT));
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setVisible(true);
    }
}
