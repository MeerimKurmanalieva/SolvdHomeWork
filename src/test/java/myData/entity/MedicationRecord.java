package myData.entity;

import java.util.Date;

public class MedicationRecord {
    private int medicalRecordId;
    private String doctorId;
    private String patientId;
    private String medicalRecordData;
    private Date date;

    // Getter and Setter for medicalRecordId
    public int getMedicalRecordId() {
        return medicalRecordId;
    }

    public void setMedicalRecordId(int medicalRecordId) {
        this.medicalRecordId = medicalRecordId;
    }

    // Getter and Setter for doctorId
    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    // Getter and Setter for patientId
    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    // Getter and Setter for medicalRecordData
    public String getMedicalRecordData() {
        return medicalRecordData;
    }

    public void setMedicalRecordData(String medicalRecordData) {
        this.medicalRecordData = medicalRecordData;
    }

    // Getter and Setter for date
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

