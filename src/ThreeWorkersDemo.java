
class Worker implements Runnable {
    private String taskName;
    private int loopCount;
    public Worker(String taskName, int loopCount) {
        this.taskName = taskName;
        this.loopCount = loopCount;
    }
    @Override
    public void run() {
        for (int i = 1; i <= loopCount; i++) {
            System.out.println(taskName + " - step " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(taskName + " interrupted");
            }
        }
        System.out.println(taskName + " done!");
    }
}

public class ThreeWorkersDemo {
    public static void main(String[] args) {
        Thread w1 = new Thread(new Worker("Worker-1", 3));
        Thread w2 = new Thread(new Worker("Worker-2", 5));
        Thread w3 = new Thread(new Worker("Worker-3", 4));
        w1.start();
        w2.start();
        w3.start();
    }
}

