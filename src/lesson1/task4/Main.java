package lesson1.task4;

public class Main {

    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        for(int i =0; i< cats.length; i++){
            cats[i] = new Cat("CatName" + i);
        }

        for(Cat cat: cats){
            System.out.println(cat);
        }
    }
}
