package homeWork2.Persons;

import homeWork2.Pets.Pet;

public class Owner extends Person {
    private Pet pet;

    public Owner(String john, String doe, String s) {
        super();
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

}