class NumberPrinter implements Runnable {
    private boolean printEven;
    public NumberPrinter(boolean printEven) {
        this.printEven = printEven;
    }
    @Override
    public void run() { //
// Both threads run the same run() method, but they behave differently based on the printEven flag.
        for (int i = 1; i <= 10; i++) {
            if (printEven && i % 2 == 0) {
                System.out.println("Even: " + i);
            } else if (!printEven && i % 2 != 0) {
                System.out.println("Odd: " + i);
            }
        }
    }
}

public class EvenOddDemo {
    public static void main(String[] args) {
        Thread evenThread = new Thread(new NumberPrinter(true));
        Thread oddThread = new Thread(new NumberPrinter(false));
        evenThread.start();
        oddThread.start();
    }
}
