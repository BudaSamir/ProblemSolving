package triangleortrapizum;

import java.util.Scanner;

public class TriangleOrTrapizum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double A, B, C, a1, a2, a3, check, perimeter, Area;
        A = in.nextDouble();
        B = in.nextDouble();
        C = in.nextDouble();

        a1 = Math.acos( ((B * B) + (C * C) - (A * A)) / (2 * B * C)) ;
        a2 = Math.acos( ((A * A) + (C * C) - (B * B)) / (2 * A * C)) ;
        a3 = Math.acos( ((A * A) + (B * B) - (C * C)) / (2 * A * B)) ;
//        System.out.println(a1);
//        System.out.println(a2);
//        System.out.println(a3);

        check = a1 + a2 + a3;

        perimeter = A + B + C;

        Area = ((A + B) / 2) * C;

        if (check == 180.0) {
            System.out.printf("p = %.1f", perimeter);
        } else if (check == 360.0) {
            System.out.printf("Area = %.1f", Area);
        }

    }

}
