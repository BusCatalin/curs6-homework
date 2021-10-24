package ro.fasttrackit.curs6.homework;

import java.util.Random;

public class Donations {
    public static void main(String[] args) {
        target();
    }

    public static void target() {
        Random donation = new Random();
        int total = 10000;
        int win = 0;
        int i = 0;
        do {
            win = win + donation.nextInt(250);
            System.out.println("Current amount: " + win);
        }
        while (win < total);
        System.out.println("Congratz,you reached the target: " + win);
    }

}

