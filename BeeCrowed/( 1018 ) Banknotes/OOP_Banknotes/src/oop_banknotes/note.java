package oop_banknotes;

public class note {

    private int money;
    private int[] amount = {100, 50, 20, 10, 5, 2, 1};
    private int[] banknotes = new int[amount.length];

    note(int m) {

        this.money = m;
        System.out.println(money);

    }

    private void cal() {
        for (int i = 0; i < banknotes.length; i++) {
            banknotes[i] = money / amount[i];
            money = money - (banknotes[i] * amount[i]);
        }
    }

    void print() {
        cal();
        for (int i = 0; i < banknotes.length; i++) {
            System.out.println(banknotes[i] + " nota(s) de R$ " + amount[i] + ",00");
        }
    }

}
