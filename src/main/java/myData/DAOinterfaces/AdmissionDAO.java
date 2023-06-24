package myData.DAOinterfaces;

import myData.entity.Admission;

import java.util.Date;
import java.util.List;

public interface AdmissionDAO extends GenericDAO<Admission> {

    List<Admission> getAll();

    Admission getById(int id);

    Admission create(Admission admission);

    Admission update(Admission admission);

    void delete(Admission admission);

    // Additional methods for AdmissionDAO
    List<Admission> getByPatientId(int patientId);
    List<Admission> getByDoctorId(int doctorId);
    List<Admission> getByWardId(int wardId);

    // Getters and Setters
    int getAdmissionId();
    void setAdmissionId(int admissionId);

    int getPatientId();
    void setPatientId(int patientId);

    int getDoctorId();
    void setDoctorId(int doctorId);

    int getWardId();
    void setWardId(int wardId);

    Date getAdmissionDate();
    void setAdmissionDate(Date admissionDate);

    Date getDischargeDate();
    void setDischargeDate(Date dischargeDate);
}

