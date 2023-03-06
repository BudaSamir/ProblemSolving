package oop_fuel;
import java.util.Scanner;
public class OOP_FUEL {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int time = in.nextInt();
        int speed = in.nextInt();
        car c = new car(speed , time);
        c.print();
    }
    
}
