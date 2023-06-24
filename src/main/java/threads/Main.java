package threads;

public class Main {
    public static void main(String[] args) {
        // Create and start the threads
        Thread thread1 = new Thread(new ConnectionThread("Thread 1"));
        Thread thread2 = new Thread(new ConnectionThread("Thread 2"));

        thread1.start();
        thread2.start();
    }
}
