package homeWork.PetShop;

public abstract class Mammal extends Pet  {
    private static final double price = 5;
    protected boolean isDomesticated;

    public Mammal(String name, int age, boolean isDomesticated) {
        super(name, age, age, price);
        this.isDomesticated = isDomesticated;
    }

    public boolean isDomesticated() {
        return isDomesticated;
    }

    public void setDomesticated(boolean isDomesticated) {
        this.isDomesticated = isDomesticated;
    }

    @Override
    public String toString() {
        return super.toString() + ", Is Domesticated: " + isDomesticated;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + (isDomesticated ? 1231 : 1237);
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
        Mammal other = (Mammal) obj;
        if (isDomesticated != other.isDomesticated)
            return false;
        return true;
    }

    public abstract void bark();
}