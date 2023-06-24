package myData.DAOinterfaces;

import myData.entity.Prescription;

import java.util.Date;
import java.util.List;

interface PrescriptionDAO extends GenericDAO<Prescription> {


    List<Prescription> getByPatientId(int patientId);
    List<Prescription> getByDoctorId(int doctorId);

    Prescription getById(int prescriptionId);
    List<Prescription> getByDateRange(Date startDate, Date endDate);
    List<Prescription> getByMedication(String medication);

    int countByPatientId(int patientId);
    int countByDoctorId(int doctorId);

    double getAverageDosageByPatientId(int patientId);
    int getMaxDosageByDoctorId(int doctorId);
}
