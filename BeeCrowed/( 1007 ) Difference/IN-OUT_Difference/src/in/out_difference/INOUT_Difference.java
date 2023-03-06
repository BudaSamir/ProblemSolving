package in.out_difference;
import java.util.Scanner;
public class INOUT_Difference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt(), B = in.nextInt(), C = in.nextInt(), D = in.nextInt();
        System.out.println("DIFERENCA = " + ( A*B - C*D ));
    }
    
}
