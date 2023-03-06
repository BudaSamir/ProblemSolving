package oop_average2;
import java.util.Scanner;
public class Student {
    // Attributes
    public double[] Grades = new double[3];
    public double[] Weighted = {2.0,3.0,5.0};
    private double SumG = 0 , SumW = 0;
    // Constructures
    public Student(){
    }
    
    public void SetGrades(){
       Scanner in = new Scanner(System.in);
       for(int i = 0; i < this.Grades.length; i++)
           this.Grades[i]= in.nextDouble();
    }
    public double GetAverage(){
        for(int i = 0; i < this.Grades.length; i++){
            this.SumG = this.SumG + (this.Grades[i] * this.Weighted[i] ) ;
            this.SumW = this.SumW +  this.Weighted[i];
        }
        return ( this.SumG / this.SumW);
    }
}
