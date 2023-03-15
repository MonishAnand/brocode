import java.util.*;
public class Main {
    public static void main(String[] args) {
        Car c= new Car();
        Cycle b = new Cycle();
        System.out.println(c.speed);
        c.go();
        c.stop();
        System.out.println(c.doors);
        System.out.println(b.speed);
        b.go();
        b.stop();
        System.out.println(b.pedals);
    }
}