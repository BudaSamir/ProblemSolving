package oop.sphere;
import java.util.Scanner;
public class OOPSphere {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       for(int i = 0; i<=2; i++){
       double R = in.nextDouble();
       Sphere[] V = new Sphere[3]; // array 
       V[i] = new Sphere(R); // objects
       V[i].GetVolume( V[i].Volume(R));
       }
    }
    
}
