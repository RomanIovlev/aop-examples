package ru.roman.iovlev.aspects.testdata;

import ru.roman.iovlev.aspects.testing.JDIAction;

import static ru.roman.iovlev.aspects.testing.LogLevels.ERROR;

/**
 * Created by Roman_Iovlev on 8/4/2017.
 */
public class ActionClass implements ActionInterface {
    @JDIAction
    public void method() {
    }
    @JDIAction(log ="Test Message")
    public void msg() {
    }
    @JDIAction(log ="Test Message", level = ERROR)
    public void log() {
    }
    @JDIAction(log ="Test Message (x,y)=({1}, {0})")
    public void msgWithParams(int x, int y) {
    }
    @JDIAction
    public String result() {
        return "TEST";
    }
    @JDIAction
    public Object obj() {
        return new Object();
    }
    @JDIAction
    public void exception() {
        throw new RuntimeException("TEST EXCEPTION");
    }
}
