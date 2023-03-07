import java.util.*;
public class Mathclass {
    public static void main(String[] args) {
       double x;
       double y;
       double z;
        Scanner c = new Scanner(System.in);
        System.out.println("enter x");
        x=c.nextDouble();
        System.out.println("enter y");
        y=c.nextDouble();
        z=Math.sqrt((x*x)+(y*y));
        System.out.println("the hypotenuse is "+z);
        c.close();

    }
}