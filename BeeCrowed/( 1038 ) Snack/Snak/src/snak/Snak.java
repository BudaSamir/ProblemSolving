package snak;
import java.util.Scanner;
public class Snak {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int X = in.nextInt();
      int Y = in.nextInt();
      switch(X){
          case 1 -> System.out.printf("Total: R$ %.2f\n", (Y * 4.00) );
          
          case 2 -> System.out.printf("Total: R$ %.2f\n", (Y * 4.50) );
          
          case 3 -> System.out.printf("Total: R$ %.2f\n", (Y * 5.00) );
          
          case 4 -> System.out.printf("Total: R$ %.2f\n", (Y * 2.00) );
          
          case 5 -> System.out.printf("Total: R$ %.2f\n", (Y * 1.50) );
      }
    }
    
}
