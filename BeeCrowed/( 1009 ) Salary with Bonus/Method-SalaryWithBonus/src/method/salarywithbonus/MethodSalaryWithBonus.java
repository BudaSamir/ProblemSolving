package method.salarywithbonus;
import java.util.Scanner;
public class MethodSalaryWithBonus {
    static String[] Name = new String[3];
    static double[] FixedSalary = new double[3];
    static double[] Sales = new double[3]; 
    static double[] TotalSalary = new double[3];
    
    public static void main(String[] args) {
        
        getInfo();
        
        for(int a = 0; a < TotalSalary.length; a++){
            TotalSalary[a] = Total(FixedSalary[a], Sales[a]);
        }
        
        print( TotalSalary, Name); 
    }
    static void getInfo(){
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < Name.length; i++){
            Name[i] = in.next(); 
            FixedSalary[i] = in.nextDouble(); 
            Sales[i] = in.nextDouble();
        }
    }
    static double Total( double FixedSalary, double Sales ){
        return FixedSalary + (Sales *0.15);
    }
    static void print(double[] totalSalary, String[] Name){
        for(int k = 0; k < 3; k++){
        System.out.print("Neme = " + Name[k] );
        System.out.printf(" ---> TOTAL = R$ %.2f\n", totalSalary[k]);
        }
    }
}
