package myData.DAOinterfaces;

import myData.entity.Department;

import java.util.List;

public interface DepartmentDAO extends GenericDAO<Department> {

    List<Department> getAll();

    Department getById(int id);

    Department create(Department department);

    Department update(Department department);

    void delete(Department department);

    // Additional methods for DepartmentDAO
    List<Department> getByLocation(String location);
    List<Department> getByHead(String head);

    // Getters and Setters
    int getDepartmentId();
    void setDepartmentId(int departmentId);

    String getName();
    void setName(String name);

    String getLocation();
    void setLocation(String location);

    String getHead();
    void setHead(String head);

    String getDescription();
    void setDescription(String description);
}
