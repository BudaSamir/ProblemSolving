package in.out_thegreatest;
import java.util.Scanner;
public class INOUT_TheGreatest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int Major =( A + B +  Math.abs(A-B) ) / 2; 
        Major =( Major + C +  Math.abs(Major-C) ) / 2; 
        System.out.println(Major + " eh o maior");

    }
    
}
