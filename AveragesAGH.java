package averagesagh;

import static java.lang.Math.cbrt;
import java.util.Scanner;

public class AveragesAGH {
    
    static double arithmeticMean (double x, double y, double z)
    {
        return (x + y + z)/3;
    }
    
    static double thirdRoot (double x)
    {
        return cbrt(x);
    }
    
    static double geometricMean (double x, double y, double z)
    {
        double base = x*y*z;
        return thirdRoot(base);
    }
    
    static double harmonicMean (double x, double y, double z)
    {
        return 3/(1/x + 1/y + 1/z);
    }

    public static void main(String[] args) {
        Scanner liczba = new Scanner(System.in);
        double a, b, c;
        System.out.println("Podaj trzy liczby dodatnie: ");
        a = liczba.nextDouble();
        b = liczba.nextDouble();
        c = liczba.nextDouble();
        System.out.println("Średnia arytmetyczna podanych liczb wynosi: " + arithmeticMean(a, b, c));
        System.out.println("Średnia geometryczna podanych liczb wynosi: " + geometricMean(a, b, c));  
        System.out.println("Średnia harmoniczna podanych liczb wynosi: " + harmonicMean(a, b, c));
    }   
}
