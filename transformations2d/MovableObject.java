package transformations2d;

import drawitems.DrawItems;
import mathGc.Matrix3x3;
import mathGc.Point3;
import java.awt.Graphics;

public class MovableObject  implements Movable { 
    private Point3[] points;
    private int[][] connections;
    private Point3[] newPoints;
    private TranslScalRot3x3 translationMatrix;
    private TranslScalRot3x3 scaleMatrix;
    private TranslScalRot3x3 rotationMatrix;

    public MovableObject(Point3[] points, int[][] connections) {
        this.points = points;
        this.connections = connections;
        newPoints = new Point3[points.length];
    }

    @Override
    public void moveUp(int distance) {
        translationMatrix = new TranslScalRot3x3(0, distance, 1, 1, 0);
        multCopy(translationMatrix);
    }

    @Override
    public void moveDown(int distance) {
       translationMatrix = new TranslScalRot3x3(0, -distance, 1, 1, 0);
        multCopy(translationMatrix);
    }
    
    @Override
    public void moveLeft(int distance) {
        translationMatrix = new TranslScalRot3x3(-distance, 0, 1, 1, 0);
        multCopy(translationMatrix);
    }

    @Override
    public void moveRight(int distance) {
        translationMatrix = new TranslScalRot3x3(distance, 0, 1, 1, 0);
        multCopy(translationMatrix);
    }

    @Override
    public void scaleObject(double scaleX, double scaleY) {
        Point3 center = calculateObjectCenter();  
        bringPointsToCenter(center);
        scaleMatrix = new TranslScalRot3x3(0, 0 , scaleX, scaleY, 0);
        multCopy(scaleMatrix);
        returnPointsToOriginalPosition(center);
    }

    @Override
    public void rotateObjectClockWise(int angle) {
        Point3 center = calculateObjectCenter();  
        bringPointsToCenter(center);
        rotationMatrix = new TranslScalRot3x3(0, 0, 1, 1, angle);
        multCopy(rotationMatrix);
        returnPointsToOriginalPosition(center);
    }

    @Override
    public void rotateObjectCounterClockWise(int angle){
        Point3 center = calculateObjectCenter();  
        bringPointsToCenter(center);
        rotationMatrix = new TranslScalRot3x3(0, 0, 1, 1, -angle);
        multCopy(rotationMatrix);
        returnPointsToOriginalPosition(center);
    }

    public void drawObject(Graphics g) {
        for(int i = 0; i < connections.length; i++) {
            DrawItems.myDrawLine(g, points[connections[i][0]].getX(), 
                                            points[connections[i][0]].getY(), 
                                            points[connections[i][1]].getX(), 
                                            points[connections[i][1]].getY());
        }
    }

    public void bringPointsToCenter(Point3 center){
        for (int i = 0; i < points.length; i++) {
                points[i].setX(points[i].getX() - center.getX());
                points[i].setY(points[i].getY() - center.getY());
        }
    }
    
    public void returnPointsToOriginalPosition(Point3 center){
        for (int i = 0; i < points.length; i++) {
                points[i].setX(points[i].getX() + center.getX());
                points[i].setY(points[i].getY() + center.getY());
        }
    }

    public void multCopy(TranslScalRot3x3 matrix) {
        for(int i = 0; i < points.length; i++) {    
            newPoints[i] = Matrix3x3.times(matrix, points[i]);
        }
        System.arraycopy(newPoints, 0, points, 0, points.length);
    }

    public Point3 calculateObjectCenter(){
        double centerX = 0;
        double centerY = 0;
        for(int i = 0; i < points.length; i++) {
            centerX += points[i].getX();
            centerY += points[i].getY();
        }
        centerX /= points.length;
        centerY /= points.length;
        return new Point3(centerX, centerY, 1);
    }
}