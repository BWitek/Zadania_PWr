package acceleration;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Acceleration {
    
    final static double g = 9.81;
    
    static double vel (double a)
    {
        return sqrt(2*g*a);
    }

    public static void main(String[] args) {
        Scanner liczba = new Scanner(System.in);
        System.out.println("Podaj wysokość w metrach: ");
        int h = liczba.nextInt();
        System.out.println("Prędkość, z jaką uderzy w ziemię obiekt zrzucony z "
        + "podanej wysokości wynosi: " + vel(h) + " m/s");
    }
}