package lesson4.task2;

public class LazyWorker extends Worker {
    @Override
    public void work(){
        System.out.println("Work a bit");
    }

    @Override
    public void relax(){
        System.out.println("Relax a lot");
    }

    @Override
    public void askMoney(){
        System.out.println("Ask x2 salary all time");
    }
}
