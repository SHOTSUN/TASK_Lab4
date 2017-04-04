package by.BNTU.FITR.RAINSUN.model.logic;

import by.BNTU.FITR.RAINSUN.model.entity.trains.Coach;
import by.BNTU.FITR.RAINSUN.model.entity.containers.Depo;
import by.BNTU.FITR.RAINSUN.model.entity.containers.Train;


public class Counter {

    public static int calculateTotalCost(Depo depo) {

        int total = 0;

        if (depo != null && depo.getClass() == Depo.class) {
            for (Train train : depo) {
                for (Coach coach : train) {
                    total += coach.getWeight();
                }
            }

        }
        return total;
    }

}
