package mathGc;

public class Point3 { 
    private double x, y, w;
    
    public Point3(double x, double y, double w){
        this.x = x;
        this.y = y;
        this.w = w;
    }

    // Getters
    public double getW() {
        return w;
    }
    public double getY() {
        return y;
    }
    public double getX() {
        return x;
    }
    // Setters
    public void setW(double w) {
        this.w = w;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setX(double x) {
        this.x = x;
    }
}