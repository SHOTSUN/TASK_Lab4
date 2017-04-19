package by.BNTU.FITR.RAINSUN.model.logic;

import by.BNTU.FITR.RAINSUN.model.entity.comparators.CoachLengthComparator;
import by.BNTU.FITR.RAINSUN.model.entity.comparators.TrainComparator;
import by.BNTU.FITR.RAINSUN.model.entity.containers.Depo;
import by.BNTU.FITR.RAINSUN.model.entity.containers.Train;
import java.util.Collections;

public class Sorter {

    public static void sortTrain(Train train, Types type) {

        if (type == Types.BY_WEIGHT) {
            Collections.sort(train.get());
        } else if (type == Types.BY_LENGTH) {
            Collections.sort(train.get(), new CoachLengthComparator());
        }

    }

    public static void sortDepo(Depo depo, TrainComparator trainComp) {

        Collections.sort(depo.getDepo(), trainComp);

    }
    public enum Types {
        BY_LENGTH, BY_WEIGHT
    }

}
