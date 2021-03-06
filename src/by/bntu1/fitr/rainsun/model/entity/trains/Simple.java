package by.bntu1.fitr.rainsun.model.entity.trains;

public class Simple extends Coach {

    private int cargoType;

    public Simple() {
        super();
        this.cargoType = 0;
    }

    public Simple(int weight, int length, int cargoType) {
        super(weight, length);
        this.cargoType = cargoType;
    }

    public int getType() {
        return this.cargoType;
    }

    public void setType(int type) {
        this.cargoType = type;
    }

    @Override
    public String toString() {
        return CoachConst.COACH + " - " + CoachConst.SIMPLE + " (" + super.toString() + "," + this.cargoType + ")";
    }

}
