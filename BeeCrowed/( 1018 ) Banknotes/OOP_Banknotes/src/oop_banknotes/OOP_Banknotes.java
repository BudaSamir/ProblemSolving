package oop_banknotes;

import java.util.Scanner;

public class OOP_Banknotes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int money = in.nextInt();
        note n = new note(money);
        n.print();
    }

}
