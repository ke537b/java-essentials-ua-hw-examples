package lesson4.task3;

public class Animal {
    private String type;
    private String name;

    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Animal %s. It`s name is %s", type, name);
    }
}
