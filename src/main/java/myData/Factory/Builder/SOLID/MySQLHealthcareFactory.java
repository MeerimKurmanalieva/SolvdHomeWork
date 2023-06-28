package myData.Factory.Builder.SOLID;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.time.LocalDate;
import java.util.Properties;

class MySQLHealthcareFactory implements HealthcareFactory {
    private String dbUrl;
    private String dbUser;
    private String dbPassword;

    public MySQLHealthcareFactory() {
        loadConfig();
    }

    private void loadConfig() {
        try (FileInputStream input = new FileInputStream("config.properties")) {
            Properties properties = new Properties();
            properties.load(input);

            dbUrl = properties.getProperty("db.url");
            dbUser = properties.getProperty("db.user");
            dbPassword = properties.getProperty("db.password");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void createDoctor() {

    }

    @Override
    public void createPatient() throws SQLException {
        String createPatientQuery = "INSERT INTO `mydb`.`Patients` (`patient_id`, `name`, `date_of_birth`, `address`, `phone_number`) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement statement = null;
        int patientId = 0;
        String name = "";
        LocalDate dateOfBirth = LocalDate.now();
        String address = "";
        int phoneNumber = 0;
        statement.setInt(1, patientId);
        statement.setString(2, name);
        statement.setDate(3, Date.valueOf(dateOfBirth));
        statement.setString(4, address);
        statement.setInt(5, phoneNumber);

        // Execute the query
        statement.executeUpdate();

        System.out.println("Patient created successfully.");
    }
    }