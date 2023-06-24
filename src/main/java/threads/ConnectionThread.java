package threads;

public class ConnectionThread implements Runnable {
    private final String name;

    public ConnectionThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            Connection connection = ConnectionPool.getInstance().getConnection();
            System.out.println("Thread " + name + " acquired Connection " + connection.getId());
            // Perform tasks with the acquired connection

            // Simulating some work
            Thread.sleep(1000);

            // Release the connection
            ConnectionPool.getInstance().releaseConnection(connection);
            System.out.println("Thread " + name + " released Connection " + connection.getId());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


