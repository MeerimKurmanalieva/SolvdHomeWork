package myData.Factory.Builder.SOLID;

import java.sql.SQLException;

// Abstract Factory
interface HealthcareFactory {
    void createDoctor();
    void createPatient() throws SQLException;
}




