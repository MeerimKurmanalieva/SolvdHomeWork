package homeWork3;

import java.util.Objects;

public class Dog extends Pet {
    private String breed;

    public Dog(int age, String name, String color, String breed) {
        super(age, name, color);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    protected String getBreed() {
        return breed;
    }

    protected void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{name='" + name + "', age=" + age + ", color='" + color + "', breed='" + breed + "'}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, color, breed);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Dog dog = (Dog) obj;
        return age == dog.age &&
                Objects.equals(name, dog.name) &&
                Objects.equals(color, dog.color) &&
                Objects.equals(breed, dog.breed);
    }
}
