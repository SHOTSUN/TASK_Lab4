package by.BNTU.FITR.RAINSUN.model.entity.collsections;

import by.BNTU.FITR.RAINSUN.model.exceptions.ExistenceException;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class StackOfArrayTest {

    private StackOfArray instance;

    @Before
    public void init() {
        instance = new StackOfArray();
        System.out.println("INIT");
    }

    @After
    public void clear() {
        instance = null;
        System.out.println("CLEARED");
    }

    @Test(expected = ExistenceException.class)
    public void testGetFail() throws ExistenceException {
        System.out.println("getFail");
        instance.pop();
    }

    @Test(expected = ExistenceException.class)
    public void testShowFail() throws ExistenceException {
        System.out.println("showFail");
        instance.pick();
    }

    @Test
    public void testGet() throws ExistenceException {
        System.out.println("get");
        int expResult = 20;
        instance.push(10);
        instance.push(20);
        instance.push(30);
        instance.pop();
        assertEquals(expResult, instance.pick());

    }

    @Test
    public void testSize() {
        System.out.println("size");
        int expResult = 3;
        instance.push(10);
        instance.push(20);
        instance.push(30);
        int result = instance.size();
        assertEquals(expResult, result);
    }

    @Test
    public void testShow() throws ExistenceException {
        System.out.println("show");
        int expResult = 30;
        instance.push(10);
        instance.push(20);
        instance.push(30);
        assertEquals(expResult, instance.pick());
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "\n10\t";
        instance.push(10);
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    @Test
    public void testToEmptyString() {
        System.out.println("toString");
        String expResult = "STACK HAS NO ELEMENTS";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

}
