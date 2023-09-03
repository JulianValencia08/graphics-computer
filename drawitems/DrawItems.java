package drawitems;
import java.awt.Graphics;
import java.awt.Color;

public class DrawItems {
    public static final int WIDTH = 1000;
    public static final int HEIGHT = 800;
    public static void drawAxis(Graphics g){
        g.setColor(Color.RED);
        g.drawLine(0, HEIGHT/2, WIDTH, HEIGHT/2);
        g.setColor(Color.GREEN);
        g.drawLine(WIDTH/2, 0, WIDTH/2, HEIGHT);
        g.setColor(Color.BLACK);
    }
    public static void myDrawLine(Graphics g, double x1, double y1, double x2, double y2) {
        int xj1 = (int) (x1 + WIDTH/2);
        int yj1 = (int) (HEIGHT/2 - y1);
        int xj2 = (int) (x2 + WIDTH/2);
        int yj2 = (int) (HEIGHT/2 - y2);
        g.drawLine(xj1, yj1, xj2, yj2);
    }
    public static void myDrawPoint(Graphics g,  double x, double y){
        int xj = (int)(x + WIDTH/2);
        int yj = (int)(HEIGHT/2 - y);
        g.drawLine(xj, yj, xj, yj);
    }
}