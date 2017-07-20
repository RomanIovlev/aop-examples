package log.example;

/**
 * Created by Roman_Iovlev on 7/19/2017.
 */
@Log
public class CarImpl implements Car {
    @Log
    public void drive() {
        System.out.println("drive method executed");
    }
    @Log
    public void stop() {
        System.out.println("stop method executed");
    }
}
