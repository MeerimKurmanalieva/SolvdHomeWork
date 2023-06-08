package myData;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import threads.Connection;

import java.sql.SQLException;

public class DatabaseConnectionPool {
    private static HikariDataSource dataSource;

    static {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/mydb");
        config.setUsername("root");
        config.setPassword("Kurmanalieva93");

        // Other configuration properties (e.g., connection pool size, timeout, etc.)

        dataSource = new HikariDataSource(config);
    }

    public static Connection getConnection() throws SQLException {
        return (Connection) dataSource.getConnection();
    }
}

