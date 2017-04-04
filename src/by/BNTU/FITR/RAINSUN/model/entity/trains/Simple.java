package by.BNTU.FITR.RAINSUN.model.entity.trains;

public class Simple extends Coach {

    private int cargoType;

    public Simple() {
        super();
        this.cargoType = 0;
    }

    public Simple(int weight, int cargoType) {
        super(weight);
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
        return "Simple coach(" + super.toString() + ", type = " + this.cargoType + ")";
    }

}
