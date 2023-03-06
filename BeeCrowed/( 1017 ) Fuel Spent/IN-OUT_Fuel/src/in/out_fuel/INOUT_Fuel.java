package in.out_fuel;
import java.util.Scanner;
public class INOUT_Fuel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int time = in.nextInt();
        int speed = in.nextInt();
        double fuel = (speed * time ) / 12.0 ;
        System.out.printf("%.3f\n",fuel);
    }
    
}
