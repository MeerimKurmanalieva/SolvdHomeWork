package myData.serviceInterfaces;

import myData.entity.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> getAllPatients();
    Patient getPatientById(int id);
    void createPatient(Patient patient);
    void updatePatient(Patient patient);
    void deletePatient(int id);

    List<Patient> searchPatients(String keyword);
    List<Patient> getPatientsByAgeRange(int minAge, int maxAge);
    List<Patient> getPatientsByGender(String gender);
    List<Patient> getPatientsByCity(String city);
    List<Patient> getPatientsByDoctorId(int doctorId);

}

