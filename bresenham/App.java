package bresenham;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel ; 

public class App extends JPanel{
    // Sobre escribimos el metodo paintComponent para dibujar en el JPanel
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        DrawItems items = new DrawItems();
        Wheel wheel = new Wheel();
        g.setColor(Color.BLUE);
        items.drawAxis(g);    
        g.setColor(Color.RED);    
        wheel.DrawWheel(g, 100);
    }
}