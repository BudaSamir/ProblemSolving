package method_salary;
import java.util.Scanner;
public class Method_Salary {
    static int EmployeeNum , WorkedHours;
    static double Cost;
    public static void main(String[] args) {
      GetInfo();
      System.out.println("NUMBER = " + EmployeeNum);
      System.out.printf("SALARY = U$ %.2f\n", salary() );
    }
    static void GetInfo(){
      Scanner in = new Scanner(System.in);
        EmployeeNum = in.nextInt();
        WorkedHours = in.nextInt();
        Cost = in.nextDouble();
    }
    static double salary(){
        return (WorkedHours * Cost);
    }
    
}
