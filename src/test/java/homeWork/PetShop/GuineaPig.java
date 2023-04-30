package homeWork.PetShop;

public class GuineaPig extends Pet {
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
}
