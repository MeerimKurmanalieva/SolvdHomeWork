package myData.myBatis.Patients;

// PatientsMapper.java


import myData.JSON.Patients;

import java.util.List;

public interface PatientsMapper {
    Patients getPatientById(int patientId);

    void insertPatient(Patients patient);

    void updatePatient(Patients patient);

    void deletePatient(int patientId);

    List<Patients> getAllPatients();

    List<Patients> getPatientsByName(String name);
}

