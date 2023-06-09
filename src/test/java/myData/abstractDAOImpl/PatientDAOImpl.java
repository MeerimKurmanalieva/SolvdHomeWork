package myData.abstractDAOImpl;

import myData.DAOinterfaces.PatientDAO;
import myData.entity.Patient;
import threads.ConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PatientDAOImpl extends AbstractDAO<Patient> implements PatientDAO {

    public PatientDAOImpl(ConnectionPool connectionPool) {
        super(connectionPool);
    }

    @Override
    protected Patient mapResultSetToEntity(ResultSet resultSet) throws SQLException {
        // Mapping logic to convert ResultSet to Patient object
        int patientId = resultSet.getInt("patient_id");
        String name = resultSet.getString("name");
        // ... continue mapping other fields
        return new Patient(patientId, name);
    }

    @Override
    protected void mapEntityToPreparedStatement(Patient entity, PreparedStatement preparedStatement) throws SQLException {
        // Mapping logic to set values in the PreparedStatement from the Patient object
        preparedStatement.setString(1, entity.getName());
        // ... set other parameters
    }

    @Override
    protected String getSelectAllQuery() {
        return "SELECT * FROM patients";
    }



    @Override
    public List<Patient> getByName(String name) {
        List<Patient> patients = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement("SELECT * FROM patients WHERE name = ?");
            preparedStatement.setString(1, name);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Patient patient = mapResultSetToEntity(resultSet);
                patients.add(patient);
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

        return patients;
    }

    @Override
    public List<Patient> getByAddress(String address) {
        List<Patient> patients = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement("SELECT * FROM patients WHERE address = ?");
            preparedStatement.setString(1, address);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Patient patient = mapResultSetToEntity(resultSet);
                patients.add(patient);
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

        return patients;
    }

    @Override
    public List<Patient> getByPhoneNumber(int phoneNumber) {
        return null;
    }

    @Override
    public int getPatientId() {
        return 0;
    }

    @Override
    public void setPatientId(int patientId) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public Date getDateOfBirth() {
        return null;
    }

    @Override
    public void setDateOfBirth(Date dateOfBirth) {

    }

    @Override
    public String getAddress() {
        return null;
    }

    @Override
    public void setAddress(String address) {

    }

    @Override
    public int getPhoneNumber() {
        return 0;
    }

    @Override
    public void setPhoneNumber(int phoneNumber) {

    }


    @Override
    public Patient getById(int id) {
        return null;
    }

    @Override
    public Patient create(Patient entity) {
        return null;
    }

    @Override
    public Patient read(int id) {
        return null;
    }

    @Override
    public Patient update(Patient entity) {
        return null;
    }

    @Override
    public void delete(Patient entity) {

    }
}

