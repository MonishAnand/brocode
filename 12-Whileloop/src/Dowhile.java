import java.util.*;
public class Dowhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name ="";
        do {
            System.out.print("enter your name: ");
            name=s.nextLine();
        }while (name.isBlank());
        System.out.println("hi "+name);
    }
}