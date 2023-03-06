package in.out_salary;
import java.util.Scanner;
public class INOUT_Salary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int EmployeeNum = in.nextInt(), WorkedHours = in.nextInt();
        double cost = in.nextDouble();
        System.out.println("NUMBER = " + EmployeeNum);
        System.out.printf("SALARY = U$ %.2f\n", (WorkedHours*cost) );
    }
    
}
