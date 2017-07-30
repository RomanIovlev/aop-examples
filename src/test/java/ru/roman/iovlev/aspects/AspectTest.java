package ru.roman.iovlev.aspects;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.roman.iovlev.aspects.testdata.TestClass;

import static ru.roman.iovlev.aspects.Logger.*;

/**
 * Created by Roman_Iovlev on 7/30/2017.
 */
public class AspectTest {
    private TestClass test = new TestClass();

    @Before
    public void before() {
        records.clear();
    }

    @Test
    public void simpleLogTest() {
        test.method();
        Assert.assertEquals(2, records.size());
        Assert.assertEquals("Before step 'method'", records.get(0));
        Assert.assertEquals("After step 'method'", records.get(1));
    }

    @Test
    public void failedStepTest() {
        try {
            test.failedMethod();
        } catch (Exception ignore) { }
        Assert.assertEquals(2, records.size());
        Assert.assertEquals("Before step 'failedMethod'", records.get(0));
        Assert.assertEquals("Log 'failedMethod' failed with exception 'TEST EXCEPTION'", records.get(1));

    }

    @Test
    public void stepWithTitleTest() {
        test.methodWithTitle();
        Assert.assertEquals(2, records.size());
        Assert.assertEquals("Before step 'Test title'", records.get(0));
        Assert.assertEquals("After step 'Test title'", records.get(1));
    }

    @Test
    public void staticStepTest() {
        TestClass.staticMethod();
        Assert.assertEquals(2, records.size());
        Assert.assertEquals("Before step 'staticMethod'", records.get(0));
        Assert.assertEquals("After step 'staticMethod'", records.get(1));
    }

}
