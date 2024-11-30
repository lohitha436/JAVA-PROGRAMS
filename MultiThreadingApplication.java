import java.util.Random;

class Even implements Runnable {
    public int x;

    // Constructor to accept the number
    public Even(int x) {
        this.x = x;
    }

    @Override
    public void run() {
        // Print the square of the even number
        System.out.println("New Thread: " + x + " is EVEN and Square of " + x + " is: " + x * x);
    }
}

class Odd implements Runnable {
    public int x;

    // Constructor to accept the number
    public Odd(int x) {
        this.x = x;
    }

    @Override
    public void run() {
        // Print the cube of the odd number
        System.out.println("New Thread: " + x + " is ODD and Cube of " + x + " is: " + x * x * x);
    }
}

class A extends Thread {
    @Override
    public void run() {
        int num = 0;
        Random r = new Random();
        try {
            for (int i = 0; i < 5; i++) {
                // Generate a random number between 0 and 100
                num = r.nextInt(100);
                System.out.println("Main Thread and Generated Number is " + num);

                // Check if the number is even or odd
                if (num % 2 == 0) {
                    // If even, create and start the Even thread
                    Thread t1 = new Thread(new Even(num));
                    t1.start();
                } else {
                    // If odd, create and start the Odd thread
                    Thread t2 = new Thread(new Odd(num));
                    t2.start();
                }

                // Sleep for 1 second before generating the next number
                Thread.sleep(1000);
                System.out.println("--------------------------------------");
            }
        } catch (Exception ex) {
            // Catch any exceptions and print the message
            System.out.println(ex.getMessage());
        }
    }
}

public class MultiThreadApplication {
    public static void main(String[] args) {
        // Create and start the main thread
        A a = new A();
        a.start();
    }
}
