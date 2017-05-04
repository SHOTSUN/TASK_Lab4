package by.bntu1.fitr.rainsun.controll;

import by.bntu1.fitr.rainsun.model.entity.comparators.TrainComparator;
import by.bntu1.fitr.rainsun.model.logic.Counter;
import by.bntu1.fitr.rainsun.model.entity.containers.Depo;
import by.bntu1.fitr.rainsun.model.entity.containers.Train;
import by.bntu1.fitr.rainsun.model.entity.trains.Coach;
import by.bntu1.fitr.rainsun.model.logic.Searcher;
import by.bntu1.fitr.rainsun.model.logic.Sorter;
import by.bntu1.fitr.rainsun.util.Creator;

public class Controll {

    public static void main(String[] args) {

        Depo depo = new Depo();
/*
        Creator.createDepo(depo, 3);

        System.out.println(Counter.calculateTotalCost(depo) + " - total weight");
        System.out.println(depo); 

        System.out.println("\n\tSorted depo:");
        Sorter.sortDepo(depo, new TrainComparator());
        System.out.println(depo);

        Sorter.sortTrain(depo.getDepo().get(0), Sorter.Types.BY_LENGTH);
        System.out.println("Sorted by length :\n" + depo.getDepo().get(0));

        Sorter.sortTrain(depo.getDepo().get(0), Sorter.Types.BY_WEIGHT);
        System.out.println("Sorted by weigth :\n" + depo.getDepo().get(0));
*/
        
        depo.add(new Train(new Coach(30, 40), new Coach(10, 20), new Coach(50, 60), new Coach(20, 20), new Coach(5, 160)));
        
        
        
        int nm = Searcher.searchByVal(depo.getTrain(0), Searcher.Types.WEIGHT, 10);
        
        System.out.println(nm);
        
        System.out.println(depo.getTrain(0).getCoach(nm));
         
    }

}
