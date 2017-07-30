package ru.roman.iovlev.aspects.testdata;

import ru.roman.iovlev.aspects.Log;

/**
 * Created by Roman_Iovlev on 7/30/2017.
 */
public class TestClass {

    @Log
    public void method() {
    }

    @Log
    public static void staticMethod() {
    }

    @Log
    public void failedMethod() {
        throw new RuntimeException("TEST EXCEPTION");
    }

    @Log("Test title")
    public void methodWithTitle() {
    }
}
