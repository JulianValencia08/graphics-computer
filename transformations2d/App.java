package transformations2d;

import javax.swing.JPanel;
import java.awt.Graphics;
import drawitems.DrawItems;
import mathGc.Point3;

public class App extends JPanel {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private MovableObject object2d;

    public App() {
        ScannerFile.readFile("transformations2d/gancho.txt");
        Point3[] points = ScannerFile.getPoints();
        int[][] connections = ScannerFile.getConnections();
        object2d = new MovableObject(points, connections); 
        this.addKeyListener(new KeyBoardListener(object2d, this));
        this.setFocusable(true);
        this.requestFocusInWindow();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        DrawItems.drawAxis(g);
        // Draw the object
        object2d.drawObject(g);
    }

    // Getters 
    public static int getWIDTH() {
        return WIDTH;
    }
    public static int getHEIGHT() {
        return HEIGHT;
    }
}