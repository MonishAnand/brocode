import java.util.*;
public class Car {
    String name ="audi";
    String color= "red";
    int year = 2021;
    public String toString(){
        return  name+"\n"+color+"\n"+year;

    }
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.toString());

    }
}