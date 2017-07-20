package log.example;

/**
 * Created by Roman_Iovlev on 7/19/2017.
 */
public class HelloWorld {

    public static void main(String[] args) {
        Car car = new CarImpl();
        car.drive();
        car.stop();
    }
}
