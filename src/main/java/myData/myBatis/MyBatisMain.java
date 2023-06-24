package myData.myBatis;

import myData.JSON.Patients;
import myData.myBatis.Patients.PatientsMapper;
import myData.myBatis.Patients.PatientsMapperImpl;
import myData.myBatis.Patients.PatientsService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.Date;
import java.util.List;


public class MyBatisMain {
    public static void main(String[] args) {
        // Load MyBatis configuration
        try (Reader reader = Resources.getResourceAsReader("mybatis-config.xml")) {
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);

            // Create the PatientsService with the PatientsMapper
            PatientsMapper patientsMapper = new PatientsMapperImpl(sqlSessionFactory) {
                @Override
                public List<myData.JSON.Patients> getAllPatients() {
                    return null;
                }

                @Override
                public List<myData.JSON.Patients> getPatientsByName(String name) {
                    return null;
                }
            };
            PatientsService patientsService = new PatientsService(patientsMapper);

            // Use the PatientsService methods
            myData.JSON.Patients patient = new myData.JSON.Patients();
            patient.setPatientId(1);
            patient.setName("John Doe");
            patient.setDateOfBirth(new Date());
            patient.setAddress("123 Main St");
            patient.setPhoneNumber(1234567890);

            // Insert a new patient
            patientsService.insertPatient(patient);

            // Get a patient by ID
            Patients retrievedPatient = patientsService.getPatientById(1);
            System.out.println("Retrieved Patient: " + retrievedPatient);

            // Update the patient's name
            retrievedPatient.setName("Jane Doe");
            patientsService.updatePatient(retrievedPatient);

            // Delete the patient
            patientsService.deletePatient(1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

