package by.BNTU.FITR.RAINSUN.model.entity.comparators;

import by.BNTU.FITR.RAINSUN.model.entity.containers.Train;
import by.BNTU.FITR.RAINSUN.model.entity.trains.Coach;
import java.util.Comparator;

public class TrainComparator implements Comparator<Train> {

    @Override
    public int compare(Train a, Train b) {
        int rezult1 = 0;
        int rezult2 = 0;

        for (Coach coach : a) {
            rezult1 += coach.getWeight();
        }

        for (Coach coach : b) {
            rezult2 += coach.getWeight();
        }

        return rezult1 - rezult2;
    }

}
