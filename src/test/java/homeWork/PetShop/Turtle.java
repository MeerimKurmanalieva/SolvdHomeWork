package homeWork.PetShop;

public class Turtle extends Pet {
    private int shellSize;

    public Turtle(String name, int age, int shellSize) {
        super(name, age);
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
}
