package metrynastopy;

import java.util.Scanner;

public class MetryNaStopy {

    static double foot (int a)
    {
        double f;
        f = (double) (a/0.3048);
        return f;
    }
    public static void main(String[] args) {
        Scanner metry = new Scanner(System.in);
        System.out.println("Podaj odległość w metrach: ");
        int m = metry.nextInt();
        System.out.println("Ta odległość wyrażona w stopach wynosi: " + foot(m));       
    } 
}
