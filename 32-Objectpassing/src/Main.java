import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Garage g = new Garage();
        Car c1 = new Car("BMW");
        Car c2 = new Car("tesla");
       g.park(c1);
       g.park(c2);
    }
}