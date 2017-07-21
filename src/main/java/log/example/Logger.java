package log.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Logger {

    @Before("execution(* CarImpl.*(..))")
    public void log(JoinPoint joinPoint) {
        System.out.printf("%s method executed%n", joinPoint.getSignature().getName());
    }
}
