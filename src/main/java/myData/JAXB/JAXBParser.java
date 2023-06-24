package myData.JAXB;
import myData.entity.Patient;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JAXBParser {
    public static void main(String[] args) {
        try {
            // Create JAXBContext
            JAXBContext jaxbContext = JAXBContext.newInstance(MyDB.class);

            // Create Unmarshaller
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            // Parse XML file
            File xmlFile = new File("mydb.xml");
            MyDB myDB = (MyDB) unmarshaller.unmarshal(xmlFile);

            // Access the objects
            Patients patients = myDB.getPatients();
            Doctor doctor = myDB.getDoctor();
            // Access other objects as needed

            // Print the retrieved data
            System.out.println("Patients:");
            for (Patient patient : patients.getPatient()) {
                System.out.println("ID: " + patient.getPatientId());
                System.out.println("Name: " + patient.getName());
                System.out.println("Date of Birth: " + patient.getDateOfBirth());
                // Print other patient details
                System.out.println();
            }

            System.out.println("Doctor:");
            System.out.println("ID: " + doctor.getDoctorId());
            System.out.println("Phone Number: " + doctor.getPhoneNumber());
            System.out.println("Specialization: " + doctor.getSpecialization());
            // Print other doctor details

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
