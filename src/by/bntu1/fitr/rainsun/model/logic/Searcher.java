package by.bntu1.fitr.rainsun.model.logic;

import by.bntu1.fitr.rainsun.model.entity.comparators.CoachLengthComparator;
import by.bntu1.fitr.rainsun.model.entity.containers.Train;
import by.bntu1.fitr.rainsun.model.entity.trains.Coach;
import java.util.Collections;

public class Searcher {

    public static int searchByVal(Train train, Types type, int value) {
        //////sort
        if (type == Types.LENGTH) {
            return Collections.binarySearch(train.get(), new Coach(8, value), 
                    new CoachLengthComparator());
        } else if (type == Types.WEIGHT){
            return Collections.binarySearch(train.get(), new Coach(value, 8));
        }
        return 0;
    }

    public enum Types {
        LENGTH, WEIGHT
    }

}
