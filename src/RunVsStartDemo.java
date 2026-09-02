class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Inside run() - executing task");
    }
}

public class RunVsStartDemo {
    public static void main(String[] args) {
        System.out.println("--- Calling .run() directly ---");
        MyThread t1 = new MyThread();
        System.out.println("Before run()");
        t1.run();
        System.out.println("After run()");

        System.out.println("--- Calling .start() ---");
        MyThread t2 = new MyThread();
        System.out.println("Before start()");
        t2.start();
        System.out.println("After start()");
    }
}
