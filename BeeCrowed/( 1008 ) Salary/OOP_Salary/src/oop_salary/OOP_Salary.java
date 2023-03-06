package oop_salary;
public class OOP_Salary {
    public static void main(String[] args) {
       employee[] list = new employee[3];
       
       for(int i = 0; i < list.length; i++){
           list[i]= new employee();
       }
       
       for(int i = 0; i< list.length; i++){
           list[i].setinfo();
           System.out.println(list[i].EmployeeNum);
           System.out.println(list[i].salary());
       }
    }
    
}
