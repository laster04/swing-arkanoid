import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GamePanel extends JPanel {
    private IMovable ball;
    private BufferedImage image;

    @Override
    public void paint(Graphics g) {
        this.image = new BufferedImage(Constants.WIDTH - Constants.SCORE_WIDTH,
                Constants.HEIGHT, BufferedImage.TYPE_INT_RGB);
        Graphics b = this.image.getGraphics();
        this.ball.paint(b);
        repaint();
        g.drawImage(this.image, 0, 0, this);
    }

    public void run() throws InterruptedException {
        this.ball.move();
        repaint();;
        Thread.sleep(2);
    }

    public void init() {
        this.ball = new Ball();
    }
}
