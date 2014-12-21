package primenumbers;

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner load = new Scanner(System.in);
        System.out.println("Wprowadź liczbę całkowitą: ");
        int x = load.nextInt();
        int i = 2;
        while (x > 1)
        {
            while (x % i == 0)
            {
               System.out.println(i);
               x /= i; 
            }
            i++;
        }
    }
}
