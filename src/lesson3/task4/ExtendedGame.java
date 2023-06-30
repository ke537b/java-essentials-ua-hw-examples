package lesson3.task4;

public class ExtendedGame extends Game {

    @Override
    public void getExtendedLoot() {
        System.out.println("Rare loot collected");
    }

    @Override
    public void getDeluxeLoot() {
        System.out.println("Deluxe loot preview. To collect deluxe loot get deluxe edition");
    }

}
