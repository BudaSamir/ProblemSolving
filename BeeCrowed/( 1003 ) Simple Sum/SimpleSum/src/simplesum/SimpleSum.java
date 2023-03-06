package simplesum;
import java.util.Scanner;
public class SimpleSum {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int A = in.nextInt(), B = in.nextInt();
       int SOMA = SOMA(A,B);
       System.out.println("SOMA = " + SOMA );
    }
    static int SOMA(int A, int B){
        return A + B;
    }
    
}
