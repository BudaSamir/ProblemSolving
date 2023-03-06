package average2;
import java.util.Scanner;
public class Average2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double A = in.nextDouble(), B = in.nextDouble(), C = in.nextDouble();
        System.out.printf("MEDIA = %.1f\n", ( (A*2.0) + (B*3.0) + (C*5.0) ) / (2.0+3.0+5.0) );
    }
    
}
