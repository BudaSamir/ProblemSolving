package in.out_distancebetweentwopoints;
import java.util.Scanner;
public class INOUT_DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double X1 = in.nextDouble();
        double Y1 = in.nextDouble();
        double X2 = in.nextDouble();
        double Y2 = in.nextDouble();
        double Distance = Math.sqrt( ((X2 - X1)*(X2 - X1)) + ((Y2 - Y1)*(Y2 - Y1)));
        System.out.printf("%.4f\n", Distance);
    }
              
}
