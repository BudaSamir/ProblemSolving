package method_fuel;
import java.util.Scanner;
public class Method_fuel {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int time = in.nextInt();
        int speed = in.nextInt();
        print(fuel(time, speed));
    }
    
    static double fuel(int time , int speed){
        return (speed * time ) / 12.0 ;
    }
    
    static void print( double fuel){
        System.out.printf("%.3f\n",fuel);
    }
}
