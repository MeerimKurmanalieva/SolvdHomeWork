package myData.JSON;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Doctors {@JsonProperty("Doctor_id")
private int doctorId;

    @JsonProperty("phone_number")
    private Integer phoneNumber;

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    private String specialization;

    // Getters and setters
}
