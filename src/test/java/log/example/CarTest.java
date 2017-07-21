package log.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static log.example.TestUtil.fromSystemOut;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

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
        assertThat(fromSystemOut(car::drive), is("drive method executed\n"));
    }

    @Test
    void stopTest() {
        assertThat(fromSystemOut(car::stop), is("stop method executed\n"));
    }
}
