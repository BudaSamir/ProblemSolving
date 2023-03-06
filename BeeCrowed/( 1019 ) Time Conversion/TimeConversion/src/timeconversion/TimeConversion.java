package timeconversion;
import java.util.Scanner;
public class TimeConversion {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int time = in.nextInt();
       int hour = time / 3600;
       time = time -(hour * 3600);
       int min = time / 60;
       time = time -(min * 60);
       int sec = time;
       System.out.println(hour + ":" + min + ":" + sec);
    }
    
}
