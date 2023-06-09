package myData.connectionPool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Queue;

public class ConnectionPool {
    private static final String DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/mydatabase";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "password";
    private static final int MAX_POOL_SIZE = 10;

    private static Queue<Connection> connectionPool = new LinkedList<>();

    static {
        try {
            Class.forName(DRIVER_CLASS_NAME);
            initializeConnectionPool();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void initializeConnectionPool() {
        try {
            for (int i = 0; i < MAX_POOL_SIZE; i++) {
                Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
                connectionPool.offer(connection);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws InterruptedException {
        synchronized (connectionPool) {
            while (connectionPool.isEmpty()) {
                connectionPool.wait();
            }
            return connectionPool.poll();
        }
    }

    public static void releaseConnection(Connection connection) {
        synchronized (connectionPool) {
            connectionPool.offer(connection);
            connectionPool.notify();
        }
    }
}

