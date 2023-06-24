package myData.DAOinterfaces;

import myData.entity.Doctor;

import java.util.List;

public interface DoctorDAO extends GenericDAO<Doctor> {

    List<Doctor> getAll();

    Doctor getById(int id);

    Doctor create(Doctor doctor);

    Doctor update(Doctor doctor);

    void delete(Doctor doctor);

    // Additional methods for DoctorDAO
    List<Doctor> getBySpecialization(String specialization);
    List<Doctor> getByHospital(String hospital);

    // Getters and Setters
    int getDoctorId();
    void setDoctorId(int doctorId);

    String getName();
    void setName(String name);

    String getSpecialization();
    void setSpecialization(String specialization);

    String getHospital();
    void setHospital(String hospital);

    int getYearsOfExperience();
    void setYearsOfExperience(int yearsOfExperience);
}
