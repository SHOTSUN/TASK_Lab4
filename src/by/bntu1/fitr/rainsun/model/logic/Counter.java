package by.bntu1.fitr.rainsun.model.logic;

import by.bntu1.fitr.rainsun.model.entity.trains.Coach;
import by.bntu1.fitr.rainsun.model.entity.containers.Depo;
import by.bntu1.fitr.rainsun.model.entity.containers.Train;


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
