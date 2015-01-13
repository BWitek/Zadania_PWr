package poletrojkata;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class PoleTrojkata {
    
    static double countDistance (int a, int b, int c, int d)
    {
        return sqrt (pow((a - b), 2) + pow((c - d), 2));
    }
    
    static double HeronsFormula (double a, double b, double c)
        {
           double p = (a + b + c) / 2;
           return sqrt(p * (p - a) * (p - b) * (p - c));
        }

    public static void main(String[] args) {
        Scanner load = new Scanner(System.in);
        System.out.println("Wprowadź współrzędne pierwszego wierzchołka: ");
        int x1 = load.nextInt();
        int y1 = load.nextInt();
        System.out.println("Wprowadź współrzędne drugiego wierzchołka: ");
        int x2 = load.nextInt();
        int y2 = load.nextInt();
        System.out.println("Wprowadź współrzędne trzeciego wierzchołka: ");
        int x3 = load.nextInt();
        int y3 = load.nextInt();
        
        double dist12 = countDistance (x1, x2, y1, y2);
        double dist23 = countDistance (x2, x3, y2, y3);
        double dist31 = countDistance (x3, x1, y3, y1);
        
        System.out.println(HeronsFormula(dist12, dist23, dist31));        
    }   
}
