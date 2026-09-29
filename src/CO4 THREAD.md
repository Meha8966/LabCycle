**CO4 THREAD**

class NumberPrinter implements Runnable {

&#x20;   boolean printEven;



&#x20;   // Constructor

&#x20;   NumberPrinter(boolean printEven) {

&#x20;       this.printEven = printEven;

&#x20;   }



&#x20;   @Override

&#x20;   public void run() {

&#x20;       for (int i = 1; i <= 10; i++) {

&#x20;           if (printEven \&\& i % 2 == 0) {

&#x20;               System.out.println("Even: " + i);

&#x20;           } 

&#x20;           else if (!printEven \&\& i % 2 != 0) {

&#x20;               System.out.println("Odd: " + i);

&#x20;           }

&#x20;       }

&#x20;   }

}



public class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       NumberPrinter even = new NumberPrinter(true);

&#x20;       NumberPrinter odd = new NumberPrinter(false);



&#x20;       Thread t1 = new Thread(even);

&#x20;       Thread t2 = new Thread(odd);



&#x20;       t1.start();

&#x20;       t2.start();

&#x20;   }

}

