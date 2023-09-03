package transformations2d;

import mathGc.Matrix3x3;

public class Rotation3x3 extends Matrix3x3 {
    public Rotation3x3(double theta){
        super();
        double[][] matrix = new double[][] {
            {Math.cos(theta), -Math.sin(theta), 0},
            {Math.sin(theta), Math.cos(theta), 0},
            {0, 0, 1}
        };
        setMatrix(matrix);
    }
}
