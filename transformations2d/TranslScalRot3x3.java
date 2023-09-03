package transformations2d;

import mathGc.Matrix3x3;
// This class performs the following transformations:
// - Translation
// - Scaling
// - Rotation
public class TranslScalRot3x3 extends Matrix3x3 {

    double dx = 0;
    double dy = 0;
    double sx = 1;
    double sy = 1;
    double theta = 0;

    public TranslScalRot3x3() {
        super();
        this.dx = 0;
        this.dy = 0;
        this.sx = 1;
        this.sy = 1;
        this.theta = 0;
    }

    public TranslScalRot3x3(double dx, double dy, double sx, double sy, double theta) {
        super();
        this.dx = dx;
        this.dy = dy;
        this.sx = sx;
        this.sy = sy;
        this.theta = theta;

        Translation3x3 translation = new Translation3x3(dx, dy);
        Scaling3x3 scaling = new Scaling3x3(sx, sy);
        Rotation3x3 rotation = new Rotation3x3(theta);

        Matrix3x3 m1 = Matrix3x3.times(scaling, translation);
        Matrix3x3 finalMatrix = Matrix3x3.times(rotation, m1);
        this.setMatrix(finalMatrix.getMatrix());
    }
}