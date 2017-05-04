
package by.bntu1.fitr.rainsun.model.entity.comparators;

import by.bntu1.fitr.rainsun.model.entity.trains.Coach;
import java.util.Comparator;

public class CoachLengthComparator implements Comparator<Coach> {
    
    @Override
    public int compare(Coach a, Coach b){
        return a.getLength()- b.getLength();
    }
    
    
    
}
