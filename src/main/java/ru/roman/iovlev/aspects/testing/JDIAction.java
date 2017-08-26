package ru.roman.iovlev.aspects.testing;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static ru.roman.iovlev.aspects.testing.LogLevels.INFO;

/**
 * Created by Roman_Iovlev on 6/10/2015.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface JDIAction {
    String log() default "";
    LogLevels level() default INFO;
}