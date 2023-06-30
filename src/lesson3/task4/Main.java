package lesson3.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game instance;

        Scanner sc = new Scanner(System.in);
        System.out.print("Input game key > ");
        String userKey = sc.next();

        switch (userKey.toLowerCase()) {
            case "deluxe" -> instance = new DeluxeGame();
            case "extended" -> instance = new ExtendedGame();
            default -> instance = new Game();
        }

        instance.getBasicLoot();
        instance.getExtendedLoot();
        instance.getDeluxeLoot();
    }
}
