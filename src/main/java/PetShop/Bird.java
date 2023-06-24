package PetShop;

public class Bird extends Pet {
    private static final double price = 2.5;
    private boolean canFly;

    public Bird(String name, int age, boolean canFly) {
        super(name, age, age, price);
        this.canFly = canFly;
    }

    public boolean canFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    @Override
    public String makeSound() {
        return "Chirp Chirp";
    }

    @Override
    public int getStock() {
        return 0;
    }

    @Override
    public void sell() {

    }
}

