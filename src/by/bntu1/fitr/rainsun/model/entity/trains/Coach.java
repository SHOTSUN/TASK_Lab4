package by.bntu1.fitr.rainsun.model.entity.trains;

public class Coach implements Comparable<Coach> {

    private int weight;
    private int length;
    
    public Coach() {
    }

    private void throwError(int ind, String msg) {
        switch (ind) {
            case 0: {
                throw new IllegalArgumentException(msg);
            }
        }
    }

    public Coach(int weight, int length) {
        if (weight > 0 && length > 0) {
            this.weight = weight;
            this.length = length;
        } else {
            throwError(0, "Weight or length must be > 0");
        }
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            throwError(0, "Weight must be > 0");
        }
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length > 0) {
            this.length = length;
        } else {
            throwError(0, "Length must be > 0");
        }
    }
    
    @Override
    public String toString() {
        return "weight = " + this.weight + ", length = " + this.length + ";";
    }
    
    @Override
    public int compareTo(Coach comparableCoach){
            return this.weight - comparableCoach.getWeight();
    }
    

}
