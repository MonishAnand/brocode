import java.util.Random;

public class Vehicle{
    Random r = new Random();
    double speed=r.nextInt(500);
    void go(){
        System.out.println("the vehicle is moving");
    }
    void stop(){
        System.out.println("the vehicle is stopped");
    }
}