package simplecalculate;
import java.util.Scanner;
public class SimpleCalculate {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int prod1_code, prod2_code, prod1_units, prod2_units;
       double prod1_price, prod2_price, paid1, paid2;
       
       prod1_code = in.nextInt();
       prod1_units = in.nextInt();
       prod1_price = in.nextDouble();
       
       prod2_code = in.nextInt();
       prod2_units = in.nextInt();
       prod2_price = in.nextDouble();
       
       paid1 = prod1_units * prod1_price;
       paid2 = prod2_units * prod2_price;
       
       System.out.printf("VALOR A PAGAR: R$ %.2f\n", (paid1+paid2));
    }
    
}
