package oop_distancebetweentwopoints;
public class Distance {
    private double X1 , X2, Y1, Y2;

    Distance(){
        System.out.print("The Distance between Two Points is ");
    }
    
    void SetFirstPoint(double X1, double Y1){
         this.X1 = X1;
         this.Y1 = Y1;        
    }
    void SetSecondPoint(double X2, double Y2){
         this.X2 = X2;
         this.Y2 = Y2;        
    }
    
    private double Distance(){
        return Math.sqrt( ((this.X2 - this.X1)*(this.X2 - this.X1)) + ((this.Y2 - this.Y1)*(this.Y2 - this.Y1)));
    }
    void GetDistance(){
         System.out.printf("%.4f\n", Distance());
    }
}
