package oop_distancebetweentwopoints;

import java.util.Scanner;

public class OOP_DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double X1 = in.nextDouble();
        double Y1 = in.nextDouble();
        double X2 = in.nextDouble();
        double Y2 = in.nextDouble();
        Distance Dis = new Distance();
        
        Dis.SetFirstPoint(X1, Y1);
        Dis.SetSecondPoint(X2, Y2);
        Dis.GetDistance();
    }
    
}
