package transformations2d;

import mathGc.Matrix3x3;

public class Translation3x3 extends Matrix3x3{
    public Translation3x3(double dx, double dy) {
        super();
        double[][] matrix = new double[][] {
            {1, 0, dx},
            {0, 1, dy},
            {0, 0, 1}
        };
        setMatrix(matrix);
    }
}
