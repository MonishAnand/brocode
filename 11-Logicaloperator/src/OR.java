import java.util.*;
public class OR {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("press q or Q to quit");
        String r = c.next();
        if (r.equals("q")|| r.equals("Q")){
            System.out.println("quit");
        }
        else {
            System.out.println("still plays");
        }
    }
}
