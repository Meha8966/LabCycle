class Worker implements Runnable {

    String taskName;
    int loopCount;

    Worker(String taskName, int loopCount) {
        this.taskName = taskName;
        this.loopCount = loopCount;
    }

    public void run() {

        for (int i = 1; i <= loopCount; i++) {

            System.out.println(taskName + " - step " + i);

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(new Worker("Task A", 3));
        Thread t2 = new Thread(new Worker("Task B", 5));
        Thread t3 = new Thread(new Worker("Task C", 4));

        t1.start();
        t2.start();
        t3.start();
    }
}