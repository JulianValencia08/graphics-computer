package transformations2d;

import mathGc.Matrix3x3;

public class Scaling3x3 extends Matrix3x3{
    public Scaling3x3(double sx, double sy){
        super();
        double[][] matrix = new double[][] {
            {sx, 0, 0},
            {0, sy, 0},
            {0, 0, 1}
        };
        setMatrix(matrix);
    }
}