package object2d;

import javax.swing.JPanel;
import java.awt.Graphics;
import drawitems.DrawItems;

public class App extends JPanel{
    private static final int WIDTH = DrawItems.WIDTH;
    private static final int HEIGHT = DrawItems.HEIGHT;
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        DrawItems.drawAxis(g);
        ScannerFile.readFile("object2d/home.txt", g);
    }

    // Getters 
    public static int getWIDTH() {
        return WIDTH;
    }
    public static int getHEIGHT() {
        return HEIGHT;
    }
}