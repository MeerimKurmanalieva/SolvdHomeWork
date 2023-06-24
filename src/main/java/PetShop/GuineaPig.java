package PetShop;

public class GuineaPig extends Pet {
    private static final double price =4.8 ;
    private boolean isLongHair;

    public GuineaPig(String name, int age, boolean isLongHair) {
        super(name, age, age, price);
        this.isLongHair = isLongHair;
    }

    public boolean isLongHair() {
        return isLongHair;
    }

    public void setLongHair(boolean longHair) {
        isLongHair = longHair;
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
