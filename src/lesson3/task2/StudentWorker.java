package lesson3.task2;

public class StudentWorker extends Worker {
    @Override
    public void work(){
        System.out.println("Work all time");
    }

    @Override
    public void relax(){
        System.out.println("Sleep no more than needed");
    }

    @Override
    public void askMoney(){
        System.out.println("Ask for food");
    }
}
