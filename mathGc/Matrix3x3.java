package mathGc;

public class Matrix3x3 {
    private double[][] matrix;

    public Matrix3x3(double[][] matrix) {
        this.matrix = matrix;
    }
    public Matrix3x3(){
        matrix = new double[][] {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
    }

    public static Point3 times(Matrix3x3 matrix3x3, Point3 point3) {
        double[] result = new double[3];

        for(int row = 0; row < 3; row++) {

            result[row] = matrix3x3.matrix[row][0] * point3.getX() 
                        + matrix3x3.matrix[row][1] * point3.getY() 
                        + matrix3x3.matrix[row][2] * 1.0;
        }
        return new Point3(result[0], result[1], result[2]);
    }

    public static Matrix3x3 times(Matrix3x3 matrix3x3_1, Matrix3x3 matrix3x3_2) {
        double[][] resultMatrix = new double[3][3];
        
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                double sum = 0;
                for (int k = 0; k < 3; k++) {
                    sum += matrix3x3_1.matrix[row][k] * matrix3x3_2.matrix[k][col];
                }
                resultMatrix[row][col] = sum;
            }
        }        
        return new Matrix3x3(resultMatrix);
    }

    // Getter
    public double[][] getMatrix() {
        return matrix;
    }

    // Setter
    public void setMatrix(double[][] matrix) {
        this.matrix = matrix;
    }
}