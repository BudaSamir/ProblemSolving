package method.area;
import java.util.Scanner;
public class MethodArea {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     for(int i = 0; i<=1; i++){
     double A = in.nextDouble(), B = in.nextDouble(), C = in.nextDouble();
     GetTriangle(Triangle(A,C));
     GetCircle(Circle(C));
     GetTrapezuim(Trapezuim(A,B,C));
     GetSquare(Square(B));
     GetRegtangle(Regtangle(A,B));
    }
    }
    
    static double Triangle(double A, double C){
        return 0.5 * A * C;
    }
    static double Circle(double C){
        return 3.14159 * (C*C);
    }
    static double Trapezuim(double A, double B, double C){
        return 0.5 * (A + B) * C;
    }
    static double Square(double B){
        return B * B;
    }
    static double Regtangle(double A, double B){
        return A * B ;
    }
    
    static void GetTriangle(double Triangle){
      System.out.printf("TRIANGULO: %.3f\n", Triangle);}
    
    
    static void GetCircle(double Circle){
      System.out.printf("CIRCULO: %.3f\n", Circle);}
    
    
    static void GetTrapezuim(double Trapezuim){
      System.out.printf("TRAPEZIO: %.3f\n", Trapezuim);}
    
    
    static void GetSquare(double Square){
      System.out.printf("QUADRADO: %.3f\n", Square);}
    
    
    static void GetRegtangle(double Regtangle){
      System.out.printf("RETANGULO: %.3f\n", Regtangle);
    }
    
}
