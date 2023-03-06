package consumption;
import java.util.Scanner;
public class Consumption {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int km = in.nextInt();
        double liter = in.nextDouble();
        double Avg = km / liter ;
        System.out.printf("%.3f km/l\n", Avg);
    }
    
}
