package myData.DAOinterfaces;

import myData.entity.Patient;

import java.util.Date;
import java.util.List;

public interface PatientDAO extends GenericDAO<Patient> {

    List<Patient> getAll();

    Patient getById(int id);

     Patient create(Patient patient);

    Patient update(Patient patient);

    default void delete(Patient patient) {

    }

    // Additional methods for PatientDAO
    List<Patient> getByName(String name);
    List<Patient> getByAddress(String address);
    List<Patient> getByPhoneNumber(int phoneNumber);

    // Getters and Setters
    int getPatientId();
    void setPatientId(int patientId);

    String getName();
    void setName(String name);

    Date getDateOfBirth();
    void setDateOfBirth(Date dateOfBirth);

    String getAddress();
    void setAddress(String address);

    int getPhoneNumber();
    void setPhoneNumber(int phoneNumber);
}
