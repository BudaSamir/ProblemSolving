package method_distancebetweentwopoints;
import java.util.Scanner;
public class Method_DistanceBetweenTwoPoints {
    static public Scanner in = new Scanner(System.in);
    static public double X1 , X2, Y1, Y2;
    public static void main(String[] args) {        
        FirstPoint();
        SecondPoint();
        print();
    }
    
    static void FirstPoint(){
         X1 = in.nextDouble();
         Y1 = in.nextDouble();        
    }
    static void SecondPoint(){
         X2 = in.nextDouble();
         Y2 = in.nextDouble();        
    }
    static double Distance(){
        return Math.sqrt( ((X2 - X1)*(X2 - X1)) + ((Y2 - Y1)*(Y2 - Y1)));
    }
    static void print(){
         System.out.printf("%.4f\n", Distance());
    }
    
}
