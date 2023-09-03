package transformations2d;

public interface Movable {
    public void moveUp(int distance);
    public void moveDown(int distance);
    public void moveLeft(int distance);
    public void moveRight(int distance);
    public void scaleObject(double scaleX, double scaleY);
    public void rotateObjectClockWise(int angle); 
    public void rotateObjectCounterClockWise(int angle);
} 