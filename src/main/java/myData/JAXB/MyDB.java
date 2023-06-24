package myData.JAXB;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "mydb")
public class MyDB {
    private Patients patients;
    private Doctor doctor;


    public Patients getPatients() {
        return patients;
    }

    @XmlElement(name = "Patients")
    public void setPatients(Patients patients) {
        this.patients = patients;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    @XmlElement(name = "Doctor")
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }




}





