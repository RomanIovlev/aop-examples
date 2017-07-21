package log.example;

import org.springframework.stereotype.Component;

/**
 * Created by Roman_Iovlev on 7/19/2017.
 */
@Component("car")
@Log
public class CarImpl implements Car {
    @Log
    @Override
    public void drive() {
    }

    @Log
    @Override
    public void stop() {
    }
}
