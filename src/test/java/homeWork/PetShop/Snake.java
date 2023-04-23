package homeWork.PetShop;

public class Snake extends Pet {
    private boolean isVenomous;

    public Snake(String name, int age, boolean isVenomous) {
        super(name, age);
        this.isVenomous = isVenomous;
    }

    public boolean isVenomous() {
        return isVenomous;
    }

    public void setVenomous(boolean venomous) {
        isVenomous = venomous;
    }

    @Override
    public String makeSound() {
        return "Hiss Hiss";
    }
}