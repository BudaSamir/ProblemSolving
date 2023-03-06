package in.out_banknotes;
import java.util.Scanner;
public class INOUT_Banknotes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int money = in.nextInt();
        System.out.println(money);
        int[] banknotes = new int[7];
        int[] amount = {100, 50, 20, 10, 5, 2, 1};
        for(int i = 0; i< banknotes.length; i++){
            banknotes[i] = money /amount[i];
            money = money - (banknotes[i] * amount[i]);
            System.out.println(banknotes[i]  + " nota(s) de R$ " + amount[i]+ ",00");
        }       
    }
    
}
        /*  
        hundred = banknotes[0]
        Fifty  = banknotes[1]
        Twenty = banknotes[2]
        Ten = banknotes[3]
        Five = banknotes[4]
        Two = banknotes[5]
        One = banknotes[6]   
        */