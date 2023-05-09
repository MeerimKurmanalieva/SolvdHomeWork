package OOP.PetShop;

public class Hamster extends Pet {
    private static final double price =2.7 ;
    private int wheelSize;

    public Hamster(String name, int age, int wheelSize) {
        super(name, age, age, price);
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

    @Override
    public int getStock() {
        return 0;
    }

    @Override
    public void sell() {

    }
}
