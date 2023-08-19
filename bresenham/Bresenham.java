package bresenham;
import java.awt.Graphics;

public class Bresenham {
    // Dibuja un punto en el plano cartesiano
    DrawItems items = new DrawItems();
    public void calculateLinesBresenham(Graphics g, int x0, int y0, int x1, int y1){
        int dx = x1 - x0;
        int dy = y1 - y0;
        int x, y;
        int p;
        int incE, incNE;
        int stepX, stepY;

         /* determinar que punto usar para empezar, cual para terminar */
        if (dy < 0) { 
            dy = -dy; 
            stepY = -1; 
        } else stepY = 1;

        if (dx < 0) {  
            dx = -dx;  
            stepX = -1; 
        } else stepX = 1;
        
        x = x0;
        y = y0;
        items.myDrawPoint(g, x, y);
        /* Se cicla hasta llegar al extremo de la línea */
        if(dx > dy){ 
            p = 2*dy - dx;
            incE = 2*dy;
            incNE = 2*(dy-dx);
            while(x != x1){ 
                x = x + stepX;
                if (p < 0) {
                    p = p + incE;
                } else {
                    y = y + stepY;
                    p = p + incNE;
                }
                items.myDrawPoint(g, x, y);
            }
        } else { 
            p = 2*dx - dy;
            incE = 2*dx;
            incNE = 2*(dx-dy);
            while(y != y1){
                y = y + stepY;
                if (p < 0) {
                    p = p + incE;
                } else {
                    x = x + stepX;
                    p = p + incNE;
                }
                items.myDrawPoint(g, x, y);
            }
        }
    }
}
