
package by.BNTU.FITR.RAINSUN.model.entity.comparators;

import by.BNTU.FITR.RAINSUN.model.entity.trains.Coach;
import java.util.Comparator;

public class CoachLengthComparator implements Comparator<Coach> {
    
    @Override
    public int compare(Coach a, Coach b){
        return a.getLength()- b.getLength();
    }
    
    
    
}
