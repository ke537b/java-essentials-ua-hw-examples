package lesson3.task2;

public class Office {
    private Worker[] workers;

    public Office(Worker w1, Worker w2){
        this.workers = new Worker[2];
        workers[0] = w1;
        workers[1] = w2;
    }

    public Office(Worker w1, Worker w2, Worker w3){
        this.workers = new Worker[3];
        workers[0] = w1;
        workers[1] = w2;
        workers[2] = w3;
    }

    public void showInfo(){
        for(int i = 0; i < workers.length; i++){
            System.out.printf("Worker %d info:", i);
            workers[i].work();
            workers[i].relax();
            workers[i].askMoney();
        }
    }
}
