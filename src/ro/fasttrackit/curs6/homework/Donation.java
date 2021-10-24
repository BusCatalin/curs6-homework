package ro.fasttrackit.curs6.homework;

import java.util.Random;

public class Donation {
    public static void main(String[] args) {
        campaign();
    }

    public static void campaign() {
        Random random = new Random();
        int numarDonatii = 0;
        int maxim = 5000;
        int money = 0;
        while (money <maxim && numarDonatii<10) {
            if (numarDonatii<10) {
                money = money + random.nextInt(500);
                numarDonatii++;
                System.out.println("Current amount: " + money);
            }
        }
        System.out.println("Money raised: " + money);
    }
}
