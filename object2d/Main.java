package object2d;

import javax.swing.JFrame;

public class Main {

    public static void main(String [] args) {
        App puntos = new App();
        JFrame frame = new JFrame("Draw from text file");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(App.getWIDTH(), App.getHEIGHT());
        frame.add(puntos);
        frame.setVisible(true);
    }
}