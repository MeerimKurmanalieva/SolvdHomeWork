package homeWork.PetShop;

public class Hamster extends Pet {
    private int wheelSize;

    public Hamster(String name, int age, int wheelSize) {
        super(name, age);
        this.wheelSize = wheelSize;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    @Override
    public String makeSound() {
        return null;
    }
}
