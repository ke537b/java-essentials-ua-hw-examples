package lesson4.task2;

public class Main {
    public static void main(String[] args){
        var office = new Office(
                new LazyWorker(), new ProductiveWorker()
        );
        office.showInfo();

        office = new Office(
                new StudentWorker(),
                new Worker(),
                new ProductiveWorker()
        );
        office.showInfo();
    }
}
