import java.util.*;
public class NOT {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("press q or Q to quit");
        String r = c.next();
        if (!r.equals("q")&& !r.equals("Q")){
            System.out.println("still plays");
        }
        else {
            System.out.println("quit");
        }
    }
}