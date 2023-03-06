package averager1;
import java.util.Scanner;
public class Averager1 {
    static Scanner in = new Scanner(System.in);
    static double Sum = 0 , weightSum = 0 , grade , weight;
    public static void main(String[] args) {
        
        op();
        System.out.printf("MEDIA = %.5f\n",Avg(Sum,weightSum));
        
    }
    static double weightedGrade(double grade, double weight){ return grade * weight;}
    static void op(){
        for(int i = 1; i<=2; i++){
           grade = in.nextDouble();
           weight = in.nextDouble();
           Sum = Sum + weightedGrade(grade,weight);
           weightSum = weightSum + weight;
        }
    }
    static double Avg(double Sum, double WSum){return Sum / WSum;}
    
}
/*
double A = in.nextDouble(), B = in.nextDouble();
        double Avg = ((A * 3.5) + (B * 7.5)) / (3.5 + 7.5) ; 
        System.out.printf("MEDIA = %.5f\n",Avg);
*/
