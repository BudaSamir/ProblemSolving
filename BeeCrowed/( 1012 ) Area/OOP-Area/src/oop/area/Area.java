package oop.area;
public class Area {
    double A , B, C;
    
    Area(double A ,double B,double C){
    this.A = A;
    this.B = B;
    this.C = C;
    }
    double Triangle(double A, double C){
        return 0.5 * A * C;
    }
    double Circle(double C){
        return 3.14159 * (C*C);
    }
    double Trapezuim(double A, double B, double C){
        return 0.5 * (A + B) * C;
    }
    double Square(double B){
        return B * B;
    }
    double Regtangle(double A, double B){
        return A * B ;
    }
    
    void GetTriangle(double Triangle){
      System.out.printf("TRIANGULO: %.3f\n", Triangle);}
    
    
    void GetCircle(double Circle){
      System.out.printf("CIRCULO: %.3f\n", Circle);}
    
    
    void GetTrapezuim(double Trapezuim){
      System.out.printf("TRAPEZIO: %.3f\n", Trapezuim);}
    
    
    void GetSquare(double Square){
      System.out.printf("QUADRADO: %.3f\n", Square);}
    
    
    void GetRegtangle(double Regtangle){
      System.out.printf("RETANGULO: %.3f\n", Regtangle);
    }
    
}
