package method_thegreatest;
import java.util.Scanner;
public class Method_TheGreatest {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.print("Enter The First Number :");
     int A = in.nextInt();
     System.out.print("Enter The Second Number :");
     int B = in.nextInt();
     System.out.print("Enter The Third Number :");
     int C = in.nextInt();
     int Greatest = Major(A,B,C);
     
     if (Greatest == A) System.out.println("The Greatest is The First Number " + A);
     else if (Greatest == B) System.out.println("The Greatest is The Second Number " + B);
     else if(Greatest == C) System.out.println("The Greatest is The Third Number " + C);
     else System.out.println("The Greatest is No Geartest");
    
    }
    
    static int Major(int A, int B, int C){
    int major =( A + B +  Math.abs(A-B) ) / 2;
    major =( major + C +  Math.abs(major-C) ) / 2;
    return major;
}
    
}
