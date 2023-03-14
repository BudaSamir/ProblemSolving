package coordinates.of.a.point;

    import java.util.Scanner;

public class CoordinatesOfAPoint {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else {
            if (x > 0 && y > 0) {
                System.out.println("Q1");

            } else if (x < 0 && y < 0) {
                System.out.println("Q3");

            } else if (x < 0 && y > 0) {
                System.out.println("Q2");

            } else if (x > 0 && y < 0) {
                System.out.println("Q4");

            } else if ((x > 0 || x < 0) && y == 0) {
                System.out.println("Eixo X");

            } else if (x == 0 && (y > 0 || y < 0)) {
                System.out.println("Eixo Y");

            }
        }
    }

}
