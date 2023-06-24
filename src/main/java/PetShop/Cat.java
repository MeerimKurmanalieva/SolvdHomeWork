package PetShop;

public class Cat extends Pet {
    private static final double price = 5.6;
    private boolean isIndoor;

    public Cat(String name, int age, boolean isIndoor) {
        super(name, age, age, price);
        this.isIndoor = isIndoor;
    }

    public boolean isIndoor() {
        return isIndoor;
    }

    public void setIndoor(boolean indoor) {
        isIndoor = indoor;
    }

    @Override
    public String makeSound() {
        return "Mua Mua";
    }

    @Override
    public int getStock() {
        return 0;
    }

    @Override
    public void sell() {

    }
}

