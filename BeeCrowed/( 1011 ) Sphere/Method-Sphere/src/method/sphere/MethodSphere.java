package method.sphere;
import java.util.Scanner;
public class MethodSphere {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       for(int i = 0; i<=2;i++){
       double R = in.nextDouble();
       GetVolume(Volume(R));}
    }
    static double Volume(double R){
        return (4.0/3)*(3.14159)*(R*R*R);
    }
    static void GetVolume(double V){
    System.out.printf("VOLUME = %.3f\n",V);
    }
}
