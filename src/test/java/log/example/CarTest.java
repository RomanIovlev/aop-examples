package log.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static log.example.TestUtil.fromSystemOut;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

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
        assertThat(fromSystemOut(car::drive), is("drive method executed\n"));
    }

    @Test
    void stopTest() {
        assertThat(fromSystemOut(car::stop), is("stop method executed\n"));
    }
}
