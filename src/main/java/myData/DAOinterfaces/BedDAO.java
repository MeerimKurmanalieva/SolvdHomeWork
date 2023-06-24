package myData.DAOinterfaces;

import myData.entity.Bed;

import java.util.List;

public interface BedDAO extends GenericDAO<Bed> {

    List<Bed> getAll();

    Bed getById(int id);

    Bed create(Bed bed);

    Bed update(Bed bed);

    void delete(Bed bed);

    // Additional methods for BedDAO
    List<Bed> getByWardId(int wardId);
    List<Bed> getByAvailability(boolean isAvailable);
    List<Bed> getByType(String type);

    // Getters and Setters
    int getBedId();
    void setBedId(int bedId);

    int getWardId();
    void setWardId(int wardId);

    boolean isAvailable();
    void setAvailable(boolean available);

    String getType();
    void setType(String type);

    String getDescription();
    void setDescription(String description);
}

