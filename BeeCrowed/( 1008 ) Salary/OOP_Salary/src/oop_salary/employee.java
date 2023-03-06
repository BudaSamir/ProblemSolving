package oop_salary;
import java.util.Scanner;
public class employee {
   public int EmployeeNum , WorkedHours;
   private double Cost;
   
   public employee(){
   }
   
   public void setinfo(){
      Scanner in = new Scanner(System.in);
      this.EmployeeNum = in.nextInt();
      this.WorkedHours = in.nextInt();
      this.Cost = in.nextDouble();
   }
   public double salary(){
       return (this.WorkedHours * this.Cost);
   }
   
}
