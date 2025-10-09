
//----------------------------------Even And Odd-----------------------------------------------------------------
import java.util.LinkedList;
import java.util.*;
import java.lang.*;
import java.util.Queue;
import java.util.Scanner;

class PrintNumbers {
    int count = 1;
    static final int MAX = 10;

    public synchronized void printEven() {
        while (count <= MAX) {
            if (count % 2 != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println(Thread.currentThread().getName() + ": " + count++);
            notify();
        }
    }

    public synchronized void printOdd() {
        while (count < MAX) {
            if (count % 2 == 0) { // If it's an even number, wait
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println(Thread.currentThread().getName() + ": " + count++);
            notify(); 
        }
    }
}

 class AlternatePrinting {
    public static void main(String[] args) {
        PrintNumbers pn = new PrintNumbers();
        Thread oddThread = new Thread(pn::printOdd, "OddThread");
        Thread evenThread = new Thread(pn::printEven, "EvenThread");

        oddThread.start();
        evenThread.start();
    }
}

//----------------------Consumer And Producer Concept------------------------------------------------------------
class ProducerConsumerExample {

    private int capacity;
    private Queue<Integer> queue = new LinkedList<>();

    public ProducerConsumerExample(int capacity) {
        this.capacity = capacity;
    }

    
    public synchronized void produce(int value) throws InterruptedException {
        while (queue.size() == capacity) {
            wait();  
        }
        queue.add(value);
        System.out.println("Producer produced: " + value);
        notifyAll();
    }

    // Consumer method
    public synchronized void consume() throws InterruptedException {
        while (queue.isEmpty()) { 
            wait();
        }
        int value = queue.poll();
        System.out.println("Consumer consumed: " + value);
        notifyAll();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter queue capacity: ");
        int capacity = sc.nextInt();

        System.out.print("Enter number of items to produce/consume: ");
        int n = sc.nextInt();
        ProducerConsumerExample pc = new ProducerConsumerExample(5);

        
        Thread producerThread = new Thread(() -> {
            try {
                for (int i = 0; i <= n; i++) {
                    pc.produce(i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

       
        Thread consumerThread = new Thread(() -> {
            try {
                for (int i = 0; i <= 10; i++) {
                    pc.consume();
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}


