package by.BNTU.FITR.RAINSUN.model.entity.containers;

import by.bntu1.fitr.rainsun.model.entity.containers.Train;
import by.bntu1.fitr.rainsun.model.entity.containers.Depo;
import by.bntu1.fitr.rainsun.model.entity.trains.Coach;
import by.bntu1.fitr.rainsun.model.exceptions.NoElementException;
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
    public void testGet() throws NoElementException {
        System.out.println("getTrain");
        Train train = new Train();
        instance.add(train);
        Train result = instance.getDepo().get(0);
        assertEquals(result, train);
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        instance.add(new Train(new Coach(10, 20)));
        String expResult = "\n\tTrains:\n\n\t10 - Train weight\nweight = 10, "
                + "length = 20;\n";
        assertEquals(instance.toString(), expResult);
    }

}
