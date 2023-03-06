package method_banknotes;
import java.util.Scanner;
public class Method_Banknotes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int money = in.nextInt();
        System.out.println(money);
        int[] amount = {100, 50, 20, 10, 5, 2, 1};
        int[] banknotes = new int[amount.length];   
        cal(banknotes, amount, money);
    }
    
    static void cal(int[] banknotes, int[] amount, int money){
     for(int i = 0; i< banknotes.length; i++){
            banknotes[i] = money /amount[i];
            money = money - (banknotes[i] * amount[i]);
            System.out.println(banknotes[i]  + " nota(s) de R$ " + amount[i]+ ",00");
        }       
    }
    
}
