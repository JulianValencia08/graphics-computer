package mathGc;

public class Matrix4x4 {
    private double[][] data;

    public Matrix4x4(double[][] data) {
        this.data = data;
    }

    public static Point4 times(Matrix4x4 matrix4x4, Point4 point4) {
        double[] result = new double[4];

        for(int row = 0; row < 4; row++) {
            result[row] =  matrix4x4.data[row][0] * point4.getX() 
                        + matrix4x4.data[row][1] * point4.getY()
                        + matrix4x4.data[row][2] * point4.getZ() 
                        + matrix4x4.data[row][3] * 1.0;
        }
        return new Point4(result[0], result[1], result[2], result[3]);
    }

    public static Matrix4x4 times(Matrix4x4 matrix4x4_1, Matrix4x4 matrix4x4_2) {
        double[][] resultData = new double[4][4];
        
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                double sum = 0;
                for (int k = 0; k < 4; k++) {
                    sum += matrix4x4_1.data[row][k] * matrix4x4_2.data[k][col];
                }
                resultData[row][col] = sum;
            }
        }        
        return new Matrix4x4(resultData);
    }

    // Getter
    public double[][] getData() {
        return data;
    }
}