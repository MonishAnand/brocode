import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("what's ur name?");
        String name = c.nextLine();
        System.out.println("what's ur age?");
        int age = c.nextInt();
        c.nextLine();
        System.out.println("what's ur fav food?");
        String food = c.nextLine();
        System.out.println("hi "+name);
        System.out.println("ur "+age+" years old");
        System.out.println("ur fav food is "+food);

    }
}