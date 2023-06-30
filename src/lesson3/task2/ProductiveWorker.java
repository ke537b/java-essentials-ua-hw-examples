package lesson3.task2;

public class ProductiveWorker extends Worker {
    @Override
    public void work(){
        System.out.println("Work a lot");
    }

    @Override
    public void relax(){
        System.out.println("Relax a bit");
    }

    @Override
    public void askMoney(){
        System.out.println("Ask x2 salary for overworked job");
    }
}
