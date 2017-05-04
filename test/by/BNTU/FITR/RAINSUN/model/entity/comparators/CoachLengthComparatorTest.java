package by.BNTU.FITR.RAINSUN.model.entity.comparators;

import by.bntu1.fitr.rainsun.model.entity.comparators.CoachLengthComparator;
import by.bntu1.fitr.rainsun.model.entity.trains.Coach;

import org.junit.Test;
import static org.junit.Assert.*;

public class CoachLengthComparatorTest {

    public CoachLengthComparatorTest() {
    }

    @Test
    public void testLengthCompare() {
        System.out.println("LengthСompare");
        Coach a = new Coach(10, 50);
        Coach b = new Coach(30, 30);
        CoachLengthComparator instance = new CoachLengthComparator();
        int expResult = 20;
        int result = instance.compare(a, b);
        assertEquals(expResult, result);
    }

}
