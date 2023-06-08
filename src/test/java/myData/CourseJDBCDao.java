package myData;

import java.util.List;

public class CourseJDBCDao extends JDBCDao<Course> implements CourseDAO {
    @Override
    public Course getById(int id) {
        return null;
    }

    @Override
    public List<Course> getAll() {
        return null;
    }

    @Override
    public void save(Course obj) {

    }

    @Override
    public void update(Course obj) {

    }

    @Override
    public void delete(Course obj) {

    }
    // Implement methods from CourseDAO and any additional JDBC operations specific to Course
}
