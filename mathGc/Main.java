package mathGc;

public class Main {
    public static void main(String[] args) {
        Point3 point3 = new Point3(1, 2, 1);
        Point4 point4 = new Point4(1, 2, 3, 1);
        Vector3 vector3_1 = new Vector3(1, 2, 3);
        Vector3 vector3_2 = new Vector3(1, 4, 2);
        Matrix3x3 matrix3x3 = new Matrix3x3(new double[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        Matrix4x4 matrix4x4 = new Matrix4x4(new double[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, 
                                                           {9, 10, 11, 12}, {13, 14, 15, 16}});
        // Proof of multiplication Matrix3x3 * Point3
        System.out.println("Proof of multiplication Matrix3x3 * Point3");
        Point3 timesPoint3 = Matrix3x3.times(matrix3x3, point3);
        ShowMatrix.showPointFormat(timesPoint3);
        System.out.println("-------------------------------------------");
        
        // Proof of multiplication Matrix3x3 * Matrix3x3
        System.out.println("Proof of multiplication Matrix3x3 * Matrix3x3");
        Matrix3x3 timesMatrix3x3 = Matrix3x3.times(matrix3x3, matrix3x3);
        ShowMatrix.showMatrixFormat(timesMatrix3x3.getMatrix());
        System.out.println("-------------------------------------------");
        
        // Proof of multiplication Matrix4x4 * Point4
        System.out.println("Proof of multiplication Matrix4x4 * Point4");
        Point4 timesPoint4 = Matrix4x4.times(matrix4x4, point4);
        ShowMatrix.showPointFormat(timesPoint4);
        System.out.println("-------------------------------------------");

        // Proof of multiplication Matrix4x4 * Matrix4x4
        System.out.println("Proof of multiplication Matrix4x4 * Matrix4x4");
        Matrix4x4 timesMatrix4x4 = Matrix4x4.times(matrix4x4, matrix4x4);
        ShowMatrix.showMatrixFormat(timesMatrix4x4.getData());
        System.out.println("-------------------------------------------");

        // Proof of cross product Vector3 * Vector3
        System.out.println("Proof of cross product Vector3 * Vector3");
        Vector3 crossProduct = Vector3.crossProduct(vector3_1, vector3_2);
        ShowMatrix.showCrossProduct(crossProduct);
        System.out.println("------------------------------------------");

        // Proof of dot product Vector3 * Vector3
        System.out.println("Proof of dot product Vector3 * Vector3");
        double dotProduct = Vector3.dotProduct(vector3_1, vector3_2);
        System.out.println("dotProduct = " + dotProduct);
        System.out.println("------------------------------------------");

        // Proof of magnitude Vector3
        System.out.println("Proof of magnitude Vector3");
        double magnitude = vector3_1.magnitude();
        System.out.println("magnitude = " + magnitude);
        System.out.println("------------------------------------------");

        // Proof of normalize Vector3
        System.out.println("Proof of normalize Vector3");
        System.out.println("Before normalize");
        ShowMatrix.showCrossProduct(vector3_1);
        System.out.println("After normalize");
        vector3_1.normalize();
        ShowMatrix.showCrossProduct(vector3_1);

    }
}