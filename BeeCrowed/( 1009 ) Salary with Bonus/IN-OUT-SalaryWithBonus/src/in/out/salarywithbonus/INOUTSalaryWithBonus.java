package in.out.salarywithbonus;
import java.util.Scanner;
public class INOUTSalaryWithBonus {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       String Name = in.next(); 
       double FixedSalary = in.nextDouble(), Sales = in.nextDouble(), totalSalary = FixedSalary + (Sales *0.15);
       System.out.printf("TOTAL = R$ %.2f\n", totalSalary);
       
    }
    
}
