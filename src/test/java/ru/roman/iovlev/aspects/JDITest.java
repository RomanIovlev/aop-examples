package ru.roman.iovlev.aspects;

import org.junit.Test;
import ru.roman.iovlev.aspects.testdata.ActionClass;

import static ru.roman.iovlev.aspects.testing.JDIAspects.*;

/**
 * Created by Roman_Iovlev on 8/4/2017.
 */
public class JDITest {
    private ActionClass a = new ActionClass();

    @Test
    public void jdiTest() {
        System.out.println("Start jdi test");
        scenario();
    }
    @Test
    public void modifiedTest() {
        System.out.println("Start modified test");
        jdiAction = (actionName, logLevel, element, action) ->
        {
            System.out.println("MODIFIED");
            return null;
        };
        scenario();
    }

    private void scenario() {
        a.method();
        a.msg();
        a.log();
        a.msgWithParams(1, 3);
        a.result();
        a.obj();
        try {
            a.exception();
        } catch (Exception ex) { }
    }
    @Override
    public String toString() {
        return "Scenario()";
    }
}
