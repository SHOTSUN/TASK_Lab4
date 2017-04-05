package by.BNTU.FITR.RAINSUN.model.entity.containers;

import by.BNTU.FITR.RAINSUN.model.entity.trains.Coach;
import by.BNTU.FITR.RAINSUN.model.exceptions.ExistenceException;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class DepoTest {

    private Depo instance;

    @Before
    public void init() {
        instance = new Depo();
        System.out.println("INIT");
    }

    @After
    public void clear() {
        instance = null;
        System.out.println("CLEARED");
    }

    @Test
    public void testAdd() {
        System.out.println("addTo");
        Train train = new Train();
        instance.add(train);
        int expresult = 1;
        assertEquals(expresult, instance.getDepo().size());

    }

    @Test
    public void testGet() throws ExistenceException{
        System.out.println("getTrain");
        Train train = new Train();
        instance.add(train);
        Train result = instance.getDepo().pick();
        assertEquals(result, train);
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        instance.add(new Train(new Coach(10)));
        String expResult = "\n\tTrains:\nweight = 10;\n";
        assertEquals(instance.toString(), expResult);
    }

}
