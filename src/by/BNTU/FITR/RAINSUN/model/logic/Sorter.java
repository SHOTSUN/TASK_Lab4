package by.BNTU.FITR.RAINSUN.model.logic;

import by.BNTU.FITR.RAINSUN.model.entity.comparators.CoachLengthComparator;
import by.BNTU.FITR.RAINSUN.model.entity.comparators.TrainComparator;
import by.BNTU.FITR.RAINSUN.model.entity.containers.Depo;
import by.BNTU.FITR.RAINSUN.model.entity.containers.Train;
import java.util.Collections;


public class Sorter {
    
    enum Season { WEIGHT, LENGTH }
    
    public static void sortTrain(Train train, int s) {
        
        if(s == 1){
            Collections.sort(train.get());
        }
        else if(s == 2){
            Collections.sort(train.get(), new CoachLengthComparator());
        }
        

    }
    
    public static void sortDepo(Depo depo, TrainComparator trainComp) {
        
        
        Collections.sort(depo.getDepo(), trainComp);

    }
        

}
