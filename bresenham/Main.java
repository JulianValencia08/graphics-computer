package bresenham;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        App puntos = new App();
        JFrame frame = new JFrame("Bresenham");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(DrawItems.WIDTH, DrawItems.HEIGHT);
        frame.add(puntos);
        frame.setVisible(true);
    }
}