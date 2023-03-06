package oop_consumption;

public class Consum {
    int km ;
    double liter;
    
    Consum(int k, double liter){
    this.km = k ; 
    this.liter = liter;
    }
    private double Avg() {
        return (this.km / this.liter) ;
    }
    void print(){
        System.out.printf("%.3f km/l\n", Avg());
    }
}
