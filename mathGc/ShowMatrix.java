package mathGc;

import java.util.Arrays;

public class ShowMatrix {
    public static void showMatrixFormat(double[][] matrix){
        for (int n = 0 ; n < matrix.length ; n++){
            System.out.println(Arrays.toString(matrix[n])); 
        } 
    }

    public static void showPointFormat(Point3 point){
        System.out.println("x = " + point.getX());
        System.out.println("y = " + point.getY());
        System.out.println("w = " + point.getW());
    }
    public static void showPointFormat(Point4 point){
        System.out.println("x = " + point.getX());
        System.out.println("y = " + point.getY());
        System.out.println("z = " + point.getZ());
        System.out.println("w = " + point.getW());
    }
    public static void showCrossProduct(Vector3 vector){
        System.out.println("x = " + vector.getX());
        System.out.println("y = " + vector.getY());
        System.out.println("z = " + vector.getZ());
    }
}
