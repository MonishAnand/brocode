import java.util.*;
public class And {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int temp=c.nextInt();
        if (temp>30){
            System.out.println("hot");
        } else if (temp>=20 && temp<=30) {
            System.out.println("warm");
        }
        else {
            System.out.println("cold");
        }

    }
}