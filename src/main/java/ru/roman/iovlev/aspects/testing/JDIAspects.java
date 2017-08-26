package ru.roman.iovlev.aspects.testing;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;

import java.text.MessageFormat;

import static java.lang.String.format;

/**
 * Created by Roman_Iovlev on 7/30/2017.
 */
@SuppressWarnings("unused")
@Aspect
public class JDIAspects {
    public static JFuncTTTTR<String, LogLevels, Object, ProceedingJoinPoint, Object> jdiAction =
            (actionName, logLevel, element, action) -> {
        System.out.println(format("%s for %s", actionName, element.toString()));
        Object result = null;
        try {
             result = action.proceed();
        } catch (Throwable ex) {
            throw new RuntimeException(format("Do action %s failed. Can't get result. Reason: %s", actionName, ex.getMessage()));
        }
        if (result != null)
            System.out.println("Get result: " + result);
        System.out.println("Done");
        return result;
    };

    @Around("execution(* *(..)) && @annotation(ru.roman.iovlev.aspects.testing.JDIAction)")
    public Object action(ProceedingJoinPoint joinPoint) {
        MethodSignature method = (MethodSignature) joinPoint.getSignature();
        JDIAction jdiAnnotation = method.getMethod().getAnnotation(JDIAction.class);
        String actionName = jdiAnnotation.log().equals("")
                ? "Do " + method.getName() + " action"
                : jdiAnnotation.log();
        if (joinPoint.getArgs().length > 0)
            actionName = MessageFormat.format(actionName, joinPoint.getArgs());
        return jdiAction.invoke(actionName, jdiAnnotation.level(), joinPoint.getThis(), joinPoint);
    }
}
