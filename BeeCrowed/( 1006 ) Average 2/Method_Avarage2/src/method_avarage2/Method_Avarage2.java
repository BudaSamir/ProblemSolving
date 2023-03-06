package method_avarage2;
import java.util.Scanner;
public class Method_Avarage2 {
    public static void main(String[] args) {
        double[] grade = new double[3];
        double[] weight = {2.0,3.0,5.0};
        double sumG = 0, sumW = 0;
        setarr(grade);
        System.out.printf("MEDIA = %.1f \n", weightedGrade(grade,weight,sumG,sumW) );
    }
    static void setarr(double[] arr){
        Scanner in = new Scanner(System.in);
        for(int i = 0; i<arr.length;i++){
            arr[i] = in.nextDouble();
        }  
    }
    static double weightedGrade(double[] G, double[] w, double sumG, double sumW){
        for(int i = 0; i< G.length; i++){
            sumG = sumG + (G[i]*w[i]);
            sumW = sumW + w[i];
        }
        return (sumG / sumW);
    } 
    
}
/*
    Scanner in = new Scanner(System.in);
    double[] grade = new double[3];
    double[] weight = {2.0,3.0,5.0};
    double sumG = 0, SumW = 0;
        for(int i = 0; i<grade.length; i++){
            grade[i]= in.nextDouble();
            sumG = sumG + (grade[i]*weight[i]);
            SumW = SumW + weight[i];
        }
        System.out.printf("MEDIA = %.1f \n", (sumG / SumW) );
*/