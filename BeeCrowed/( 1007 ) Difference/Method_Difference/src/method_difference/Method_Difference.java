package method_difference;
import java.util.Scanner;
public class Method_Difference {
    public static void main(String[] args) {
        int[] NUM = new int[4];
        fill(NUM);
        System.out.println(diff(NUM));
    }
    static void fill(int[] arr){
        Scanner in = new Scanner(System.in);
        for(int i = 0; i<arr.length; i++)
            arr[i]= in.nextInt();
    }
    static int diff(int[]num){
        int prod1 = 1, prod2 = 1;
        for(int i = 0; i < num.length; i++){
            if( i == 0 || i == 1)
                prod1 = prod1 * num[i];
            else if ( i == 2 || i == 3)
                prod2 = prod2 * num[i];
        }
        return (prod1 - prod2);
    }
}
