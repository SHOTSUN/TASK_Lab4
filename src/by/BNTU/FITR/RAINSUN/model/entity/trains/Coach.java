package by.BNTU.FITR.RAINSUN.model.entity.trains;

public class Coach implements Comparable<Coach> {

    private int weight;

    public Coach() {
    }

    private void throwError(int ind, String msg) {
        switch (ind) {
            case 0: {
                throw new IllegalArgumentException(msg);
            }
        }
    }

    public Coach(int weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            throwError(0, "Weight must be > 0");
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

    @Override
    public String toString() {
        return "weight = " + this.weight + ";";
    }
    
    @Override
    public int compareTo(Coach comparableCoach){
            return this.weight - comparableCoach.getWeight();
    }
    

}
