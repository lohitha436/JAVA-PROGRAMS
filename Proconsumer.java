import java.util.LinkedList;
class ProducerConsumer {
    private final LinkedList<Integer> buffer = new LinkedList<>();
    private final int capacity;
    public ProducerConsumer(int capacity) {
        this.capacity = capacity;
    }
    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (this) {
                while (buffer.size() == capacity) wait();
                buffer.add(value);
                System.out.println("Produced: " + value++);
                notify(); // Notify consumer
            }
            Thread.sleep(1000); // Simulate production time
        }
    }
    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (buffer.isEmpty()) wait();
                int value = buffer.removeFirst();
                System.out.println("Consumed: " + value);
                notify(); // Notify producer
            }
            Thread.sleep(1500); // Simulate consumption time
        }
    }
}
public class Proconsumer {
    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer(5);
        new Thread(() -> {
            try { pc.produce(); 
            } 
            catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        }).start();
        new Thread(() -> {
            try { pc.consume(); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        }).start();
    }
}
