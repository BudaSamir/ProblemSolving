package in.out.area;
import java.util.Scanner;
public class INOUTArea {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      double A = in.nextDouble(), B = in.nextDouble(), C = in.nextDouble();
      double Triangle = 0.5 * A * C;
      double Circle = 3.14159 * (C*C);
      double Trapezuim = 0.5 * (A + B) * C;
      double Square = B * B;
      double Regtangle = A * B ; 
      System.out.printf("TRIANGULO: %.3f\n", Triangle);
      System.out.printf("CIRCULO: %.3f\n", Circle);
      System.out.printf("TRAPEZIO: %.3f\n", Trapezuim);
      System.out.printf("QUADRADO: %.3f\n", Square);
      System.out.printf("RETANGULO: %.3f\n", Regtangle);
    }
    
}
