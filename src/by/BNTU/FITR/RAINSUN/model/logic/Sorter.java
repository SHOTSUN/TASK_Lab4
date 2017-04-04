package by.BNTU.FITR.RAINSUN.model.logic;

import by.BNTU.FITR.RAINSUN.model.entity.containers.Train;
import by.BNTU.FITR.RAINSUN.model.entity.trains.Coach;
import java.util.Collections;

public class Sorter {
    
    public static void sortTrain(Train train) {
        
        Collections.sort(train.get());
        
    }
    
}
