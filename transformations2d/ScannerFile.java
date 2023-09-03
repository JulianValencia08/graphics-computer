package transformations2d;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import mathGc.Point3;

public class ScannerFile {
    private static Point3[] points;
    private static int w = 1;
    private static int[][] connections; 
    private static int numPoints;
    private static int numConnections;

    // Method to read the points and connections from a file
    public static void readFile(String fileName) {        
        try {
            Scanner scanner = new Scanner(new File(fileName));
            // Read the points and store them in the array
            numPoints = scanner.nextInt();
            points = new Point3[numPoints];
            for(int i = 0; i < numPoints; i++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                points[i] = new Point3(x, y, w);
            }
            // Read the connections and store them in the array
            numConnections = scanner.nextInt();
            connections = new int[numConnections][2];
            for(int i = 0; i < numConnections; i++) {
                connections[i][0] = scanner.nextInt();
                connections[i][1] = scanner.nextInt();
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Method to get the points
    public static Point3[] getPoints() {
        return points;
    }
    // Method to get the connections
    public static int[][] getConnections() {
        return connections;
    }
}