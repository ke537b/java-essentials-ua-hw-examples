package lesson4.task3;

public class Cat extends Animal{

    private Boolean isLoveToPurr;
    public Cat(String type, String name, Boolean isLoveToPurr) {
        super(type, name);
        this.isLoveToPurr = isLoveToPurr;
    }

    @Override
    public String toString() {
        return super.toString() + ". Is love to purr: " + isLoveToPurr;
    }
}
