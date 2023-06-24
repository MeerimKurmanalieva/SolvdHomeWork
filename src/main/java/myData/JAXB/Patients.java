package myData.JAXB;

import myData.entity.Patient;

import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.*;

@XmlRootElement
public class Patients {
    private List<Patient> patients;

    // Getters and setters
    @XmlElement(name = "Patient")
    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public Patient[] getPatient() {
        return null;
    }

    public void setName(String jane_doe) {
    }

    public void setPatientId(int i) {
    }

    public void setDateOfBirth(Date date) {
    }

    public void setAddress(String s) {
    }

    public void setPhoneNumber(int i) {
    }
}

