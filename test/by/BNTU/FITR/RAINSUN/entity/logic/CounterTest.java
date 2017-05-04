package by.BNTU.FITR.RAINSUN.entity.logic;

import by.bntu1.fitr.rainsun.model.logic.Counter;
import by.bntu1.fitr.rainsun.model.entity.trains.Coach;
import by.bntu1.fitr.rainsun.model.entity.containers.Depo;
import by.bntu1.fitr.rainsun.model.entity.containers.Train;
import org.junit.Test;
import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void testCalculateNullTotalCost() {
        System.out.println("calculateTotalCostNull");
        int expResult = 0;
        int result = Counter.calculateTotalCost(null);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalculateTotalCost() {
        System.out.println("calculateTotalCost");
        Depo depo = new Depo();
        int expResult = 0;
        int result = Counter.calculateTotalCost(depo);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalculateTotalCostAnother() {
        System.out.println("calculateTotalCostAnother");
        
        Depo depo = new Depo();
        
        Train train1 = new Train();
        Train train2 = new Train();
        
        Coach coach = new Coach(10, 20);
        
        
        train1.add(new Coach[] {coach, coach, coach});
        
        train2.add(coach, coach, coach, coach, coach, coach);
        
        depo.add(train1, train2);
        
        int expResult = 90;
        int result = Counter.calculateTotalCost(depo);
        assertEquals(expResult, result);
    }
    

    
    
}
