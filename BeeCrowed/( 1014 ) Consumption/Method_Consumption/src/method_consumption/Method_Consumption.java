package method_consumption;
import java.util.Scanner;
public class Method_Consumption {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int km = in.nextInt();
        double liter = in.nextDouble();
        double avg = Avg(km,liter);
        print(avg);
    }

    static double Avg( int km , double lit) {
        return km / lit ;
    }
    static void print(double res){
        System.out.printf("%.3f km/l\n", res);
    }
    
}
