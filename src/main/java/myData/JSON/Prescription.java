package myData.JSON;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Prescription {
    @JsonProperty("prescription_id")
    private int prescriptionId;

    @JsonProperty("patient_id")
    private String patientId;

    @JsonProperty("doctor_id")
    private String doctorId;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date date;

    @JsonProperty("Patients_patient_id")
    private int patientsPatientId;

    public int getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(int prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPatientsPatientId() {
        return patientsPatientId;
    }

    public void setPatientsPatientId(int patientsPatientId) {
        this.patientsPatientId = patientsPatientId;
    }

    public int getDoctorDoctorId() {
        return doctorDoctorId;
    }

    public void setDoctorDoctorId(int doctorDoctorId) {
        this.doctorDoctorId = doctorDoctorId;
    }

    @JsonProperty("Doctor_Doctor_id")
    private int doctorDoctorId;

}
