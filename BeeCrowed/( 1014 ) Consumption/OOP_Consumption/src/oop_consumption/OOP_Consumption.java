package oop_consumption;

import java.util.Scanner;

public class OOP_Consumption {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int km = in.nextInt();
      double liter = in.nextDouble();
      Consum c = new Consum(km, liter);
      c.print();
    }
    
}
