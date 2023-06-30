package lesson3.task3;

public class Main {
    public static void main(String[] args){
       Animal animal = new Animal("Spider", "Gosha");
       System.out.println(animal);

       animal = new Cat("Cat", "Murzik", true);
       System.out.println(animal);

       animal = new Dog("Dog", "Rex", true);
       System.out.println(animal);
    }
}
