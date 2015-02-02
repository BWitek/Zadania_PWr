//Napisz program, który wczyta współrzędne całkowite 4 różnych punktów
//(8 liczb całkowitych) i odpowie, czy dwa pierwsze punkty leżą
//po tej samej stronie prostej przechodzącej przez dwa ostatnie punkty.

package stronyprostej;

import java.util.Scanner;

public class StronyProstej {
    
    static double wspolczynnikKierunkowy (int xa, int ya, int xb, int yb)
    {
        return((double)(yb-ya)/(double)(xb-xa));
    }
    
    static void przymierzDoProstej ()
    {
        
    }
    
    public static void main(String[] args) {
        Scanner load = new Scanner(System.in);
        
        System.out.println("Wprowadź współrzędne (liczby całkowite) czterech punktów p1-p4: ");
        System.out.println("p1: ");
            int x1 = load.nextInt();
            int y1 = load.nextInt();
        System.out.println("p2: ");
            int x2 = load.nextInt();
            int y2 = load.nextInt();
        System.out.println("p3: ");
            int x3 = load.nextInt();
            int y3 = load.nextInt();
        System.out.println("p4: ");
            int x4 = load.nextInt();
            int y4 = load.nextInt();
        
        double b = (double)(y3 - ((wspolczynnikKierunkowy(x3, y3, x4, y4)*x3)));
        
        System.out.println("Wzór prostej wyznaczonej przez punkty p3 i p4 to: ");
            if (b > 0)
            {
                System.out.println("f(x) = " + wspolczynnikKierunkowy(x3, y3, x4, y4) + "x + " + b);
            }
            else
            {
                System.out.println("f(x) = " + wspolczynnikKierunkowy(x3, y3, x4, y4) + "x" + b);
            }
            
        double ya, yb;
        ya = (wspolczynnikKierunkowy(x3, y3, x4, y4))*x1 + b;
        yb = (wspolczynnikKierunkowy(x3, y3, x4, y4))*x2 + b;
        
        if (y1 < ya && y2 < yb || y1 > ya && y2 > yb)
            System.out.println("Punkty p1 i p2 leżą po tej samej stronie prostej.");
        else
            System.out.println("Punkty p1 i p2 leżą po przeciwnych stronach prostej.");        
    }  
}
