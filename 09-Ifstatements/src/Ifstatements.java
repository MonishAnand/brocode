import  java.util.*;
public class Ifstatements {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int age = c.nextInt();
        if (age>=75){
            System.out.println("boomer");
        } else if (age>=18) {
            System.out.println("adult");
        } else if (age>=13) {
            System.out.println("teen");
        }
        else {
            System.out.println("child");
        }
    }
}