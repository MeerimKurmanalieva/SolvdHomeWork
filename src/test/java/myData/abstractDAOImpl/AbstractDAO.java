package myData.abstractDAOImpl;
import myData.DAOinterfaces.GenericDAO;
import myData.entity.Patient;
import threads.ConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractDAO<T> implements GenericDAO<T> {
    private ConnectionPool connectionPool;

    public AbstractDAO(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }

    protected Connection getConnection() throws SQLException, InterruptedException {
        return (Connection) connectionPool.getConnection();
    }

    protected void releaseConnection(Connection connection) {
        connectionPool.releaseConnection((threads.Connection) connection);
    }

    protected abstract T mapResultSetToEntity(ResultSet resultSet) throws SQLException;

    protected abstract void mapEntityToPreparedStatement(T entity, PreparedStatement preparedStatement) throws SQLException;

    @Override
    public List<T> getAll() {
        List<T> entities = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(getSelectAllQuery());
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                T entity = mapResultSetToEntity(resultSet);
                entities.add(entity);
            }
        } catch (SQLException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                releaseConnection(connection);
            }
        }

        return entities;
    }

    // Implement other methods from the GenericDAO interface

    protected abstract String getSelectAllQuery();

    public abstract List<Patient> getByName(String name);

    public abstract List<Patient> getByAddress(String address);
}
