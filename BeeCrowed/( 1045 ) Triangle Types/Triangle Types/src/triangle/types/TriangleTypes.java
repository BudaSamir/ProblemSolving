package triangle.types;

import java.util.Scanner;

public class TriangleTypes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double A = in.nextDouble();
        double B = in.nextDouble();
        double C = in.nextDouble();
        double X;
        if (A > C && C > B || A > C && C > B) {
            X = B;
            B = C;
            C = X;
        } else if (B > A && A > C || B > A && A == C ) {
            X = A;
            A = B;
            B = X;
        } else if (C > B && B > A || C > B && B == A ) {
            X = A;
            A = C;
            C = X;
        } else if (B > C && C > A || B > C && C == A ) {
            X = A;
            A = B;
            B = X;
            X = C;
            C = B;
            B = X;
        } else if (C > A && A > B || C > A && A == B ) {
            X = A;
            A = C;
            C = X;
            X = B;
            B = C;
            C = X;
        }
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

        if (A >= (B + C)) {
            System.out.println("NAO FORMA TRIANGULO");

        } else if ((A * A) == ((B * B) + (C * C))) {
            System.out.println("TRIANGULO RETANGULO");

        } else if ((A * A) > ((B * B) + (C * C))) {
            System.out.println("TRIANGULO OBTUSANGULO");

        } else if ((A * A) < ((B * B) + (C * C))) {
            System.out.println("TRIANGULO ACUTANGULO");

        }

        if (A == B && B == C && A == C) {
            System.out.println("TRIANGULO EQUILATERO");

        } else if (A == B || B == C || A == C) {
            System.out.println("TRIANGULO ISOSCELES");

        }

    }

}
