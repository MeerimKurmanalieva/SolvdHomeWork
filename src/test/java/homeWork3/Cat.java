package homeWork3;

import java.util.Objects;

public class Cat extends Pet {
    private String breed;

    public Cat(int age, String name, String color, String breed) {
        super(age, name, color);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    protected String getBreed() {
        return breed;
    }

    protected void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Cat{name='" + name + "', age=" + age + ", color='" + color + "', breed='" + breed + "'}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, color, breed);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cat cat = (Cat) obj;
        return age == cat.age &&
                Objects.equals(name, cat.name) &&
                Objects.equals(color, cat.color) &&
                Objects.equals(breed, cat.breed);
    }}