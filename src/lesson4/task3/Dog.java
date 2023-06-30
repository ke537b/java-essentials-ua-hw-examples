package lesson4.task3;

public class Dog extends Animal{

    private Boolean isGoodPuppy;
    public Dog(String type, String name, Boolean isGoodPuppy) {
        super(type, name);
        this.isGoodPuppy = isGoodPuppy;
    }

    @Override
    public String toString() {
        return super.toString() + ". Is good puppy: " + isGoodPuppy;
    }
}
