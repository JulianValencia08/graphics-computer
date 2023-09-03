package transformations2d;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        App app = new App();
        JFrame frame = new JFrame("Transformations 2D");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(App.getWIDTH(), App.getHEIGHT());
        frame.add(app);
        frame.setVisible(true);
    }
}
