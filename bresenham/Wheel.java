package bresenham;
import java.awt.Graphics;

public class Wheel {
    private Bresenham bresenham = new Bresenham();
    public void DrawWheel(Graphics g, int radius){
        for(int i = 0; i < 360; i+=10){
            double angleRad = Math.toRadians(i);
            int endX = (int) (radius * Math.cos(angleRad));
            int endY = (int) (radius * Math.sin(angleRad));
            bresenham.calculateLinesBresenham(g, 0, 0, endX, endY);
        }
    }
}
