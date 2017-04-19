package by.BNTU.FITR.RAINSUN.model.logic;

import by.BNTU.FITR.RAINSUN.model.entity.comparators.CoachLengthComparator;
import by.BNTU.FITR.RAINSUN.model.entity.comparators.CoachWeightComparator;
import by.BNTU.FITR.RAINSUN.model.entity.containers.Train;
import by.BNTU.FITR.RAINSUN.model.entity.trains.Coach;
import java.util.Collections;

public class Searcher {

    public static int searchByVal(Train train, Types type, int value) {
        if (type == Types.LENGTH) {
            return Collections.binarySearch(train.get(), new Coach(8, value), new CoachLengthComparator());
        } else if (type == Types.WEIGHT){
            System.out.println("8888");
            return Collections.binarySearch(train.get(), new Coach(value, 8));
        }
        return 0;
    }

    public enum Types {
        LENGTH, WEIGHT
    }

}
