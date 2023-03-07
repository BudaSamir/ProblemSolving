package bhaskara.s.formula;

import java.util.Scanner;

public class BhaskaraSFormula {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double A = in.nextDouble();
        double B = in.nextDouble();
        double C = in.nextDouble();

        double R1 = (-B + Math.sqrt((B * B) - 4 * A * C)) / (2 * A);
        double R2 = (-B - Math.sqrt((B * B) - 4 * A * C)) / (2 * A);

        if (Double.isNaN(R1) || Double.isNaN(R2) || Double.isInfinite(R1) || Double.isInfinite(R2)) {
            System.out.println("Impossivel calcular");
        } else {
            System.out.printf("R1 = %.5f\n", R1);
            System.out.printf("R2 = %.5f\n", R2);
        }

    }

}
