package in.out_age.in.days;
import java.util.Scanner;
public class INOUT_AgeINDays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        int year = age / 365 ; 
        age = age - (year * 365);
        int month = age / 30 ;
        age = age - ( month * 30) ; 
        int days = age ; 
        System.out.println(year + " ano(s)\n"+ month + " mes(es)\n"+ days + " dia(s)");
        
    }
    
}
