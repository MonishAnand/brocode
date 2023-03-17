import java.util.*;
 abstract class vehicle {
    abstract void info();
}
class car extends vehicle{
     void info(){
         System.out.println("car is a vehicle");
     }
}
class Main{
    public static void main(String[] args) {
        car c = new car();
        c.info();
    }
}