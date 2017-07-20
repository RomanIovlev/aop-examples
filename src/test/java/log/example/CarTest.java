package log.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by Roman_Iovlev on 7/19/2017.
 */
public class CarTest {

    Car car;

    @BeforeEach
    void setUp() {
        car = new CarImpl();
    }

    @Test
    void driveTest() {
        car.drive();
        car.stop();
    }
}
