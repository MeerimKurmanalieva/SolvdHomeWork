package myData.JAXB;

import javax.xml.bind.annotation.*;@XmlRootElement(name = "Doctor")
@XmlAccessorType(XmlAccessType.FIELD)
public class Doctor {
    @XmlElement
    private int doctorId;

    @XmlElement
    private int phoneNumber;

    @XmlElement
    private String specialization;

    // Getters and setters
    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}


