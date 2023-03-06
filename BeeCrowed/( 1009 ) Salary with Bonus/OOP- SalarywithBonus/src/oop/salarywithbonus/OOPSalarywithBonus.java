package oop.salarywithbonus;
import java.util.Scanner;
public class OOPSalarywithBonus {
    public static void main(String[] args) {
       Scanner in2 = new Scanner(System.in);
       Department[] Dep = new Department[1];
       for(int i = 0; i < 1; i++){
           String name = in2.next();
           int DepNo = in2.nextInt();
           Dep[i] = new Department(name, DepNo);
       }
       Dep[0].getInfo();
       Dep[0].Sallers();
       
    }
    
}
