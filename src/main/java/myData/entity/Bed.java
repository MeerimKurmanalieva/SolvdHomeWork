package myData.entity;

public class Bed {
    private int bedId;
    private String wardId;
    private int bedNumber;
    private boolean availability;

    // Getter and Setter for bedId
    public int getBedId() {
        return bedId;
    }

    public void setBedId(int bedId) {
        this.bedId = bedId;
    }

    // Getter and Setter for wardId
    public String getWardId() {
        return wardId;
    }

    public void setWardId(String wardId) {
        this.wardId = wardId;
    }

    // Getter and Setter for bedNumber
    public int getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(int bedNumber) {
        this.bedNumber = bedNumber;
    }

    // Getter and Setter for availability
    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}


