package by.bntu1.fitr.rainsun.model.entity.trains;

public class Armored extends Coach {

    private int armor;

    public Armored() {
        super();
        this.armor = 0;

    }

    public Armored(int weight, int length, int armor) {
        super(weight, length);
        this.armor = armor;

    }

    public int getArmor() {
        return this.armor;
    }

    public void setArmor(int armor) {
        if (armor > 0) {
            this.armor = armor;
        } else {
            throw new IllegalArgumentException("Weight must be > 0");
        }
    }

    @Override
    public String toString() {
        return "Armored coach(" + super.toString() + ", armor = "
                + this.armor + ")";
    }

}
