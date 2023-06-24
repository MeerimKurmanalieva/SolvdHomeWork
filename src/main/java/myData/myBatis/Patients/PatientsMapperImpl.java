package myData.myBatis.Patients;

import myData.JSON.Patients;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public abstract class PatientsMapperImpl implements PatientsMapper {


    public PatientsMapperImpl(SqlSessionFactory sqlSessionFactory) {

    }

    @Override
    public Patients getPatientById(int patientId) {
        return null;
    }

    @Override
    public void insertPatient(Patients patient) {

    }

    @Override
    public void updatePatient(Patients patient) {
        SqlSessionFactory sessionFactory = null;
        try (SqlSession session = sessionFactory.openSession()) {
            PatientsMapper mapper = session.getMapper(PatientsMapper.class);
            mapper.updatePatient(patient);
            session.commit();
        }
    }

    @Override
    public void deletePatient(int patientId) {
        SqlSessionFactory sessionFactory = null;
        try (SqlSession session = sessionFactory.openSession()) {
            PatientsMapper mapper = session.getMapper(PatientsMapper.class);
            mapper.deletePatient(patientId);
            session.commit();
        }
    }


}
