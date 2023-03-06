package in.out.sphere;
import java.util.Scanner;
public class INOUTSphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double R = in.nextDouble();
        double V = (4.0/3)*(3.14159)*(R*R*R);
        System.out.printf("VOLUME = %.3f\n",V);
    }
    
}
