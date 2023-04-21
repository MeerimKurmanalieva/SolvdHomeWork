package homeWork3;

import java.util.Objects;

public abstract class Pet {
    protected int age;
    protected String name;
    protected String color;

    public Pet(int age, String name, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public abstract void makeSound();

    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pet{name='" + name + "', age=" + age + ", color='" + color + "'}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, color);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        homeWork3.Pet pet = (homeWork3.Pet) obj;
        return age == pet.age &&
                Objects.equals(name, pet.name) &&
                Objects.equals(color, pet.color);
    }

}
