package banknotes.and.coins;

import java.util.Scanner;

public class BanknotesAndCoins {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double money = in.nextDouble();
        //100
        double hund = money / 100;
        money = money - ((int) hund * 100);
        //50
        double fif = money / 50;
        money = money - ((int) fif * 50);
        //20
        double twin = money / 20;
        money = money - ((int) twin * 20);
        //10
        double ten = money / 10;
        money = money - ((int) ten * 10);
        //5
        double five = money / 5;
        money = money - ((int) five * 5);
        //2
        double two = money / 2;
        money = money - ((int) two * 2);
        //1
        double one = money / 1;
        money = money - ((int) one * 1);
        int coins = (int) (money * 100);
        //0.50
        int half = coins / 50;
        coins = coins - ( half * 50);
        //0.25
        int quar = coins / 25;
        coins = coins - ( quar * 25);
        //0.10
        int tenper = coins /10;
        coins = coins - (tenper * 10);
        //0.0.5
        int fiveper = coins / 5;
        coins = coins - (fiveper * 5);
        //0.0.1
        int oneper = coins / 1;
        coins = coins - (oneper * 1);

        System.out.println("NOTAS:");
        System.out.println((int)hund + " nota(s) de R$ 100.00");
        System.out.println((int)fif + " nota(s) de R$ 50.00");
        System.out.println((int)twin + " nota(s) de R$ 20.00");
        System.out.println((int)ten + " nota(s) de R$ 10.00");
        System.out.println((int)five + " nota(s) de R$ 5.00");
        System.out.println((int)two + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println((int)one + " nota(s) de R$ 1.00");
        System.out.println(half + " nota(s) de R$ 0.50");
        System.out.println(quar + " nota(s) de R$ 0.25");
        System.out.println(tenper + " nota(s) de R$ 0.10");
        System.out.println(fiveper + " nota(s) de R$ 0.05");
        System.out.println(oneper + " nota(s) de R$ 0.01");

    }

}
