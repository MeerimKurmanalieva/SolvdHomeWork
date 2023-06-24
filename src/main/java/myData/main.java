package myData;

import myData.DAOinterfaces.PatientDAO;
import myData.abstractDAOImpl.PatientDAOImpl;
import myData.entity.Patient;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

public class main {
    public static void main(String[] args) {
        PatientDAO patientDAO = new PatientDAOImpl();

        try (Connection connection = getConnection()) {
            List<Patient> allPatients = patientDAO.getAll();
            for (Patient patient : allPatients) {
                System.out.println(patient.getName());
            }

            int patientId = 1;
            Patient retrievedPatient = patientDAO.getById(patientId);
            System.out.println("Retrieved patient with ID " + patientId + ": " + retrievedPatient);

            // Create a new patient
            Patient newPatient = new Patient();
            newPatient.setName("John Doe");
            newPatient.setDateOfBirth(new java.sql.Date(System.currentTimeMillis()));
            Patient createdPatient = patientDAO.create(newPatient);
            System.out.println("Created patient: " + createdPatient);

            // Update an existing patient
            Patient existingPatient = patientDAO.getById(2);
            existingPatient.setName("Jane Smith");
            Patient updatedPatient = patientDAO.update(existingPatient);
            System.out.println("Updated patient: " + updatedPatient);

            // Delete a patient
            Patient patientToDelete = patientDAO.getById(3);
            patientDAO.delete(patientToDelete);
            System.out.println("Deleted patient with ID 3");


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static Connection getConnection() throws SQLException {
        Properties properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/main/resources/resources.properties");
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
            throw new SQLException("Failed to load properties file.");
        }

        String url = properties.getProperty("db.url");
        String username = properties.getProperty("db.username");
        String password = properties.getProperty("db.password");

        return DriverManager.getConnection(url, username, password);
    }
}
