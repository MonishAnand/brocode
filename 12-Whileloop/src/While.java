import java.util.*;
public class While {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name ="";
        while (name.isBlank()){
            System.out.print("enter your name: ");
            name=s.nextLine();
        }
        System.out.println("hi "+name);
    }
}