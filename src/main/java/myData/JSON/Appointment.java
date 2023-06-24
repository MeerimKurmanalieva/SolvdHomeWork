package myData.JSON;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Appointment {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date date;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date time;

    @JsonProperty("patient_id")
    private String patientId;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public int getPatientsPatientId() {
        return patientsPatientId;
    }

    public void setPatientsPatientId(int patientsPatientId) {
        this.patientsPatientId = patientsPatientId;
    }

    @JsonProperty("Patients_patient_id")
    private int patientsPatientId;

    // Getters and setters
}
