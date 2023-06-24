package myData.serviceImplementation;

import myData.DAOinterfaces.DoctorDAO;
import myData.entity.Doctor;
import myData.serviceInterfaces.DoctorService;

import java.util.List;

public class DoctorServiceImpl implements DoctorService {

    private DoctorDAO doctorDAO;

    public DoctorServiceImpl(DoctorDAO doctorDAO) {
        this.doctorDAO = doctorDAO;
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return doctorDAO.getAll();
    }

    @Override
    public Doctor getDoctorById(int id) {
        return doctorDAO.getById(id);
    }

    @Override
    public void createDoctor(Doctor doctor) {
        doctorDAO.create(doctor);
    }

    @Override
    public void updateDoctor(Doctor doctor) {
        doctorDAO.update(doctor);
    }

    @Override
    public void deleteDoctor(int id) {
        Doctor doctor = doctorDAO.getById(id);
        if (doctor != null) {
            doctorDAO.delete(doctor);
        }
    }

    @Override
    public List<Doctor> searchDoctors(String keyword) {
        return null;
    }

    @Override
    public List<Doctor> getDoctorsBySpecialty(String specialty) {
        return null;
    }

    @Override
    public List<Doctor> getDoctorsByDepartment(String department) {
        return null;
    }


    @Override
    public List<Doctor> getDoctorsByExperience(int yearsOfExperience) {
        return null;
    }

    // Implement other methods specific to doctor service
}

