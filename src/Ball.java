import java.awt.*;

public class Ball implements IMovable {
    private int x, y;
    private final int size = 14;
    private final int speed = 1;
    private int dirX, dirY;

    public Ball() {
        this.x = Constants.WIDTH / 2;
        this.y = Constants.HEIGHT / 2;
        this.dirX = -1;
        this.dirY = 0;
    }

    @Override
    public void move() {
        this.x = this.x + this.speed * this.dirX;
        this.y = this.y + this.speed * this.dirY;

        if (this.x == 0){
            this.dirX *= -1;
        }
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillOval(this.x, this.y, this.size, this.size);
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    public int getDirX() {
        return dirX;
    }

    public void setDirX(int dirX) {
        this.dirX = dirX;
    }

    public int getDirY() {
        return dirY;
    }

    public void setDirY(int dirY) {
        this.dirY = dirY;
    }
}
