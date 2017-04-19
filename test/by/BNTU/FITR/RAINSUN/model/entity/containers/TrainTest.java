package by.BNTU.FITR.RAINSUN.model.entity.containers;

import by.BNTU.FITR.RAINSUN.model.entity.trains.Coach;
import by.BNTU.FITR.RAINSUN.model.exceptions.ExistenceException;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class TrainTest {

    private Train instance;

    @Before
    public void init() {
        instance = new Train();
        System.out.println("INIT");
    }

    @After
    public void clear() {
        instance = null;
        System.out.println("CLEARED");
    }

    @Test
    public void testAddTo() {
        System.out.println("addTo");
        Coach coach = new Coach();
        instance.add(coach);
        int expresult = 1;
        assertEquals(expresult, instance.get().size());

    }

    @Test
    public void testGetTrain() throws ExistenceException {
        System.out.println("getTrain");
        Coach coach = new Coach();
        instance.add(coach);
        Coach result = instance.get().get(0);
        assertEquals(coach, result);
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "\n\t0 - Train weight\nweight = 0, length = 0;\n";
        instance.add(new Coach());
        assertEquals(expResult, instance.toString());
    }

}
