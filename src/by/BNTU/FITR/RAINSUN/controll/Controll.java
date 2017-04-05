package by.BNTU.FITR.RAINSUN.controll;

//import by.BNTU.FITR.RAINSUN.model.entity.comparators.CoachWeightComparator;
import by.BNTU.FITR.RAINSUN.model.entity.comparators.TrainComparator;
import by.BNTU.FITR.RAINSUN.model.logic.Counter;
import by.BNTU.FITR.RAINSUN.model.entity.containers.Depo;
import by.BNTU.FITR.RAINSUN.model.entity.containers.Train;
import by.BNTU.FITR.RAINSUN.model.entity.trains.Coach;
import by.BNTU.FITR.RAINSUN.model.logic.Sorter;
import by.BNTU.FITR.RAINSUN.util.Creator;
import java.util.Comparator;

import java.util.TreeSet;

public class Controll {

    public static void main(String[] args) {

        Comparator n;

        Depo depo = new Depo();

        Creator.createDepo(depo, 3);

//        System.out.println(Counter.calculateTotalCost(depo) + " - total weight");
//        System.out.println(depo);

        //CoachComparator trainComp = new CoachWeightComparator();


//       TreeSet<Coach> depoSet = new TreeSet<>(trainComp);
//        for(Coach train : depo.getDepo().get(0)){
//            depoSet.add(train);
//        }

        System.out.println("\n\tSorted depo:");
        TrainComparator trainComp = new TrainComparator();
        Sorter.sortDepo(depo, trainComp);
        
        System.out.println(depo);
        
        Sorter.sortTrain(depo.getDepo().get(0), 2);
        System.out.println(depo.getDepo().get(0));
    }

}
