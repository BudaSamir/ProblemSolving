package areaofcircle;
import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       double r = in.nextDouble();
       System.out.printf("A=%.4f\n",area(r));
    }
    static double area(double r){ 
      return 3.14159 * ( r * r );
    }
    
}
