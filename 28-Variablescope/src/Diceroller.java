import java.util.*;
public class Diceroller {
    Random r;//global
    int n;//global
    Diceroller(){
       /*Random r = new Random();
       int n =0; now its local so must parameter it into next method or make it global
        */
        r= new Random();
        roll();
    }
    void roll(){
        n=r.nextInt(6)+1;
        System.out.println(n);
    }

    public static void main(String[] args) {
        Diceroller d = new Diceroller();

    }
}