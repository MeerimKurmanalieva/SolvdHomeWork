package myData.DAOinterfaces;

import myData.entity.Ward;

import java.util.List;

public interface WardDAO extends GenericDAO<Ward> {

    List<Ward> getAll();

    Ward getById(int id);

    Ward create(Ward ward);

    Ward update(Ward ward);

    void delete(Ward ward);

    // Additional methods for WardDAO
    List<Ward> getByDepartmentId(int departmentId);
    List<Ward> getByAvailability(boolean availability);

    // Getters and Setters
    int getWardId();
    void setWardId(int wardId);

    String getName();
    void setName(String name);

    int getCapacity();
    void setCapacity(int capacity);

    int getDepartmentId();
    void setDepartmentId(int departmentId);

    boolean isAvailability();
    void setAvailability(boolean availability);
}

