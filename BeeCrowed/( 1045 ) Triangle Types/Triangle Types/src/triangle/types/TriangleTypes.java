package triangle.types;

import java.util.Scanner;

public class TriangleTypes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double A = in.nextDouble();
        double B = in.nextDouble();
        double C = in.nextDouble();

        if (A >= (B + C)) {
            System.out.println("NAO FORMA TRIANGULO");

        } else if ((A * A) == (B * B) + (C * C)) {
            System.out.println("TRIANGULO RETANGULO");

        } else if ((A * A) > (B * B) + (C * C)) {
            System.out.println("TRIANGULO OBTUSANGULO");

        } else if ((A * A) < (B * B) + (C * C)) {
            System.out.println("TRIANGULO ACUTANGULO");

        }
        if (A == B && B == C && A == C) {
            System.out.println("TRIANGULO EQUILATERO");

        } else if (A == B || B == C || A == C) {
            System.out.println("TRIANGULO ISOSCELES");

        }
    }

}
