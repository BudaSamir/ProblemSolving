package oop.area;
import java.util.Scanner;
public class OOPArea {
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
     
     for(int i = 0; i<=1; i++){
        double A = in.nextDouble(), B = in.nextDouble(), C = in.nextDouble();
        Area[] AR = new Area[2];
        AR[i]= new Area(A,B,C);
        AR[i].GetTriangle(AR[i].Triangle(A,C));
        AR[i].GetCircle(AR[i].Circle(C));
        AR[i].GetTrapezuim(AR[i].Trapezuim(A,B,C));
        AR[i].GetSquare(AR[i].Square(B));
        AR[i].GetRegtangle(AR[i].Regtangle(A,B));
 
        }
    }   
}
