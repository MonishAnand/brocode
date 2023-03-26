class vehicle{
public void go(){

}
}
class car extends vehicle{
    public void go(){
        System.out.println("car is moving");
    }
}
class bike extends vehicle{
    public void go(){
        System.out.println("bike is moving");
    }
}
class boat extends vehicle{
    public void go(){
        System.out.println("boat is moving");
    }
}
public class Main {
    public static void main(String[] args) {
        car c = new car();
        bike b = new bike();
        boat f = new boat();
        vehicle[] racers={c,b,f};
        for (vehicle x:racers){
            x.go();
        }
    }
}