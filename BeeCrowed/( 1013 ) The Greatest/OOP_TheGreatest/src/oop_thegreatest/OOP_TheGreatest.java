package oop_thegreatest;
import java.util.Scanner;
public class OOP_TheGreatest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The First Number :");
        int A = in.nextInt();
        System.out.print("Enter The Second Number :");
        int B = in.nextInt();
        System.out.print("Enter The Third Number :");
        int C = in.nextInt();
        Major Greatest = new Major(A,B,C);
        Greatest.Get_TheGreatest();
    }
    
}
