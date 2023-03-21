package game.time;

import java.util.Scanner;

public class GameTime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int duration;

        if (x == y) {
            duration = 24;
            System.out.println("O JOGO DUROU " + duration + " HORA(S)");
        } else if (x > y) {
            duration = 24 - x;
            duration = duration + y;
            System.out.println("O JOGO DUROU " + duration + " HORA(S)");
        } else if (y > x) {
            duration = y - x;

            System.out.println("O JOGO DUROU " + duration + " HORA(S)");
        }
    }
}
