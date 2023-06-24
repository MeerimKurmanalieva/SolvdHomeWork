package PetShop;

public abstract class Fish extends Pet  {
    private static final double price = 2.9;
    protected boolean isSaltwater;

    public Fish(String name, int age, boolean isSaltwater) {
        super(name, age, age, price);
        this.isSaltwater = isSaltwater;
    }

    public boolean isSaltwater() {
        return isSaltwater;
    }

    public void setSaltwater(boolean isSaltwater) {
        this.isSaltwater = isSaltwater;
    }

    @Override
    public String makeSound() {
        return "Blub blub";
    }

    @Override
    public String toString() {
        return super.toString() + ", Is Saltwater: " + isSaltwater;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + (isSaltwater ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Fish other = (Fish) obj;
        if (isSaltwater != other.isSaltwater)
            return false;
        return true;
    }}