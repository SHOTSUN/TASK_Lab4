
package by.BNTU.FITR.RAINSUN.model.logic;

import by.BNTU.FITR.RAINSUN.model.entity.trains.Coach;
import java.util.Comparator;

public class CoachComparator implements Comparator<Coach> {
    
    @Override
    public int compare(Coach a, Coach b){
        return a.getWeight() - b.getWeight();
    }
    
    
}
