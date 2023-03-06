package oop_fuel;
public class car {
    int speed;
    int time; 
    
    car(int s , int t){
    this.speed = s;
    this.time = t;
    }
     private double fuel(){
        return (this.speed * this.time ) / 12.0 ;
    }
    
    void print(){
        System.out.printf("%.3f\n",fuel());
    }
}
