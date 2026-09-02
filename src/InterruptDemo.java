class TimerTask2 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Tick " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("Timer was interrupted! Stopping early.");
                return; // exit run() early
            }
        }
        System.out.println("Timer completed all ticks.");
    }
}

public class InterruptDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread timerThread = new Thread(new TimerTask2());
        timerThread.start();
        Thread.sleep(700);       // let it tick a couple times
        timerThread.interrupt(); // then interrupt it
    }
}
