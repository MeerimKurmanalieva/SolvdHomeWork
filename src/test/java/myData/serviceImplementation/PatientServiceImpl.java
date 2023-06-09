package myData.serviceImplementation;

import myData.DAOinterfaces.PatientDAO;
import myData.entity.Patient;
import myData.serviceInterfaces.PatientService;

import java.util.List;

public class PatientServiceImpl implements PatientService {

    private PatientDAO patientDAO;

    public PatientServiceImpl(PatientDAO patientDAO) {
        this.patientDAO = patientDAO;
    }

    @Override
    public List<Patient> getAllPatients() {
        return patientDAO.getAll();
    }

    @Override
    public Patient getPatientById(int id) {
        return patientDAO.getById(id);
    }

    @Override
    public void createPatient(Patient patient) {
        patientDAO.create(patient);
    }

    @Override
    public void updatePatient(Patient patient) {
        patientDAO.update(patient);
    }

    @Override
    public void deletePatient(int id) {
        Patient patient = patientDAO.getById(id);
        if (patient != null) {
            patientDAO.delete(patient);
        }
    }

    @Override
    public List<Patient> searchPatients(String keyword) {
        return null;
    }

    @Override
    public List<Patient> getPatientsByAgeRange(int minAge, int maxAge) {
        return null;
    }

    @Override
    public List<Patient> getPatientsByGender(String gender) {
        return null;
    }

    @Override
    public List<Patient> getPatientsByCity(String city) {
        return null;
    }

    @Override
    public List<Patient> getPatientsByDoctorId(int doctorId) {
        return null;
    }


}

