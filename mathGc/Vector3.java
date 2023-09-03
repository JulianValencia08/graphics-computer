package mathGc;

public class Vector3 {
    
    private double x, y, z;

    public Vector3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static Vector3 crossProduct(Vector3 vector1, Vector3 vector2) {
        // Return the cross product of two vectors
        double x = vector1.getY() * vector2.getZ() - vector1.getZ() * vector2.getY();
        double y = vector1.getZ() * vector2.getX() - vector1.getX() * vector2.getZ();
        double z = vector1.getX() * vector2.getY() - vector1.getY() * vector2.getX();
        
        return new Vector3(x, y, z) ;
    }
    public static double dotProduct(Vector3 vector1, Vector3 vector2) {
        double product_cross = vector1.getX() * vector2.getX() 
             + vector1.getY() * vector2.getY() 
             + vector1.getZ() * vector2.getZ();    
        return product_cross;
    }
    public double magnitude(){
        // Return the magnitude of a vector
        double magnitude = Math.sqrt(x * x + y * y + z * z);
        return magnitude;
    }
    public void normalize(){
        // Normalize a vector
        double magnitude = magnitude();
        if (magnitude > 0) {
            x /= magnitude;
            y /= magnitude;
            z /= magnitude;
        }
    }

    // Getters
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }
}
