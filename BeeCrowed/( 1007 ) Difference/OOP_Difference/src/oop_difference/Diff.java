package oop_difference;
import java.util.Scanner;
public class Diff {
    private int[] Num = new int[4];
    
    public Diff(){
    }
    
    public void SetNums(){
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < this.Num.length; i++)
            this.Num[i] = in.nextInt();
    }
    public int Difference(){
        int prod1 = 1, prod2 = 1;
        for(int i = 0; i < this.Num.length; i++){
            if( i == 0 || i == 1 ) prod1 = prod1 * Num[i];
            else if ( i == 2 || i == 3 ) prod2 = prod2 * Num[i];        
        }         
        return prod1 - prod2;
    }
}
