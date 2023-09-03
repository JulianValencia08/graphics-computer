package object2d;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.Graphics;

import drawitems.DrawItems;
import mathGc.Point3;
import mathGc.Matrix3x3;


public class ScannerFile {
    public static void readFile(String fileName, Graphics g) {
        double[][] translationMatrix = {
            {1, 0, 100},
            {0, 1, 50},
            {0, 0, 1}
        };
        try {
            Scanner scanner = new Scanner(new File(fileName));
            int numPoints = scanner.nextInt();
            Point3[] points = new Point3[numPoints];
            Point3[] pointsTranslate = new Point3[numPoints];
            int w = 1;
            for(int i = 0; i < numPoints; i++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                points[i] = new Point3(x, y, w);
                pointsTranslate[i] = Matrix3x3.times(new Matrix3x3(translationMatrix), points[i]);
            }
            int numLines = scanner.nextInt();
            for(int i = 1; i <= numLines; i++) {
                int indice1 = scanner.nextInt();
                int indice2 = scanner.nextInt();
                DrawItems.myDrawLine(
                            g, 
                            points[indice1].getX(), 
                            points[indice1].getY() , 
                            points[indice2].getX(), 
                            points[indice2].getY());
                DrawItems.myDrawLine(g, 
                            pointsTranslate[indice1].getX(), 
                            pointsTranslate[indice1].getY() , 
                            pointsTranslate[indice2].getX(), 
                            pointsTranslate[indice2].getY()    
                );
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}