package simpleproduct;
import java.util.Scanner;
public class SimpleProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt(), B = in.nextInt();
        int PROD = PROD(A,B);
        System.out.printf("PROD = %d\n", PROD);
    }
    static int PROD(int A, int B){
        return A * B ; 
    }
}
