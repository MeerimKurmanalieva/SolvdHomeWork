package OOP.PetShop;

public abstract class Dog extends Mammal {
    protected String breed;

    public Dog(String name, int age, boolean isDomesticated, String breed) {
        super(name, age, isDomesticated);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String makeSound() {
        return "Woof!";
    }

    @Override
    public String toString() {
        return super.toString() + ", Breed: " + breed;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((breed == null) ? 0 : breed.hashCode());
        return result;}}
