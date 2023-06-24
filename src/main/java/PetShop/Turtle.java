package PetShop;

public class Turtle extends Pet {
    private static final double price =7 ;
    private int shellSize;

    public Turtle(String name, int age, int shellSize) {
        super(name, age, age, price);
        this.shellSize = shellSize;
    }

    public int getShellSize() {
        return shellSize;
    }

    public void setShellSize(int shellSize) {
        this.shellSize = shellSize;
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
