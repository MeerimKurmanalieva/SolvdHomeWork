package myData.JSON;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Test {

        @JsonProperty("test_id")
        private int testId;

    public int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public int getDoctorDoctorId() {
        return doctorDoctorId;
    }

    public void setDoctorDoctorId(int doctorDoctorId) {
        this.doctorDoctorId = doctorDoctorId;
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

    public Date getTestDate() {
        return testDate;
    }

    public void setTestDate(Date testDate) {
        this.testDate = testDate;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    @JsonProperty("doctor_id")
        private String doctorId;

        @JsonProperty("Doctor_Doctor_id")
        private int doctorDoctorId;

        @JsonProperty("patient_id")
        private String patientId;

        @JsonProperty("Patients_patient_id")
        private int patientsPatientId;

        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
        @JsonProperty("test_date")
        private Date testDate;

        @JsonProperty("test_result")
        private String testResult;

    }
