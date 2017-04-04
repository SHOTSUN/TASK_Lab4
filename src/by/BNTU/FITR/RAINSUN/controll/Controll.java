package by.BNTU.FITR.RAINSUN.controll;

import by.BNTU.FITR.RAINSUN.model.logic.Counter;
import by.BNTU.FITR.RAINSUN.model.entity.containers.Depo;
import by.BNTU.FITR.RAINSUN.model.entity.containers.Train;
import by.BNTU.FITR.RAINSUN.model.logic.Sorter;
import by.BNTU.FITR.RAINSUN.util.Creator;
import java.util.Comparator;


public class Controll {

    public static void main(String[] args) {
        
        Comparator n;

        Depo depo = new Depo();
        
        Creator.createDepo(depo, 4);
        
        System.out.println(depo.get().get(0));
        /*
        System.out.println(Counter.calculateTotalCost(depo) + " - total weight");

        System.out.println(depo);
*/
        
        Sorter.sortTrain(depo.get().get(0));
        
        System.out.println("\n\n" + depo.get().get(0));
        

    }

}
