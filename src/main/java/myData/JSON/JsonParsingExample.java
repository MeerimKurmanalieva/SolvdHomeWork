package myData.JSON;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class JsonParsingExample {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            File file = new File("data.json");

            // Parse JSON to Java objects
            Patients patients = objectMapper.readValue(file, Patients.class);
            Doctors doctor = objectMapper.readValue(file, Doctors.class);
            Appointment appointment = objectMapper.readValue(file, Appointment.class);
            Prescription prescription = objectMapper.readValue(file, Prescription.class);
            Test test = objectMapper.readValue(file, Test.class);

            // Use the parsed objects
            System.out.println("Patients: " + patients.getName());
            System.out.println("Doctor: " + doctor.getSpecialization());
            System.out.println("Appointment: " + appointment.getDate());
            System.out.println("Prescription: " + prescription.getPrescriptionId());
            System.out.println("Test: " + test.getTestId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

