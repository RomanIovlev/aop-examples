package log.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * Created by Roman_Iovlev on 7/19/2017.
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:spring-config.xml")
class CarTest {

    @Autowired
    Car car;

    @Test
    void driveTest() {
        car.drive();
        car.stop();
    }
}
