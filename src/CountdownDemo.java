//CO4 THREAD TASK 02/09/26
class CountdownThread extends Thread {
    private String threadName;
    public CountdownThread(String name) {
        this.threadName = name;
    }
    @Override
    public void run() {
        for (int i = 5; i >= 1; i--) {
            System.out.println(threadName + " - Countdown: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted");
            }
        }
        System.out.println(threadName + " finished!");
    }
}

public class CountdownDemo {
    public static void main(String[] args) {
        CountdownThread t1 = new CountdownThread("Countdown-A");
        CountdownThread t2 = new CountdownThread("Countdown-B");
        t1.start();
        t2.start();
        System.out.println("Main thread continues...");
    }
}
