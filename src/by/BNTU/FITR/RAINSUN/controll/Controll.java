package by.BNTU.FITR.RAINSUN.controll;

//import by.BNTU.FITR.RAINSUN.model.entity.comparators.CoachWeightComparator;
import by.BNTU.FITR.RAINSUN.model.entity.comparators.TrainComparator;
import by.BNTU.FITR.RAINSUN.model.logic.Counter;
import by.BNTU.FITR.RAINSUN.model.entity.containers.Depo;
import by.BNTU.FITR.RAINSUN.model.entity.containers.Train;
import by.BNTU.FITR.RAINSUN.model.entity.trains.Coach;
import by.BNTU.FITR.RAINSUN.model.logic.Searcher;
import by.BNTU.FITR.RAINSUN.model.logic.Sorter;
import by.BNTU.FITR.RAINSUN.util.Creator;
import java.util.Comparator;

import java.util.TreeSet;

public class Controll {

    public static void main(String[] args){

        Comparator n;

        Depo depo = new Depo();

        //Creator.createDepo(depo, 3);

//        System.out.println(Counter.calculateTotalCost(depo) + " - total weight");
//        System.out.println(depo);

        //CoachComparator trainComp = new CoachWeightComparator();



        /*System.out.println("\n\tSorted depo:");
        Sorter.sortDepo(depo, new TrainComparator());
        System.out.println(depo);
        
        Sorter.sortTrain(depo.getDepo().get(0), Sorter.Types.BY_LENGTH);
        System.out.println("Sorted by length :\n" + depo.getDepo().get(0));
        
        Sorter.sortTrain(depo.getDepo().get(0), Sorter.Types.BY_WEIGHT);
        System.out.println("Sorted by weigth :\n" + depo.getDepo().get(0));
        */
        
        
        depo.add(new Train(new Coach(30, 40), new Coach(10, 20), new Coach(50, 60)));
        //System.out.println(depo.getDepo().get(0));
        
                
        int nm = Searcher.searchByVal(depo.getTrain(0), Searcher.Types.WEIGHT, 10);
        
        System.out.println(depo.getDepo().get(0).get().get(nm));
        
    
        //System.out.println(depo.getDepo().get(0));
    }

}
