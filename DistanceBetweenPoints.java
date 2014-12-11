package distancebetweenpoints;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class DistanceBetweenPoints {
    
    static double countDistance (int a, int b, int c, int d)
    {
        return sqrt (pow((a - b), 2) + pow((c - d), 2));
    }

    public static void main(String[] args) {
        Scanner load = new Scanner(System.in);
        System.out.println("Wprowadź współrzędne x i y punktu 1: ");
        int x1 = load.nextInt();
        int y1 = load.nextInt();
        System.out.println("Wprowadź współrzędne x i y punktu 2: ");
        int x2 = load.nextInt();
        int y2 = load.nextInt();
        
        System.out.println("Odległość między podanymi punktami wynosi: " 
                           + countDistance(x1, x2, y1, y2));
    }  
}
