package bresenham;
import java.awt.Graphics;


public class DrawItems {
    public static final int WIDTH = 1900;
    public static final int HEIGHT = 1100;

    public void drawAxis(Graphics g){
        g.drawLine(0, HEIGHT/2, WIDTH, HEIGHT/2);
        g.drawLine(WIDTH/2, 0, WIDTH/2, HEIGHT);
    }
    public void myDrawLine(Graphics g, int x1, int y1, int x2, int y2) {
        int xj1 = x1 + WIDTH/2;
        int yj1 = HEIGHT/2 - y1;
        int xj2 = x2 + WIDTH/2;
        int yj2 = HEIGHT/2 - y2;
        g.drawLine(xj1, yj1, xj2, yj2);
    }
    public void myDrawPoint(Graphics g,  int x, int y){
        int xj = x + WIDTH/2;
        int yj = HEIGHT/2 - y;
        g.drawLine(xj, yj, xj, yj);
    }
}
