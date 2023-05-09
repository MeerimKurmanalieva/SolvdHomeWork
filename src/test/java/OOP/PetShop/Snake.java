package OOP.PetShop;

public class Snake extends Pet {

    private static final double price =3 ;
    private boolean isVenomous;

    public Snake(String name, int age, boolean isVenomous) {
        super(name, age, age, price);
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

    @Override
    public int getStock() {
        return 1;
    }

    @Override
    public void sell() {

    }
}