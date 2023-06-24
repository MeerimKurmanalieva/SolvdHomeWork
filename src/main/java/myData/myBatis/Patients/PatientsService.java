package myData.myBatis.Patients;

import myData.JSON.Patients;

import java.util.List;

public class PatientsService {
    private final PatientsMapper patientsMapper;

    public PatientsService(PatientsMapper patientsMapper) {
        this.patientsMapper = patientsMapper;
    }

    public Patients getPatientById(int patientId) {
        return patientsMapper.getPatientById(patientId);
    }

    public void insertPatient(Patients patient) {
        patientsMapper.insertPatient(patient);
    }

    public void updatePatient(Patients patient) {
        patientsMapper.updatePatient(patient);
    }

    public void deletePatient(int patientId) {
        patientsMapper.deletePatient(patientId);
    }

    // Implement other methods using the DAOs
    public List<Patients> getAllPatients() {
        return patientsMapper.getAllPatients();
    }

    public List<Patients> getPatientsByName(String name) {
        return patientsMapper.getPatientsByName(name);
    }
}
