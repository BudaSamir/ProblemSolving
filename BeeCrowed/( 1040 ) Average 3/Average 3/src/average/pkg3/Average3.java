package average.pkg3;

import java.util.Scanner;

public class Average3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n1 = in.nextDouble();
        double n2 = in.nextDouble();
        double n3 = in.nextDouble();
        double n4 = in.nextDouble();
        double Avg = ((n1 * 2.0) + (n2 * 3.0) + (n3 * 4.0) + (n4 * 1)) / (2.0 + 3.0 + 4.0 + 1.0);
        if (Avg >= 7.0) {
            System.out.println("Media: " + Avg);
            System.out.println("Aluno aprovado.");

        } else if (Avg >= 5.0 && Avg <= 6.9) {
            System.out.printf("Media: %.1f\n" , Avg);
            System.out.println("Aluno em exame.");
            double n5 = in.nextDouble();
            System.out.printf("Nota do exame: %.1f\n" , n5);
            Avg = (Avg + n5)/2;
            if (Avg >= 5.0) {
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n" , Avg);

            } else {
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f\n" , Avg);

            }
        } else {
            System.out.printf("Media: %.1f\n" , Avg);
            System.out.println("Aluno reprovado.");
        }
    }

}
