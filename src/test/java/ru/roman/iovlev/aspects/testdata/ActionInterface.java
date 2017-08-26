package ru.roman.iovlev.aspects.testdata;

import ru.roman.iovlev.aspects.Log;

/**
 * Created by Roman_Iovlev on 8/26/2017.
 */
public interface ActionInterface {

    @Log
    default boolean someAction() { return true; }
}
