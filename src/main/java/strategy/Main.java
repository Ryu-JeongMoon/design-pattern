package strategy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("seed1");
        int seed1 = scanner.nextInt();

        System.out.println("seed2");
        int seed2 = scanner.nextInt();
        Player hana = new Player("hana", new WinningStrategy(seed1));
        Player duri = new Player("duri", new ProbStrategy(seed2));

        for (int i = 0; i < 10000; i++) {
            Hand nextHand1 = hana.nextHand();
            Hand nextHand2 = duri.nextHand();
            if (nextHand1.isStrongerThan(nextHand2)) {
                System.out.println("Winner : = " + hana);
                hana.win();
                duri.lose();
            } else if (nextHand2.isStrongerThan(nextHand1)) {
                System.out.println("Winner : = " + duri);
                hana.lose();
                duri.win();
            } else {
                System.out.println("Even...");
                hana.even();
                duri.even();
            }
        }
        System.out.println("Total Result : ");
        System.out.println(hana);
        System.out.println(duri);
    }
}
