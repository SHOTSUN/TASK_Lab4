package by.BNTU.FITR.RAINSUN.model.entity.comparators;

import by.bntu1.fitr.rainsun.model.entity.comparators.CoachWeightComparator;
import by.bntu1.fitr.rainsun.model.entity.trains.Coach;
import org.junit.Test;
import static org.junit.Assert.*;

public class CoachWeightComparatorTest {

    public CoachWeightComparatorTest() {
    }

    @Test
    public void testCompare() {

        System.out.println("WeightСompare");
        Coach a = new Coach(10, 50);
        Coach b = new Coach(30, 30);
        CoachWeightComparator instance = new CoachWeightComparator();
        int expResult = -20;
        int result = instance.compare(a, b);
        assertEquals(expResult, result);
    }

}
