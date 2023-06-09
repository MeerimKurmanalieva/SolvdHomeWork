package myData.serviceInterfaces;

import myData.entity.Doctor;

import java.util.List;

public interface DoctorService {
    List<Doctor> getAllDoctors();
    Doctor getDoctorById(int id);
    void createDoctor(Doctor doctor);
    void updateDoctor(Doctor doctor);
    void deleteDoctor(int id);

    List<Doctor> searchDoctors(String keyword);
    List<Doctor> getDoctorsBySpecialty(String specialty);
    List<Doctor> getDoctorsByDepartment(String department);
    List<Doctor> getDoctorsByExperience(int yearsOfExperience);
    // Add other methods specific to doctor service
}

