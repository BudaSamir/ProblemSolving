package oop.sphere;
public class Sphere {
    double R;
    Sphere(double R){
    this.R = R;
    }
    double Volume(double R){
        return (4.0/3)*(3.14159)*(R*R*R);
    }
    void GetVolume(double V){
    System.out.printf("VOLUME = %.3f\n",V);
    }
}
