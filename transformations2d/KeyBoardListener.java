package transformations2d;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class KeyBoardListener implements KeyListener{
    private MovableObject object2d;
    private App app;   

    public KeyBoardListener(MovableObject object2d, App app) {
        this.object2d = object2d;
        this.app = app;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        int distance = 10;
        switch(key) {
            case KeyEvent.VK_W:
                System.out.println("Up");
                object2d.moveUp(distance);
                break;
            case KeyEvent.VK_S:
                System.out.println("Down");
                object2d.moveDown(distance);
                break;
            case KeyEvent.VK_A:
                System.out.println("Left");
                object2d.moveLeft(distance);
                break;
            case KeyEvent.VK_D:
                System.out.println("Right");
                object2d.moveRight(distance);
                break;
            case KeyEvent.VK_Q:
                System.out.println("Scale Up");
                object2d.scaleObject(1.2, 1.2);
                break;
            case KeyEvent.VK_E:
                System.out.println("Scale Down");
                object2d.scaleObject(0.8, 0.8);
                break;
            case KeyEvent.VK_R:
                System.out.println("Rotate Clockwise");
                object2d.rotateObjectClockWise(1);
                break;
            case KeyEvent.VK_T:
                System.out.println("Rotate Counter Clockwise");
                object2d.rotateObjectCounterClockWise(1);
                break;
        }
        app.repaint();
    }
    @Override
    public void keyTyped(KeyEvent e) {
        // No es necesario implementar este método, pero debe estar presente debido a la interfaz
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // No es necesario implementar este método, pero debe estar presente debido a la interfaz
    }
}